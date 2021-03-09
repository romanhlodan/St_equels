package FileRider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        Person person = new Person("vasya", Sex.MALE);
//
//        Sex sex = Sex.MALE;
//        System.out.println(sex.getX());
//
//        Wrap.Inner inner = new Wrap().new Inner();
//        Wrap.Inner inner = new Wrap.Inner();
//
//        PersonGenerator personGenerator = new PersonGenerator();
//        Person kolya = personGenerator.name("Kolya").sex(Sex.MALE).build();
//        System.out.println(kolya);
//
//        Person olga = Person.builder().name("Olga").sex(Sex.FEMALE).build();
//        System.out.println(olga);

//        File file =  new File("C:"+File.separator+"Program Files"+File.separator+"User.txt");
//        FileInputStream stream = new FileInputStream(file);
//        int size = stream.available();
//        byte [] bytes = new byte[size];
//        stream.read(bytes);
////        System.out.println(Arrays.toString(bytes));
//        String s = new String(bytes);
////        System.out.println(s);
//
//        String[] split = s.split("\n");
//        ArrayList<User> users = new ArrayList<>();
//        for (String user : split) {
////            System.out.println("id "+ user);
//            user = user.replace("\r", "");
//            String[] props = user.split(" ");
////            System.out.println(Arrays.toString(props));
//
//            User u = new User(Integer.parseInt(props[0]), props[1], props[2]);
//            users.add(u);
//        }
////        System.out.println(users);
//
//        Comparator<User> sortid = new Comparator<>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getId() - o2.getId();
//            }
//        };
//        users.sort(sortid);
//        System.out.println(users);
//
//        Comparator<User> sortemail = new Comparator<>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getEmail().compareTo(o2.getEmail());
//            }
//
//        };
//        users.sort(sortemail);
//        System.out.println(users);
//        Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//             if (next.getEmail().contains("@gmail.com")){
//                 System.out.println(next);
//             }
////            System.out.println(next);
//        }

        File file = new File("D:"+File.separator+"Фотки"+File.separator+"100OLYMP"+File.separator+"Person.txt");
        FileInputStream stream = new FileInputStream(file);
        int size = stream.available();
        byte [] bytes = new byte[size];
        stream.read(bytes);
        String s = new String(bytes);
//        System.out.println(s);

        String[] split = s.split("\n");
        List<User> users = new ArrayList();
        for (String user : split) {
//            System.out.println("you id " + user);
            user = user.replace("\r","");
//            System.out.println(user);
            String[] pop = user.split(" ");
            User u = new User(Integer.parseInt(pop[0]), pop[1], Integer.parseInt(pop[2]), pop[3], pop[4]);
            users.add(u);
        }
        System.out.println(users);


    }

}

