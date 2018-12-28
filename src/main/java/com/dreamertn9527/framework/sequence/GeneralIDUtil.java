package com.dreamertn9527.framework.sequence;

import java.util.HashMap;
import java.util.Map;

public class GeneralIDUtil {
    private GeneralID defaultGeneralID;
    private Map<String,GeneralID> sequenceMap=new HashMap<>();

    public GeneralID getDefaultGeneralID() {
        return defaultGeneralID;
    }

    public void setDefaultGeneralID(GeneralID defaultGeneralID) {
        this.defaultGeneralID = defaultGeneralID;
    }

    public Map<String, GeneralID> getSequenceMap() {
        return sequenceMap;
    }

    public void setSequenceMap(Map<String, GeneralID> sequenceMap) {
        this.sequenceMap = sequenceMap;
    }

    public long getSequence(String name){
        GeneralID generalID =null ;
        if(sequenceMap!=null){
            generalID =sequenceMap.get(name);
        }
        if(generalID ==null){
            return defaultGeneralID.get(name);
        }
        return generalID.get(name);
    }
}