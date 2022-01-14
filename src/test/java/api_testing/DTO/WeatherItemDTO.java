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
    public boolean hasCorrectWeatherCondition() {
        if (getId() >= 200 && getId() <= 232 ) {
            return hasCorrectThunderstormWeatherCondition();
        } else if (getId() >= 300 && getId() <= 321) {
            return hasCorrectDrizzleWeatherCondition();
        } else if (getId() >= 500 && getId() <= 531) {
            return hasCorrectRainWeatherCondition();
        } else if (getId() >= 600 && getId() <= 622) {
            return hasCorrectSnowWeatherCondition();
        } else if (getId() >= 700 && getId() <= 781) {
            return hasCorrectAtmosphereWeatherCondition();
        } else if (getId() == 800) {
            return hasCorrectClearWeatherCondition();
        } else if (getId() >= 800 && getId() <= 804) {
            return hasCorrectCloudsWeatherCondition();
        }
        return false;
    }

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

    public boolean hasCorrectAtmosphereWeatherCondition() {
        String firstTwoCharactersOfIcon = getIcon().substring(0, 2);
        if (firstTwoCharactersOfIcon.equals("50")) {
            switch (getMain()) {
                case "Mist":
                    return ((getId() == 701));
                case "Smoke":
                    return ((getId() == 711));
                case "Haze":
                    return ((getId() == 721));
                case "Dust":
                    return ((getId() == 731 || getId() == 761));
                case "Fog":
                    return ((getId() == 741));
                case "Sand":
                    return ((getId() == 751));
                case "Ash":
                    return ((getId() == 762));
                case "Squall":
                    return ((getId() == 771));
                case "Tornado":
                    return ((getId() == 781));
            }
        }
        return false;
    }

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
