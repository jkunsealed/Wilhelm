/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.data;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Overview of files.
 */
public class FileLister {

    private static final String DOT = ".";

    /**
     * Returns filenames.
     *
     * @param path      directory where to look for files.
     * @param extension case-sensitive extension
     * @return Names of files.
     */
    @NotNull
    public List<String> getFilenames(@NotNull String path, @NotNull String extension) {
        List<String> filenames = new ArrayList<>();
        File directory = new File(path);
        File[] fileList = directory.listFiles();
        if (fileList != null) {
            for (File file : fileList) {
                if (file.isFile() && file.getName().contains(DOT + extension)) {
                    filenames.add(file.getName());
                }
            }
        }
        return filenames;
    }
}
