package com.asifsid88.utilities;

public class StringUtils {
    public StringUtils() {
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null?true:str.trim().length() == 0;
    }

    public static String replace(String str, String key, String value) {
        StringBuilder result = new StringBuilder();
        result.append(str);
        int start = result.indexOf(key);
        int end = start + key.length();
        result.replace(start, end, value);
        return result.toString();
    }
}
