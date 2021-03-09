public class Car {
    private String model;
    private int rik;
    private String nomer;
    Engine engine;
    Wheel wheel;

    public Car() {
    }

    public Car(String model, int rik, String nomer, String modele,int volume,int hp, String maker, int diameter) {
        this.model = model;
        this.rik = rik;
        this.nomer = nomer;
        this.engine = new Engine(modele,volume,hp);
        this.wheel = new Wheel(maker,diameter);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRik() {
        return rik;
    }

    public void setRik(int rik) {
        this.rik = rik;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", rik=" + rik +
                ", nomer='" + nomer + '\'' +
                ", engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }
}
