package it.uniroma2.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result1 implements Serializable{

    private Date timestamp;
    private String cella;
    private Map<String, Integer> resultMap; // K e' il tipo delle navi, V sono le navi contate per quel tipo

    public Result1(Map<String, List<String>> mapTrips ){
        resultMap = new HashMap<>();
        for ( String type : mapTrips.keySet() ){
            resultMap.put( type, mapTrips.get(type).size()); // prendi il conteggio
        }
    }

    public Result1(Date timestamp, String cella, Map<String, Integer> resultMap) {
        this.timestamp = timestamp;
        this.cella = cella;
        this.resultMap = resultMap;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getCella() {
        return cella;
    }

    public void setCella(String cella) {
        this.cella = cella;
    }

    public Map<String, Integer> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<String, Integer> resultMap) {
        this.resultMap = resultMap;
    }
}
