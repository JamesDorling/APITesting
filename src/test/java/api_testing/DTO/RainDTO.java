package api_testing.DTO;

import api_testing.pojo.Rain;

public class RainDTO extends Rain {

    public boolean is3hNotNull() {
        return getJsonMember3h() != null;
    }

    public boolean is1hNotNull() {
        return getJsonMember1h() != null;
    }

    public boolean is3hPositive() {
        return getJsonMember3h() >= 0;
    }

    public boolean is1hPositive() {
        return getJsonMember1h() >= 0;
    }

}