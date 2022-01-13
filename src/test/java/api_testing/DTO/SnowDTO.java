package api_testing.DTO;

import api_testing.pojo.Snow;

public class SnowDTO extends Snow {
    //1H
    public boolean has1h() {
        return getJsonMember1h() != null;
    }

    public boolean is1hPositive() {
        return getJsonMember1h() >= 0;
    }

    //3H
    public boolean has3h() {
        return getJsonMember3h() != null;
    }

    public boolean is3hPositive() {
        return getJsonMember3h() >= 0;
    }
}
