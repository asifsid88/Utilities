package com.asifsid88.utilities;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class JSONUtils {
    public JSONUtils() {
    }

    public static String toJSON(Object object) {
        if(ObjectUtils.isNull(object)) {
            return "";
        } else {
            Gson gson = new Gson();
            return gson.toJson(object);
        }
    }

    public static Map<String, Object> fromJSONToObject(String json) {
        Object map = new HashMap();
        if(!StringUtils.isNullOrEmpty(json)) {
            Gson gson = new Gson();
            map = (Map)gson.fromJson(json, Map.class);
        }

        return (Map)map;
    }

    public static List<Map<String, Object>> fromJSONToArray(String json) {
        Object list = new LinkedList();
        if(!StringUtils.isNullOrEmpty(json)) {
            Gson gson = new Gson();
            list = (List)gson.fromJson(json, List.class);
        }

        return (List)list;
    }
}
