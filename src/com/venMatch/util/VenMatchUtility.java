package com.venMatch.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class VenMatchUtility<T> {

    public static <T> List<T> readFromCSV(String filePath, Class<T> clazz) {
        List<T> result = new ArrayList<>();
        String line;
        String[] headers = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            if ((line = br.readLine()) != null) {
                headers = line.split(",");
            }

            while ((line = br.readLine()) != null && headers != null) {
                String[] values = line.split(",");
                T item = clazz.getDeclaredConstructor().newInstance();

                for (int i = 0; i < headers.length && i < values.length; i++) {
                    Field field = clazz.getDeclaredField(headers[i].trim());
                    field.setAccessible(true); // Allow private fields to be set
                    field.set(item, convertValue(values[i], field.getType())); // Set the field value
                }
                result.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private static Object convertValue(String value, Class<?> targetType) {
        if (targetType == String.class) {
            return value;
        } else if (targetType == Integer.class) {
            return Integer.parseInt(value);
        } else if (targetType == Double.class) {
            return Double.parseDouble(value);
        }
        return value;
    }
}
