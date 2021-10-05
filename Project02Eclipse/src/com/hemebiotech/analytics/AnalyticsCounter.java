package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

    public static void main(String args[]) throws Exception {

        // Read symptoms from file
        ISymptomReader symptomDataReader = new SymptomDataFileReader("./Project02Eclipse/symptoms.txt");
        List<String> symptomsList = symptomDataReader.getSymptoms();

        // Count and sort symptoms
        ISymptomCounter symptomDataCounter = new SymptomListTreeCounter(symptomsList);
        Map<String, Integer> symptomsCount = symptomDataCounter.getSymptomsCount();

        // Write counted symptoms to output file

        /*
        BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
        String line = reader.readLine();

        int i = 0;    // set i to 0
        int headCount = 0;    // counts headaches
        while (line != null) {
            i++;    // increment i
            System.out.println("symptom from file: " + line);
            if (line.equals("headache")) {
                headCount++;
                System.out.println("number of headaches: " + headCount);
            } else if (line.equals("rush")) {
                rashCount++;
            } else if (line.contains("pupils")) {
                pupilCount++;
            }

            line = reader.readLine();    // get another symptom
        }

        // next generate output
        FileWriter writer = new FileWriter("result.out");
        writer.write("headache: " + headacheCount + "\n");
        writer.write("rash: " + rashCount + "\n");
        writer.write("dialated pupils: " + pupilCount + "\n");
        writer.close();

         */
    }
}
