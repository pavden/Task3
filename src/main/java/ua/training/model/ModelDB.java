
package ua.training.model;

public enum ModelDB {

    ENTRY_ONE_NICKNAME("fobos"),
    ENTRY_TWO_NICKNAME("deimos");

    private final String nickname;

    ModelDB(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public static boolean isNicknameUsed(String nickname) {
        for (ModelDB entry : ModelDB.values()) {
            if (entry.getNickname().equals(nickname)) {
                return true;
            }
        }
        return false;
    }

}
