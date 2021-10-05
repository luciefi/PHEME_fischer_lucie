package com.hemebiotech.analytics;

/**
 * Anything that will write symptom data count to an output.
 */
public interface ISymptomWriter {
    /**
     * Writes data from symptoms map.
     */
    void writeSymptoms();
}
