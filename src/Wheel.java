public class Wheel {
    private String maker;
    private int diameter;

    public Wheel() {
    }

    public Wheel(String maker, int diameter) {
        this.maker = maker;
        this.diameter = diameter;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "maker='" + maker + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
