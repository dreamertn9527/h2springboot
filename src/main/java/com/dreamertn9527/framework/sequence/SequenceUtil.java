package com.dreamertn9527.framework.sequence;

import java.util.HashMap;
import java.util.Map;

public class SequenceUtil {
    private Sequence defaultSequence;
    private Map<String,Sequence> sequenceMap=new HashMap<>();

    public Sequence getDefaultSequence() {
        return defaultSequence;
    }

    public void setDefaultSequence(Sequence defaultSequence) {
        this.defaultSequence = defaultSequence;
    }

    public Map<String, Sequence> getSequenceMap() {
        return sequenceMap;
    }

    public void setSequenceMap(Map<String, Sequence> sequenceMap) {
        this.sequenceMap = sequenceMap;
    }

    public long getSequence(String name){
        Sequence sequence =null ;
        if(sequenceMap!=null){
            sequence =sequenceMap.get(name);
        }
        if(sequence ==null){
            return defaultSequence.get(name);
        }
        return sequence.get(name);
    }
}