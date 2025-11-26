package net.junedev.junetech_geo.api.materials;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import net.junedev.junetech_geo.api.interfaces.ICondition;
import net.junedev.junetech_geo.api.interfaces.ISubTagContainer;

public final class SubTag implements ICondition<ISubTagContainer> {

    public static final HashMap<String, SubTag> sSubTags = new HashMap<>();
    private static long sSubtagID = 0;
    public final long mSubtagID;
    public final String mName;
//TODO: if this material can be used for weak tools
    public static final SubTag WEAKTOOL = getNewSubTag("WEAKTOOL");
    //TODO: if this material can be used for stronger tools
    public static final SubTag TOUGHTOOL = getNewSubTag("TOUGHTOOL");
    //TODO:
    public static final SubTag NANOMINERAL = getNewSubTag("NANOMINERAL");

    //TODO:
    public static final SubTag SILICATE = getNewSubTag("SILICATE");
    //TODO:
    public static final SubTag ALUMINOSILICATE = getNewSubTag("ALUMINOSILICATE");
    //TODO:
    public static final SubTag CLAYMINERAL = getNewSubTag("CLAYMINERAL");
    //TODO:
    public static final SubTag METAMINERAL = getNewSubTag("METAMINERAL");
    //TODO:
    public static final SubTag FUEL = getNewSubTag("FUEL");
    //TODO: if this material can be cooked directly into a metal
    public static final SubTag OREDIRECT = getNewSubTag("OREDIRECT");
    //TODO: if this mineral can be melted directly into a unique melt.
    public static final SubTag HASMOLTENMINERAL = getNewSubTag("HASMOLTENMINERAL");
    //TODO:
    public static final SubTag GLASS = getNewSubTag("GLASS");
    //TODO:
    public static final SubTag MAGNETIC = getNewSubTag("MAGNETIC");

    //TODO:
    public static final SubTag FELSIC = getNewSubTag("FELSIC");
    //TODO:
    public static final SubTag INTERMEDIATE = getNewSubTag("INTERMEDIATE");
    //TODO:
    public static final SubTag MAFIC = getNewSubTag("MAFIC");
    //TODO:
    public static final SubTag ULTRAMAFIC = getNewSubTag("ULTRAMAFIC");
    //TODO:
    public static final SubTag VOLCANIC = getNewSubTag("VOLCANIC");
    //TODO:
    public static final SubTag PLUTONIC = getNewSubTag("PLUTONIC");
    //TODO:
    public static final SubTag CLASTIC = getNewSubTag("CLASTIC");
    //TODO:
    public static final SubTag CARBONATE = getNewSubTag("CARBONATE");
    //TODO:
    public static final SubTag VOLCANICLASTIC = getNewSubTag("VOLCANICLASTIC");
    //TODO:
    public static final SubTag METASEDIMENTARY = getNewSubTag("METASEDIMENTARY");
    //TODO:
    public static final SubTag METEORIC = getNewSubTag("METEORIC");

    public final Collection<ISubTagContainer> mRelevantTaggedItems = new HashSet<>(1);

    private SubTag(String aName) {
        mSubtagID = sSubtagID++;
        mName = aName;
        sSubTags.put(aName, this);
    }

    public static SubTag getNewSubTag(String aName) {
        for (SubTag tSubTag : sSubTags.values()) if (tSubTag.mName.equals(aName)) return tSubTag;
        return new SubTag(aName);
    }

    @Override
    public String toString() {
        return mName;
    }

    public SubTag addContainerToList(ISubTagContainer... aContainers) {
        if (aContainers != null) for (ISubTagContainer aContainer : aContainers)
            if (aContainer != null && !mRelevantTaggedItems.contains(aContainer)) mRelevantTaggedItems.add(aContainer);
        return this;
    }

    public SubTag addTo(ISubTagContainer... aContainers) {
        if (aContainers != null)
            for (ISubTagContainer aContainer : aContainers) if (aContainer != null) aContainer.add(this);
        return this;
    }

    @Override
    public boolean isTrue(ISubTagContainer aObject) {
        return aObject.contains(this);
    }
}