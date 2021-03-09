package Generics;

public class Person <X, Y> {
    private X id;
    private Y name;

    public Person() {
    }

    public Person(X id, Y name) {
        this.id = id;
        this.name = name;
    }

    public X getId() {
        return id;
    }

    public void setId(X id) {
        this.id = id;
    }

    public Y getName() {
        return name;
    }

    public void setName(Y name) {
        this.name = name;
    }
public <E> E test (E e){
        return e;
}
    {
        Integer test = this.test(145);
    }




}
