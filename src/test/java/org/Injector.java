package org;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Injector {
    public static CurrentWeatherDTO injectDTO(String URL) {
        CurrentWeatherDTO currentWeatherDTO = new CurrentWeatherDTO();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            currentWeatherDTO = objectMapper.readValue(new URL(URL), CurrentWeatherDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currentWeatherDTO;
    }
}
