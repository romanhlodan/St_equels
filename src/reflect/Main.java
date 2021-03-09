package reflect;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        User user = new User(1, "vasya");
        Class<? extends User> clazz = user.getClass();

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
//            System.out.println(field);
//            System.out.println(field.get(user));
        }
        Field name = clazz.getDeclaredField("name");

        System.out.println(user.getName());
        System.out.println(user);
        name.setAccessible(true);
        name.set(user,"");
        System.out.println(user.getName());
        System.out.println(user);

        handler(user);
    }

    public static void handler (User user) throws IllegalAccessException {
        Class<? extends User> aClass = user.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Marker.class)){
                if (field.getType().toString().equals("class java.lang.String")){
                    String valueOfFilename = (String)field.get(user);
                    if (valueOfFilename.isEmpty() || valueOfFilename == null){
                        Marker annotation = field.getAnnotation(Marker.class);
                        String message = annotation.message();
                        System.out.println(message);
                    }else {
                        System.out.println("Ok");
                    }
                }
            }
        }
    }

}
