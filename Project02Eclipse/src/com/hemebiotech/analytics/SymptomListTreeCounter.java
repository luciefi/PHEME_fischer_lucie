package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class SymptomListTreeCounter implements ISymptomCounter {

    private List<String> symptomsList;

    /**
     * SymptomListCounter constructor
     *
     * @param symptomsList a list with symptom strings in it
     */
    public SymptomListTreeCounter(List<String> symptomsList) {
        this.symptomsList = symptomsList;
    }

    /**
     * Count data from symptoms list;
     *
     * @return a TreeMap with the symptom as key and the count associated to the symptom as value
     */
    @Override
    public TreeMap<String, Integer> getSymptomsCount() {
        TreeMap<String, Integer> symptomsCount = new TreeMap<>();

        for (String line : symptomsList) {
            if (symptomsCount.containsKey(line)) {
                symptomsCount.replace(line, symptomsCount.get(line) + 1);
            } else {
                symptomsCount.put(line, 1);
            }
        }
        return symptomsCount;
    }
}
