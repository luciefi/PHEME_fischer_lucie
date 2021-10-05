package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class SymptomDataFileReader implements ISymptomReader {

    private String filepath;

    /**
     * SymptomDataFileReader constructor
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public SymptomDataFileReader(String filepath) {
        this.filepath = filepath;
    }


    /**
     * Reads data from symptoms file; if no data is available, return an empty List
     *
     * @return an ArrayList of all Symptoms obtained from a data source, duplicates are possible/probable
     */
    @Override
    public List<String> getSymptoms() {
        ArrayList<String> symptomsList = new ArrayList<String>();

        if (filepath == null) {
            return symptomsList;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(filepath))) {
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
