package api_testing.DTO;

import api_testing.pojo.WeatherItem;

public class WeatherItemDTO extends WeatherItem {
    //ICON
    public boolean hasIcon() {
        return getIcon() != null;
    }

    public boolean iconHasThreeCharacters() {
        return String.valueOf(getIcon()).length() == 3;
    }

    //DESCRIPTION
    public boolean hasDescription() {
        return getDescription() != null;
    }

    //MAIN
    public boolean hasMain() {
        return getMain() != null;
    }

    //ID
    public boolean hasId() {
        return getId() != null;
    }

    public boolean idHasThreeDigits() {
        return Integer.toString(getId()).length() == 3;
    }

    //GENERAL
    public boolean hasCorrectThunderstormWeatherCondition() {
        String firstTwoCharactersOfIcon = getIcon().substring(0, 2);
        if (getMain().equals("Thunderstorm")) {
            return ( (getId() >= 200 && getId() <= 232) && (firstTwoCharactersOfIcon.equals("11")) );
        }
        return false;
    }

    public boolean hasCorrectDrizzleWeatherCondition() {
        String firstTwoCharactersOfIcon = getIcon().substring(0, 2);
        if (getMain().equals("Drizzle")) {
            return ( (getId() >= 300 && getId() <= 321) && (firstTwoCharactersOfIcon.equals("09")) );
        }
        return false;
    }

    public boolean hasCorrectRainWeatherCondition() {
        String firstTwoCharactersOfIcon = getIcon().substring(0, 2);
        if (getMain().equals("Rain")) {
            if (getId() >= 500 && getId() <= 504) {
                return firstTwoCharactersOfIcon.equals("10");
            } else if (getId() == 511) {
                return firstTwoCharactersOfIcon.equals("13");
            } else {
                return firstTwoCharactersOfIcon.equals("09");
            }
        }
        return false;
    }

    public boolean hasCorrectSnowWeatherCondition() {
        String firstTwoCharactersOfIcon = getIcon().substring(0, 2);
        if (getMain().equals("Snow")) {
            return ( (getId() >= 600 && getId() <= 622) && (firstTwoCharactersOfIcon.equals("13")) );
        }
        return false;
    }

    //Atmosphere

    public boolean hasCorrectClearWeatherCondition() {
        String firstTwoCharactersOfIcon = getIcon().substring(0, 2);
        if (getMain().equals("Clear")) {
            return ( (getId() == 800) && (firstTwoCharactersOfIcon.equals("01")) );
        }
        return false;
    }

    public boolean hasCorrectCloudsWeatherCondition() {
        String firstTwoCharactersOfIcon = getIcon().substring(0, 2);
        if (getMain().equals("Clouds")) {
            if (getId() == 801) {
                return firstTwoCharactersOfIcon.equals("02");
            } else if (getId() == 802) {
                return firstTwoCharactersOfIcon.equals("03");
            } else {
                return firstTwoCharactersOfIcon.equals("04");
            }
        }
        return false;
    }

}
