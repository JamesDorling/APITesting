package api_testing.DTO;

import api_testing.pojo.CurrentWeatherPojo;

public class CurrentWeatherDTO extends CurrentWeatherPojo {

    public int idLength() {
        return getId().toString().length();
    }

    public int codLength() {
        return getCod().toString().length();
    }

    public int dtLength() {
        return getDt().toString().length();
    }

    public boolean rainIsNotNull() {
        return getRain() != null;
    }

    public boolean visibilityIsNotNull() {
        return getVisibility() != null;
    }

    public boolean timezoneIsNotNull() {
        return getTimezone() != null;
    }

    public boolean mainIsNotNull() {
        return getMain() != null;
    }

    public boolean cloudsIsNotNull() {
        return getClouds() != null;
    }

    public boolean sysIsNotNull() {
        return getSys() != null;
    }

    public boolean dtIsNotNull() {
        return getDt() != null;
    }

    public boolean coordIsNotNull() {
        return getCoord() != null;
    }

    public boolean snowIsNotNull() {
        return getSnow() != null;
    }

    public boolean weatherIsNotNull() {
        return getWeather() != null;
    }

    public boolean nameIsNotNull() {
        return getName() != null;
    }

    public boolean codIsNotNull() {
        return getCod() != null;
    }

    public boolean idIsNotNull() {
        return getId() != null;
    }

    public boolean baseIsNotNull() {
        return getBase() != null;
    }

    public boolean windIsNotNull() {
        return getWind() != null;
    }
}
