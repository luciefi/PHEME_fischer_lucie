package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The return value from the operation is a list of strings,
 * that may contain many duplications.
 * The implementation does not need to order the list.
 */
public interface ISymptomReader {
    /**
     * Reads data from symptoms file; if no data is available, returns an empty List.
     *
     * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
     */
    List<String> getSymptoms();
}
