package Raka.Pratama.enums;

public enum Level {

    BRONZE ("Bronze Medal"),
    SILVER("Silver Medal"),
    GOLD("Gold Medal"),
    PLATINUM("Platinum Medal");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
