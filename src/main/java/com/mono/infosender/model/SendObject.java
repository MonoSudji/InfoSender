package com.mono.infosender.model;

import java.lang.reflect.Field;
import java.util.List;

public class SendObject<T> extends AbsSendObject<T>{
    @Override
    public String toJson() {
        Class clazz = getObject().getClass();
        List<Field> fields = List.of(clazz.getFields());
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
