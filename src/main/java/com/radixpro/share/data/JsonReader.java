/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.data;

import com.radixpro.share.exceptions.ReadingException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reads an object from a JSON file.
 */
public class JsonReader {

    /**
     * Read object from JSON.
     *
     * @param inputData file tyhat contains the inputted data.
     * @return JSONObject presentation of data in the JSON file.
     * @throws ReadingException in case of a parse error or an I/O error.
     */
    @NotNull
    public JSONObject readFromFile(@NotNull File inputData) throws ReadingException {
        JSONParser parser = new JSONParser();
        try {
            Object object = parser.parse(new FileReader(inputData));
            return (JSONObject) object;
        } catch (ParseException pe) {
            // TODO add logging
            throw new ReadingException("Could not parse results of : " + inputData + " . Original message " + pe.getMessage());
        } catch (IOException ioe) {
            // TODO add logging
            throw new ReadingException("Could not read file : " + inputData + " . Original message " + ioe.getMessage());
        }
    }
}