package framework_tests;

import api_testing.config.Config;
import api_testing.connection.ConnectionManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class ConnectionManagerTests {
    @Nested
    @DisplayName("Connection Manager URL Tests")
    class urlTests {
        @Test
        @DisplayName("Blank get connection test")
        void blankGetConnectionTest() {
            Assertions.assertEquals("https://api.openweathermap.org/data/2.5/weather", ConnectionManager.getConnection());
        }

        @Test
        @DisplayName("Get connection using city name test")
        void getConnectionWithCityNameTest() {
            Assertions.assertEquals("https://api.openweathermap.org/data/2.5/weather?q=London&appid=" + Config.getApiKey(), ConnectionManager.getConnection("London"));
        }

        @Test
        @DisplayName("Get connection using city name and country code test")
        void getConnectionWithCityNameAndCountryCodeTest() {
            Assertions.assertEquals("https://api.openweathermap.org/data/2.5/weather?q=York,UK&appid=" + Config.getApiKey(), ConnectionManager.getConnection("York", "UK"));
        }

        @Test
        @DisplayName("Get connection using city name, state code and country code test")
        void getConnectionWithCityNameStateCodeAndCountryCodeTest() {
            Assertions.assertEquals("https://api.openweathermap.org/data/2.5/weather?q=NewYork,NY,US&appid=" + Config.getApiKey(), ConnectionManager.getConnection("NewYork", "NY", "US"));
        }

        @Test
        @DisplayName("Get connection with city ID")
        void getConnectionWithCityID() {
            Assertions.assertEquals("https://api.openweathermap.org/data/2.5/weather?id=1&appid=" + Config.getApiKey(), ConnectionManager.getConnection(1));
        }

        @Test
        @DisplayName("Get connection with longitude and latitude")
        void getConnectionWithLonAndLat() {
            Assertions.assertEquals("https://api.openweathermap.org/data/2.5/weather?lat=1.1&lon=1.1&appid=" + Config.getApiKey(), ConnectionManager.getConnection(1.1, 1.1));
        }

        @Test
        @DisplayName("Get connection with zip code and country code")
        void getConnectionWithZipAndCountryCode() {
            Assertions.assertEquals("https://api.openweathermap.org/data/2.5/weather?zip=1,test&appid=" + Config.getApiKey(), ConnectionManager.getConnection(1, "test"));
        }

        @Test
        @DisplayName("Add metric to string")
        void metricAdditionTest() {
            Assertions.assertEquals("&units=metric", ConnectionManager.useMetric(""));
        }

        @Test
        @DisplayName("Add metric to string")
        void ImperialAdditionTest() {
            Assertions.assertEquals("&units=imperial", ConnectionManager.useImperial(""));
        }
    }
}
