package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Application that counts the number of occurrence for each symptom in a source
 */
public class AnalyticsCounter {

    public static void main(String args[]) throws Exception {

        // Read symptoms from file
        ISymptomReader symptomDataReader =Injector.provideSymptomReader();
        List<String> symptomsList = symptomDataReader.getSymptoms();

        // Count and sort symptoms
        ISymptomCounter symptomDataCounter = Injector.provideSymptomCounter(symptomsList);
        Map<String, Integer> symptomsCount = symptomDataCounter.getSymptomsCount();

        // Write counted symptoms to output file
        ISymptomWriter symptomDataWriter = Injector.provideSymptomWriter(symptomsCount);
        symptomDataWriter.writeSymptoms();

    }
}
