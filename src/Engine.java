public class Engine {
    private String modele;
    private int volume;
    private int hp;


    public Engine() {
    }

    public Engine(String model, int volume, int hp) {
        this.modele = model;
        this.volume = volume;
        this.hp = hp;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + modele + '\'' +
                ", volume=" + volume +
                ", hp=" + hp +
                '}';
    }
}
