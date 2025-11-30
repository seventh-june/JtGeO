package net.junedev.junetech_geo.worldgen.cached;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public abstract class CachedPool<K, V>{

    private final ConcurrentHashMap<K, Value<V>> cache;
    private final long lifetime;
    private final long interval;
    private final TimerTask clearCacheTask = new TimerTask() {
        @Override
        public void run() {
            long now = System.currentTimeMillis();
            if(!cache.isEmpty()) {
                Iterator<Map.Entry<K, Value<V>>> iterator = cache.entrySet().iterator();
                while (iterator.hasNext()) {
                    long expiry = lifetime + iterator.next().getValue().lastActive;
                    if (now > expiry) {
                        iterator.remove();
                    }
                }
            }
        }
    };

    public CachedPool(long lifetime, long cleanInterval, int size){
        cache = new ConcurrentHashMap<>(size);
        this.lifetime = lifetime;
        this.interval = cleanInterval;
        setupCleanUpProcess();
    }

    public V get(K key) {
        return cache.get(key).getValue();
    }

    public V put(K key, V value){
        cache.put(key, new Value<>(value));
        return value;
    }

    public void putIfAbsent(K key, V value){
        Objects.requireNonNull(cache.putIfAbsent(key, new Value<>(value))).getValue();
    }

    public void release(K key) {
        try {
            cache.remove(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int size(){
        return cache.size();
    }
    public void clear() {
        cache.clear();
    }
    public boolean has(K key){
        return cache.containsKey(key);
    }

    //creates a thread for the releasing of resources;
    private void setupCleanUpProcess(){
        new Timer(true).scheduleAtFixedRate(clearCacheTask, interval, interval);
    }

    //Holds the object and last time active
    private static class Value<V>{

        long lastActive;
        V value;

        Value(V value){
            lastActive = System.currentTimeMillis();
            this.value = value;
        }

        V getValue(){
            lastActive = System.currentTimeMillis();
            return this.value;
        }

    }

}
