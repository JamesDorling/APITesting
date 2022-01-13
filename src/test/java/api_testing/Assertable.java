package api_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

import java.io.Serializable;

public class Assertable {
    private boolean assertable;

    public Assertable(boolean test) {
        this.assertable = test;
    }

    public boolean result() { return assertable; }

    public void assertTrue() {
        Assertions.assertTrue(assertable);
    }

    public void assertFalse() {
        Assertions.assertFalse(assertable);
    }

    public void assumeTrue() {
        Assumptions.assumeTrue(assertable);
    }

    public void assumeFalse() {
        Assumptions.assumeFalse(assertable);
    }
}
