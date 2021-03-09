import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        String s1 = "Roman & Olga";
//        String s2 = "Roman";
//        String  s3 = new String("Roman");
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1.equals(s3));
//
//        System.out.println(s1.charAt(2));
//        System.out.println(s1.contains("om"));
//        System.out.println(s1.indexOf("a"));
//        System.out.println(s1.lastIndexOf("a"));
//        System.out.println(s1.indexOf("a", s1.indexOf("a") + 1));
//        System.out.println(s1.codePointAt(5));
//        System.out.println(s1.replace("a", "@"));
//        System.out.println(Arrays.toString(s1.toCharArray()));
//        System.out.println(s1.compareTo("q"));
//        System.out.println(s1.substring(3, 7));
//        String[] split = "http://okten.web/java".split("/");
//        System.out.println(Arrays.toString(split));

        Car bmw = new Car("BMW 5",2003,"ВС2546ВА","DE4",3,240,"Bridstone",19);
        Car mers140 = new Car("Mers 140", 1998, "wed233", "bg5", 2, 140, "Nokian", 16);
        Car renaultmeg = new Car("Remault Megane", 2010, "BC6460ET", "dci110", 2, 110, "Hoken", 16);
        Car opelas = new Car("Opel Astra", 1996, "QQ!@#e", "qw2", 3, 100, "bell", 14);
        Car kiasor = new Car("Kia Sorento", 2012, "BC7974ET", "lio3", 3, 140, "henkook", 17);
        Car audi100 = new Car("Audi 100", 1985, "BC4567ET", "qqq2", 5, 210, "Toyo", 16);
        Car vwgolf = new Car("VW Golf", 2000, "BC1234ET", "wwsw5", 2, 80, "Qwerty", 14);
        Car porshmac = new Car("Porshe Macane", 2020, "BC9999ET", "hpm9", 3, 394, "Misheline", 19);
        Car nissky = new Car("Nisan Sky", 1999, "BC4326ET", "hre3", 3, 256, "Misheline", 17);
        Car tavr = new Car("Tavria", 1997, "BC0543ET", "zap2", 1, 50, "bel", 13);

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(bmw);
        cars.add(mers140);
        cars.add(renaultmeg);
        cars.add(opelas);
        cars.add(kiasor);
        cars.add(audi100);
        cars.add(vwgolf);
        cars.add(porshmac);
        cars.add(nissky);
        cars.add(tavr);
        cars.add(kiasor);
        cars.add(porshmac);
        cars.add(bmw);
        cars.add(vwgolf);


//        cars.add(new Car("BMW 5",2003,"ВС2546ВА","DE4",3,240,"Bridstone",19));
//        cars.add(new Car("Mers 140", 1998, "wed233", "bg5", 2, 140, "Nokian", 16));
//        cars.add(new Car("Remault Megane", 2010, "BC6460ET", "dci110", 2, 110, "Hoken", 16));
//        cars.add(new Car("Opel Astra", 1996, "QQ!@#e", "qw2", 3, 100, "bell", 14));
//        cars.add(new Car("Kia Sorento", 2012, "BC7974ET", "lio3", 3, 140, "henkook", 17));
//        cars.add(new Car("Audi 100", 1985, "BC4567ET", "qqq2", 5, 210, "Toyo", 16));
//        cars.add(new Car("VW Golf", 2000, "BC1234ET", "wwsw5", 2, 80, "Qwerty", 14));
//        cars.add(new Car("Porshe Macane", 2020, "BC9999ET", "hpm9", 3, 394, "Misheline", 19));
//        cars.add(new Car("Nisan Sky", 1999, "BC4326ET", "hre3", 3, 256, "Misheline", 17));
//        cars.add(new Car("Tavria", 1997, "BC0543ET", "zap2", 1, 50, "bel", 13));

//        System.out.println(cars);
//        System.out.println(cars.get(2).engine);
//        System.out.println(cars.contains(mers140));
//
////        System.out.println(cars.contains(bmw));
//        System.out.println(cars.get(5));
////        System.out.println(cars.get(7).getModel());
////        System.out.println(cars);
////        cars.remove(10);
////        System.out.println(cars);
//        System.out.println(cars.size());
//        System.out.println(Arrays.toString(cars.toArray()));
////        System.out.println(cars.removeAll(cars));
//        System.out.println(cars.size());

        ArrayList<Car> cars2000 = new ArrayList<>();
         for (Car car : cars) {
            if (car.getRik() <= 2000){
                cars2000.add(car);
            }
        }





//        TreeSet<Car> cars1 = new TreeSet<>();
//        cars1.add(bmw);
//        System.out.println(cars1);
        ArrayList<Car> cars2001 = new ArrayList<>();
        for (Car car2 : cars) {
            if (car2.getRik()>2000){
                cars2001.add(car2);
            }
        }
        LinkedList<Car>qqq = new LinkedList<>();
        qqq.addAll(0,cars2000);
        qqq.addAll(cars2001);
        System.out.println(qqq);

        Car car = new Car("Tavria", 1997, "BC0543ET", "zap2", 1, 50, "bel", 13);


        int [] i = new int[10];
        System.out.println("+");
        try {
            System.out.println(i[15]);
            System.out.println(10/0);

        }catch (ArithmeticException e){
            System.out.println("error");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error with arrays");
        }finally {
            System.out.println("tggtt");
        }

//        try{
//
//        }finally{
//
//        }

        System.out.println("-");

        asd(10,0);
    }
    public static void asd(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
}
