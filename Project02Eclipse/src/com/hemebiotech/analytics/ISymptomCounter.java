package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

/**
 * Anything that will count symptom data from a list
 */
public interface ISymptomCounter {
    /**
     * Count data from symptoms list;
     *
     * @return a Map with the symptom as key and the count associated to the symptom as value
     */
    Map<String, Integer> getSymptomsCount();
}
