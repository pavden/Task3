
package ua.training.model.exceptions;

public class NonUniqueNicknameException extends Exception {

    private String nickname;

    public NonUniqueNicknameException(String message, String nickname) {
        super(message);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

}
