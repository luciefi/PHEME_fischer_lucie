package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of ISymptomWriter that reads symptoms from a file.
 */
public class SymptomDataFileReader implements ISymptomReader {

    private String filePath;

    /**
     * SymptomDataFileReader constructor
     *
     * @param filePath a full or partial path to file with symptom strings in it, one per line.
     */
    public SymptomDataFileReader(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Reads data from symptoms file; if no data is available, returns an empty List.
     *
     * @return an ArrayList of all Symptoms obtained from a data source, duplicates are possible/probable.
     */
    @Override
    public List<String> getSymptoms() {
        ArrayList<String> symptomsList = new ArrayList<>();

        if (filePath == null) {
            return symptomsList;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            while (line != null) {
                symptomsList.add(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return symptomsList;
    }

}
