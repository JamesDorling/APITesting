package api_testing.DTO;

import api_testing.pojo.Sys;

public class SysDTO extends Sys {

    public boolean hasCounty() {
        return getCountry().getClass() == String.class;
    }

    public boolean hasSunrise() {
        return getSunrise().getClass() == Integer.class;
    }

    public boolean hasSunset() {
        return getSunset().getClass() == Integer.class;
    }

    public boolean hasId() {
        return getId().getClass() == Integer.class;
    }

    public boolean hasType() {
        return getType().getClass() == Integer.class;
    }

    public boolean hasMessage() {
        return getMessage().getClass() == Double.class;
    }

    public boolean countryNotNull() {
        return getCountry() != null;
    }

    public boolean sunriseNotNull() {
        return getSunrise() != null;
    }

    public boolean sunsetNotNull() {
        return getSunset() != null;
    }

    public boolean idNotNull() {
        return getId() != null;
    }

    public boolean typeNotNull() {
        return getType() != null;
    }

    public boolean messageNotNull() {
        return getMessage() != null;
    }

    public boolean countyLengthOf2() {
        return  getCountry().length() == 2;
    }

    public boolean isSunrisePositive() {
        return getSunrise() >= 0;
    }

    public boolean isSunsetPositive() {
        return getSunset() >= 0;
    }

    public boolean idLengthOf7() {
        return getId() >= 1000000 && getId() < 10000000;
    }

    public boolean isTypePositive() {
        return getType() >= 0;
    }

}