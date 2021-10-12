package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Implementation of dependency injection pattern for AnalyticsCounter
 */
public class Injector {

    /**
     * Provides an instance of a class implementing the interface ISymptomReader
     */
    public static ISymptomReader provideSymptomReader() {
        return new SymptomDataFileReader("./Project02Eclipse/symptoms.txt");
    }

    /**
     * Provides an instance of a class implementing the interface ISymptomCounter
     *
     * @param symptomsList a list with symptom strings in it.
     */
    public static ISymptomCounter provideSymptomCounter(List<String> symptomsList) {
        return new SymptomListTreeCounter(symptomsList);
    }

    /**
     * Provides an instance of a class implementing the interface ISymptomWriter
     *
     * @param symptomsCount a map with symptom strings as key and their count as value.
     */
    public static ISymptomWriter provideSymptomWriter(Map<String, Integer> symptomsCount) {
        return new SymptomOutputFileWriter(symptomsCount, "./Project02Eclipse/result.txt");
    }
}
