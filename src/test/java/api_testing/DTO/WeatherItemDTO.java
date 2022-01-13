package api_testing.DTO;

import api_testing.pojo.WeatherItem;

public class WeatherItemDTO extends WeatherItem {
    //ICON
    public boolean hasIcon() {
        return getIcon().getClass() == String.class;
    }

    public boolean iconIsNotNull() {
        return getIcon() != null;
    }

    //DESCRIPTION
    public boolean hasDescription() {
        return getDescription().getClass() == String.class;
    }

    public boolean descriptionIsNotNull() {
        return getDescription() != null;
    }

    //MAIN
    public boolean hasMain() {
        return getMain().getClass() == String.class;
    }

    public boolean mainIsNotNull() {
        return getMain() != null;
    }

    //ID
    public boolean hasId() {
        return getId().getClass() == Integer.class;
    }

    public boolean idIsNotNull() {
        return getId() != null;
    }
}
