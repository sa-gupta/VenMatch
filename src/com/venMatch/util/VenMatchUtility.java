package com.venMatch.util;

import com.venMatch.dto.OutputDto;
import com.venMatch.dto.VenueDto;
import com.venMatch.model.Customer;
import com.venMatch.model.Venue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VenMatchUtility<T> {

    public static <T> List<T> readFromCSV(String filePath, Class<T> clazz) throws Exception {
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
            throw new Exception(e);
        }
        return result;
    }

    public static void writeCsv(String filename, List<OutputDto> outputDtos) throws IOException {
        FileWriter csvWriter = new FileWriter(filename);
        csvWriter.append("Name,Venue for three occupancy,Cost for three occupancy,Room needed for three occupancy," +
                "Venue for four occupancy,Cost for four occupancy,Room needed for four occupancy\n");

        for (OutputDto dto : outputDtos) {
            String custName = dto.getCustName();
            List<VenueDto> venuesForThree = dto.getVenueForThreeOccupancy();
            List<VenueDto> venuesForFour = dto.getVenueForFourOccupancy();
            int maxRows = Math.max(venuesForThree.size(), venuesForFour.size());

            for (int i = 0; i < maxRows; i++) {
                String name = (i == 0) ? custName : "";

                // Get the venue for three occupancy without cost
                String venueForThree = (i < venuesForThree.size()) ? venuesForThree.get(i).getName() : "";

                // Get the venue for four occupancy without cost
                String venueForFour = (i < venuesForFour.size()) ? venuesForFour.get(i).getName() : "";

                // Get the venue for three occupancy without cost
                Integer venueForThreeCost = (i < venuesForThree.size()) ? venuesForThree.get(i).getTotalCost() : 0;

                // Get the venue for four occupancy without cost
                Integer venueForFourCost = (i < venuesForFour.size()) ? venuesForFour.get(i).getTotalCost() : 0;

                // Get the venue for three occupancy without cost
                Integer roomNeededForThreeOccuoancy = (i < venuesForThree.size()) ? venuesForThree.get(i).getTotalRoomRequire() : 0;

                // Get the venue for four occupancy without cost
                Integer roomNeededForFourOccuoancy = (i < venuesForFour.size()) ? venuesForFour.get(i).getTotalRoomRequire() : 0;

                // Write the row to CSV
                csvWriter.append(String.join(",", name, venueForThree, venueForThreeCost.toString(),
                        roomNeededForThreeOccuoancy.toString(), venueForFour, venueForFourCost.toString(),
                        roomNeededForFourOccuoancy.toString())).append("\n");
            }
            csvWriter.append(String.join(",","","","","","","","")).append("\n");
        }



        csvWriter.flush();
        csvWriter.close();
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
