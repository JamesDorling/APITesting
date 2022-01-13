package api_testing.DTO;

import api_testing.Assertable;
import api_testing.pojo.CurrentWeatherPojo;
import org.junit.jupiter.api.Assertions;

public class CurrentWeatherDTO extends CurrentWeatherPojo {
    public Assertable idIsCorrectLength() {
        return new Assertable(getId().toString().length() == 7);
    }

    public boolean codIsCorrectLength() {
        return getCod().toString().length() == 3;
    }

    public boolean dtIsCorrectLength() {
        return getDt().toString().length() == 10;
    }

    public boolean rainIsNotNull() {
        return getRain() != null;
    }

    public void assertRainIsNotNull() {
        Assertions.assertTrue(rainIsNotNull());
    }

}
