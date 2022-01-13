package api_testing.DTO;

import api_testing.pojo.Snow;

public class SnowDTO extends Snow {
    //1H
    public boolean has1h() {
        return getJsonMember1h().getClass() == Double.class;
    }

    public boolean is1hNotNull() {
        return getJsonMember1h() != null;
    }

    //3H
    public boolean has3h() {
        return getJsonMember3h().getClass() == Double.class;
    }

    public boolean is3hNotNull() {
        return getJsonMember3h() != null;
    }
}
