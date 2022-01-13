package api_testing.DTO;

import api_testing.pojo.Main;

public class MainDTO extends Main {

    public boolean hasTemp() {
        return getTemp().getClass() == Double.class;
    }

    public boolean hasTempMin() {
        return getTempMin().getClass() == Double.class;
    }

    public boolean hasTempMax() {
        return getTempMax().getClass() == Double.class;
    }

    public boolean hasFeelsLike() {
        return getFeelsLike().getClass() == Double.class;
    }

    public boolean hasPressure() {
        return getPressure().getClass() == Integer.class;
    }

    public boolean hasGrndLevel() {
        return getGrndLevel().getClass() == Integer.class;
    }

    public boolean hasSeaLevel() {
        return getSeaLevel().getClass() == Integer.class;
    }

    public boolean hasHumidity() {
        return getHumidity().getClass() == Integer.class;
    }

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