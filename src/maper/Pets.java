package maper;

public class Pets {

private String clichka;

    public Pets() {
    }

    public Pets(String clichka) {
        this.clichka = clichka;
    }

    public String getClichka() {
        return clichka;
    }

    public void setClichka(String clichka) {
        this.clichka = clichka;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "clichka='" + clichka + '\'' +
                '}';
    }
}
