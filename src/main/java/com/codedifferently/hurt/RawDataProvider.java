package com.codedifferently.hurt;

import org.apache.commons.io.IOUtils;

public class RawDataProvider {
    public  String readRawDataToString() {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
                return result;

        }
        catch (Exception e){
            return null;
        }
    }
}
