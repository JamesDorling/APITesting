package api_testing.DTO;

import api_testing.pojo.Coord;

public class CoordDTO extends Coord {
    //LONGITUDE
    public boolean longitudeIsNotNull() {
        return getLon() != null;
    }

    public boolean longitudeInRange() {
        return -180 <= getLon() && getLon() <= 180;
    }

    //LATITUDE
    public boolean latitudeIsNotNull() {
        return getLat() != null;
    }

    public boolean latitudeInRange() {
        return -90 <= getLat() && getLat() <= 90;
    }
}
