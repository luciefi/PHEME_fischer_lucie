package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will count symptom data from a list and store the result in a Map.
 */
public interface ISymptomCounter {
    /**
     * Counts data from symptoms list.
     *
     * @return a Map with the symptom as key and the count associated to the symptom as value.
     */
    Map<String, Integer> getSymptomsCount();
}
