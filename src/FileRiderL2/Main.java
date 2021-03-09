package FileRiderL2;

import FileRider.User;
import maper.Person;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Properties properties = System.getProperties();
//        for (Object o : properties.keySet()) {
//            System.out.println(o);
//        }
//        System.out.println(System.getProperty("user.language"));

        File file = new File(System.getProperty("user.home") + File.separator +"test.txt");

//        FileWriter fileWriter = new FileWriter(file, true);
//        fileWriter.write("Hello my little niga freinds");
//        fileWriter.flush();
//        fileWriter.close();

//        FileReader fileReader = new FileReader(file);
//        int c;
//        while ((c=fileReader.read()) != -1){
//            System.out.println((char)c);
//        }

//        PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
//        printWriter.println("Fuck you");
//        printWriter.flush();
//        printWriter.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        String s;
//        while ((s = bufferedReader.readLine()) != null){
//            System.out.println(s);
//        }

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(new User(1,"Roman",23,"@www","NU LP"));
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        User user = (User) objectInputStream.readObject();
        System.out.println(user);

//        String[] list = file.list((dir, name) -> name.endsWith(".txt")?true:false);
//        for (String s : list) {
//            System.out.println(s);
//        }
    }
}
