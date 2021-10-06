package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Injector {
    public static ISymptomReader provideSymptomReader() {
        return new SymptomDataFileReader("./Project02Eclipse/symptoms.txt");
    }

    public static ISymptomCounter provideSymptomCounter(List symptomsList) {
        return new SymptomListTreeCounter(symptomsList);
    }

    public static ISymptomWriter provideSymptomWriter(Map symptomsCount) {
        return new SymptomOutputFileWriter(symptomsCount, "./Project02Eclipse/result.txt");
    }
}
