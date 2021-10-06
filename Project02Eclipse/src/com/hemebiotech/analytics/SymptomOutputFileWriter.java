package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Implementation of ISymptomWriter that writes in an output file.
 */
public class SymptomOutputFileWriter implements ISymptomWriter {

    private Map<String, Integer> symptomsCount;
    private String outputFilePath;

    /**
     * SymptomOutputFileWriter constructor
     *
     * @param symptomsCount  a map with symptom strings in it.
     * @param outputFilePath a full or partial path to file where the results will be written.
     */
    public SymptomOutputFileWriter(Map<String, Integer> symptomsCount, String outputFilePath) {
        this.symptomsCount = symptomsCount;
        this.outputFilePath = outputFilePath;
    }

    /**
     * Write symptoms count to file
     */
    @Override
    public void writeSymptoms() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            for (Map.Entry<String, Integer> entry : symptomsCount.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
