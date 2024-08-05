package co.develhope.exercise1_custom_queries.enums;

public enum Status {
    ONTIME("The flight is ontime"),
    DELAYED("The flight is delayed"),
    CANCELLED("The flight is cancelled");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
