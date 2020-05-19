package entities;

import java.util.Objects;

public class Users {
    private Integer userCode;

    public Users(Integer userCode) {
        this.userCode = userCode;
    }

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return userCode.equals(users.userCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userCode);
    }
}
