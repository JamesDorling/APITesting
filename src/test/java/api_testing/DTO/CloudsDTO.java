package api_testing.DTO;

import api_testing.pojo.Clouds;

public class CloudsDTO extends Clouds {
    public boolean allIsNotNull() {
        return getAll() != null;
    }

    public boolean cloudsWithinBounds() {
        return getAll() >= 0 && getAll() <= 100;
    }
}
