package maper;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person(1,"Roman"));
//        people.add(new Person(2,"Ivan"));
//        people.add(new Person(3,"Petro"));
//
//        for (Person person : people) {
//            if (person.getId() == 1){
//                people.remove(person);
//            }
//        }
//
//        Iterator<Person> iterator1 = people.iterator();
//        while (iterator1.hasNext()){
//            Person next = iterator1.next();
//          if (next.getId()==1){
//              iterator1.remove();
//          }
//        }
//        System.out.println(people);
//
//        Map<String, Person> personMap = new HashMap<>();
//        personMap.put("puch", new Person(1,"Ivan"));
//        personMap.put("hus", new Person(2,"Roman"));
//
//
//        Person puch = personMap.get("puch");
//        System.out.println(puch);
//
//        Map<String, ArrayList<Person>> bands = new HashMap<>();
//        ArrayList<Person> persons = new ArrayList<>();
//        persons.add(new Person(1,"pedro"));
//        persons.add(new Person(2,"sancho"));
//        persons.add(new Person(3,"panso"));
//        persons.add(new Person(4,"hulio"));
//
//        bands.put("indysu",persons);
//        System.out.println(bands);
//
//        int size = bands.size();
//        System.out.println(size);
//
//        ArrayList<Person> people1 = bands.get("indysu");
//        System.out.println(people1);
//
//        boolean indysu = bands.containsKey("indysu");
//        System.out.println(indysu);
//
//        Set<String> keySet = bands.keySet();
//        System.out.println(keySet);
//
//        Collection<ArrayList<Person>> values = bands.values();
//        System.out.println(values);
//
//        Set<Map.Entry<String, ArrayList<Person>>> entries = bands.entrySet();
//        for (Map.Entry<String, ArrayList<Person>> entry : entries) {
//            System.out.println(entry);
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//
//        Iterator<Map.Entry<String, ArrayList<Person>>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, ArrayList<Person>> next = iterator.next();
//            System.out.println(next);
//        }
//
//        TreeMap<Person, String> treeMap = new TreeMap<>();
//        treeMap.put(new Person(3,"qwe"),"oktenweb");
//        treeMap.put(new Person(1,"wer"),"Hello");
//        treeMap.put(new Person(2,"wsd"),"!!!");
//
//        System.out.println(treeMap);
//
//        System.out.println(persons);
//        SortByName sortByName = new SortByName();
//        persons.sort(sortByName);
//        System.out.println(persons);

//        Map<Integer,Person> personMap = new HashMap<>();
//        personMap.put(1, new Person(1,"Roman","Hlodan"));
//        personMap.put(2, new Person(2,"Olga","Hlodan"));
//        personMap.put(3, new Person(3,"Katya","Vins"));
//        personMap.put(4, new Person(4,"Ivan","Vinskovskyi"));
//        personMap.put(5, new Person(5,"Lida","Zbigla"));
//        personMap.put(6, new Person(6,"Roman","Lyzetckyi"));

//        System.out.println(personMap);

//        Map<Integer,Animal>animalMap = new HashMap<>();
//        animalMap.put(1, new Animal("Dog","Ralf"));
//        animalMap.put(2,new Animal("Cat","Rydik"));
//        animalMap.put(3,new Animal("Fish","Klaid"));
//        animalMap.put(4,new Animal("Rabbit","Malishka"));
//        animalMap.put(5,new Animal("Cat","Myrchik"));
//        animalMap.put(6,new Animal("Perot","Ara"));

//        System.out.println(animalMap);

//        System.out.println(personMap.size());
//        System.out.println(animalMap.size());

//        Set<Map.Entry<Integer, Person>> entries = personMap.entrySet();
//        Iterator<Map.Entry<Integer, Person>> iterator = entries.iterator();




//        Set<Map.Entry<Integer, Animal>> entries1 = animalMap.entrySet();
//        Iterator<Map.Entry<Integer, Animal>> iterator1 = entries1.iterator();
//        while (iterator1.hasNext()){
//            Map.Entry<Integer, Animal> next = iterator1.next();
//            System.out.println(next);
//        }

//        TreeMap<Integer, Person> treemap = new TreeMap<>();
//        treemap.put(4,new Person(4,"Ivan","Vinskovskyi"));
//        treemap.put(1,new Person(1,"Roman","Hlodan"));
//        treemap.put(6,new Person(6,"Roman","Lyzetckyi"));
//        treemap.put(2,new Person(2,"Olga","Hlodan"));
//        treemap.put(5,new Person(5,"Lida","Zbigla"));
//        treemap.put(3,new Person(3,"Katya","Vins"));
//        System.out.println(treemap);

//        ArrayList<Person> person = new ArrayList<>();
//        person.add(new Person(1,"Roman","Hlodan"));
//        person.add(new Person(2,"Olga","Hlodan"));
//        person.add(new Person(3,"Katya","Vins"));
//        person.add(new Person(4,"Ivan","Vinskovskyi"));
//        person.add(new Person(5,"Lida","Zbigla"));
//        person.add(new Person(6,"Roman","Lyzetckyi"));
//
//        System.out.println(person);
//        Sorts sorts = new Sorts();
//        person.sort(sorts);
//        System.out.println(person);

        System.out.println("1-додати учасника "+
        "2-додати тваринку до учасника "+
        "3-видалити тваринку з власника "+
        "4-видалити учасника клубу "+
        "5-видалити конкретну тваринку "+
        "6-вивести на екран зооклуб");

        Person petro = new Person("Petro");
        Zooclub zooclub = new Zooclub();
        Map<Person, List<Pets>> club = zooclub.getClub();
        List<Pets> pets = new ArrayList<>();
        pets.add(new Pets("Ralf"));
        pets.add(new Pets("Klaid"));
        pets.add(new Pets("Rydik"));
        System.out.println(pets);
        club.put(petro,pets);



//        Set<Person> people = club.keySet();
//        people.add(petro);
//
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

//        switch (i){
//            case 1:club.put())
//            break;
//            case 2: club.size();
//            break;
//            case 3: club.isEmpty();
//            break;
//            case 4:
//        }

    }
}
