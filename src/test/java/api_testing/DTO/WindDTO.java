package api_testing.DTO;

import api_testing.pojo.Wind;

public class WindDTO extends Wind {
    public boolean degNotNull() {
        return getDeg() != null;
    }

    public boolean speedNotNull() {
        return getSpeed() != null;
    }

    public boolean gustNotNull() {
        return getGust() != null; //This one can be null sometimes though!
    }

    public boolean degWithinBounds() {
        return getDeg() < 360 && getDeg() > 0;
    }
}
