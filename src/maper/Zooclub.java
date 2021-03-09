package maper;


import java.util.List;
import java.util.Map;


public class Zooclub {

    private Map<Person, List<Pets>> club;

    public Zooclub() {
    }

    public Zooclub(Map<Person, List<Pets>> club) {
        this.club = club;
    }

    public Map<Person, List<Pets>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pets>> club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Zooclub{" +
                "club=" + club +
                '}';
    }


}
