package FileRider;

public enum Sex {
    MALE("xxx"), FEMALE("yyy");

    private String x;

    Sex(String x) {
        this.x = x;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
}
