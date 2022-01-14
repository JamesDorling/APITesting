package api_testing.DTO;

import api_testing.pojo.Main;

public class MainDTO extends Main {

    public boolean tempNotNull() {
        return getTemp() != null;
    }

    public boolean tempMinNotNull() {
        return getTempMin() != null;
    }

    public boolean tempMaxNotNull() {
        return getTempMax() != null;
    }

    public boolean feelsLikeNotNull() {
        return getFeelsLike() != null;
    }

    public boolean pressureNotNull() {
        return getPressure() != null;
    }

    public boolean grndLevelNotNull() {
        return getGrndLevel() != null;
    }

    public boolean seaLevelNotNull() {
        return getSeaLevel() != null;
    }

    public boolean humidityNotNull() {
        return getHumidity() != null;
    }

    public boolean tempKelvinAboveAbsoluteZero() {
        return getTemp() >= 0;
    }

    public boolean tempCelsiusAboveAbsoluteZero() {
        return getTemp() >= -273.15;
    }

    public boolean tempFahrenheitAboveAbsoluteZero() {
        return getTemp() >= -459.67;
    }

    public boolean tempMinKelvinAboveAbsoluteZero() {
        return getTempMin() >= 0;
    }

    public boolean tempMinCelsiusAboveAbsoluteZero() {
        return getTempMin() >= -273.15;
    }

    public boolean tempMinFahrenheitAboveAbsoluteZero() {
        return getTempMin() >= -459.67;
    }

    public boolean tempMaxKelvinAboveAbsoluteZero() {
        return getTempMax() >= 0;
    }

    public boolean tempMaxCelsiusAboveAbsoluteZero() {
        return getTempMax() >= -273.15;
    }

    public boolean tempMaxFahrenheitAboveAbsoluteZero() {
        return getTempMax() >= -459.67;
    }

    public boolean feelsLikeKelvinAboveAbsoluteZero() {
        return getFeelsLike() >= 0;
    }

    public boolean feelsLikeCelsiusAboveAbsoluteZero() {
        return getFeelsLike() >= -273.15;
    }

    public boolean feelsLikeFahrenheitAboveAbsoluteZero() {
        return getFeelsLike() >= -459.67;
    }

    public boolean isPressurePositive() {
        return getPressure() >= 0;
    }

    public boolean isGrndLevelPositive() {
        return getGrndLevel() >= 0;
    }

    public boolean isSeaLevelPositive() {
        return getSeaLevel() >= 0;
    }

    public boolean isHumidityPercentage() {
        return getHumidity() >= 0 && getHumidity() <= 100;
    }

}