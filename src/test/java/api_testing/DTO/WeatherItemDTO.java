package api_testing.DTO;

import api_testing.pojo.WeatherItem;

public class WeatherItemDTO extends WeatherItem {
    //ICON
    public boolean iconIsNotNull() {
        return getIcon() != null;
    }

    //DESCRIPTION
    public boolean descriptionIsNotNull() {
        return getDescription() != null;
    }

    //MAIN
    public boolean mainIsNotNull() {
        return getMain() != null;
    }

    //ID
    public boolean idIsNotNull() {
        return getId() != null;
    }
}
