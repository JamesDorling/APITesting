package api_testing.DTO;

import api_testing.pojo.Coord;

public class CoordDTO extends Coord {
    //LONGITUDE
    public boolean hasLongitude() {
        return getLon() != null;
    }

    public boolean longitudeInRange() {
        return -180 <= getLon() && getLon() <= 180;
    }

    //LATITUDE
    public boolean hasLatitude() {
        return getLat() != null;
    }

    public boolean latitudeInRange() {
        return -90 <= getLat() && getLat() <= 90;
    }
}
