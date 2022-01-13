package api_testing.DTO;

import api_testing.pojo.Wind;
import org.junit.jupiter.api.Assertions;

public class WindDTO extends Wind {
    public void assertDegNotNull() {
        Assertions.assertNotNull(getDeg());
    }

    public void assertSpeedNotNull() {
        Assertions.assertNotNull(getSpeed());
    }

    public void assertGustNotNull() {
        Assertions.assertNotNull(getGust()); //This one can be null sometimes though!
    }

    public void assertDegWithinBounds() {
        Assertions.assertTrue(getDeg() < 360 && getDeg() > 0);
    }
}
