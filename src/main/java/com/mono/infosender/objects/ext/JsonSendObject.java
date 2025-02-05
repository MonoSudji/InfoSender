package com.mono.infosender.objects.ext;

import com.mono.infosender.objects.AbsJsonSendObject;

import java.lang.reflect.Field;
import java.util.List;

public class JsonSendObject<T> extends AbsJsonSendObject<T> {
    @Override
    public String toJson() {
        Class clazz = getObject().getClass();
        List<Field> fields = List.of(clazz.getDeclaredFields());
        StringBuilder json = new StringBuilder("{");
        for (Field field : fields) {
            try {
                json.append("\"").append(field.getName()).append("\":\"").append(field.get(getObject())).append("\",");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.deleteCharAt(json.length() - 1);
        json.append("}");
        return json.toString();
    }
}
