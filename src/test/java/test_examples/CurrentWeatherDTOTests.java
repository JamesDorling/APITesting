package test_examples;

import api_testing.DTO.CurrentWeatherDTO;
import org.junit.jupiter.api.*;

import static api_testing.Injector.*;
import static api_testing.connection.ConnectionManager.*;

public class CurrentWeatherDTOTests {
    CurrentWeatherDTO weatherDTO;

    @BeforeEach
    void init() {
        weatherDTO = injectDTO(getConnection("London", "uk"));
    }

    @Nested
    @DisplayName("CurrentWeatherDTO Tests")
    class tests {
        @Test
        @DisplayName("Successful connection test")
        void connectionCode200Test() {
            Assertions.assertEquals(200, getStatusCode());
        }

        @Test
        @DisplayName("ID Exists test")
        void IDExistsTest() {
            Assertions.assertNotNull(weatherDTO.getId());
        }

        @Test
        @DisplayName("DTO Finder test")
        void test() {
            //System.out.println(weatherDTO.getBase());
            System.out.println(weatherDTO.getClouds().getAll());
            weatherDTO.getClouds().showMeTheMoney();
        }
    }

}
