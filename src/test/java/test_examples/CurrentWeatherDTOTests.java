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
        @DisplayName("Deg Exists test")
        void degIsNotNullTest() {
            Assumptions.assumeTrue(weatherDTO.windIsNotNull());
            Assertions.assertTrue(weatherDTO.getWind().degNotNull());
        }

        @Test
        @DisplayName("ID is correct length")
        void idCorrectLength() {
            Assertions.assertTrue(weatherDTO.idLength() == 7);
        }

        @Test
        @DisplayName("WeatherItem is not null")
        void weatherItemIsNotNullTest() {

        }
    }
}