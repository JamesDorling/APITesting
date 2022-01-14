package framework_tests;

import api_testing.DTO.CurrentWeatherDTO;
import api_testing.Injector;
import api_testing.config.Config;
import api_testing.connection.ConnectionManager;
import org.junit.jupiter.api.*;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class InjectorTests {

    @Test
    @DisplayName("Injector creates a CurrentWeatherDTO")
    void injectorReturnsCorrectType() {
        try (MockedStatic<ConnectionManager> connection = Mockito.mockStatic(ConnectionManager.class)) {
            connection.when(ConnectionManager::getConnection).thenReturn("https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=" + Config.getApiKey());
            Assertions.assertInstanceOf(CurrentWeatherDTO.class, Injector.injectDTO(ConnectionManager.getConnection()));
        }
    }
}
