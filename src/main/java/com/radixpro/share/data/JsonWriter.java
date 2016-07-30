/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.radixpro.share.exceptions.PersistencyException;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.IOException;

/**
 * Writes an object to file using Json format.
 * Based on an example at: http://www.studytrails.com/java/json/jackson-create-json.jsp
 */
public class JsonWriter {

    /**
     * Writes object to file.
     *
     * @param pathFilename file name including path.
     * @param object2Write the object that will be written.
     * @param useIndent    tru for indenting the output, otherwise false.
     * @throws PersistencyException
     */
    public void write2File(@NotNull final String pathFilename,
                           @NotNull final Object object2Write,
                           final boolean useIndent) throws PersistencyException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, useIndent);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        try {
            File jsonFile = new File(pathFilename);
            mapper.writeValue(jsonFile, object2Write);
        } catch (IOException e) {
            // TODO log this
            throw new PersistencyException("Could not write to file, using path and filename :" + pathFilename +
                    " . Original message: " + e.getMessage());
        }
    }
}
