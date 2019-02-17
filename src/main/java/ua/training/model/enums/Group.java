
package ua.training.model.enums;

public enum Group {

    FAMILY("Family"),
    FRIENDS("Friends"),
    WORK("Work");

    private String value;

    Group(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

}
