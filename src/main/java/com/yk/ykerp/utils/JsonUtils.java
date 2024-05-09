package com.yk.ykerp.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class JsonUtils {

    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);

    /**
     * 序列化
     * @param o
     * @return
     * @throws JsonProcessingException
     */
    public static String writeJson(Object o)  {
        try {
            return OBJECT_MAPPER.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    /**
     * 序列化
     * @param o
     * @return
     * @throws JsonProcessingException
     */
    public static Map objToMap(Object o) {
        String s = null;
        try {
            s = OBJECT_MAPPER.writeValueAsString(o);
            return OBJECT_MAPPER.readValue(s, Map.class);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * 反序列化
     * @param json
     * @param javaType
     * @return
     * @param <T>
     * @throws IOException
     */
    public static <T> T readJson(String json , JavaType javaType) {
        try {
            return OBJECT_MAPPER.readValue(json, javaType);
        } catch (IOException e) {
            return null;
        }
    }
}
