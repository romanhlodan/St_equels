package jdbc;

import java.sql.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/person";
        String user = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,user,password);

        PreparedStatement query = connection.prepareStatement("select * from user");
        ResultSet resultSet = query.executeQuery();
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String fmane = resultSet.getString(2);
            String lname = resultSet.getString(3);
            int age = resultSet.getInt(4);
            boolean univer = resultSet.getBoolean(5);
            String email = resultSet.getString(6);
            int credit = resultSet.getInt(7);
            users.add(new User(id,fmane,lname,age,univer,email,credit));
        }
//        System.out.println(users);


//        Comparator<User> comparator = new Comparator<>() {
//            @Override
//            public int compare(User user, User t1) {
//                return 0;
//            }
//        };
//        users.sort(comparator);

//        Comparator<User> userComparator = (User o1, User o2)->{
//            return o2.getId()-o1.getId();
//        };

//        users.sort((o1, o2) -> o2.getId()-o1.getId());
//
//        System.out.println(users);

//        Stream<User> stream = users.stream();
//        stream
//                .distinct()
//                .filter(u -> u.getId()>=2)
//                .sorted((o1, o2) -> o2.getId()-o1.getId())
//                .skip(3)
//                .forEach(u -> System.out.println(u));

//        System.out.println(stream.findFirst());
//        Set<User> ree = users.stream()
//        .filter(u -> u.getCredit()>7000)
//                .collect(Collectors.toSet());
//        System.out.println(ree);

        Stream<User> stream = users.stream();
//        System.out.println(stream.anyMatch(us -> us.getEmail().contains("@gmail.com")));
//        System.out.println(stream.noneMatch(us -> us.getCredit() < 1000));
//        System.out.println(stream.allMatch(us -> us.isUniversyty() == true));
//        System.out.println(stream.min((o1, o2) -> o1.getCredit() - o2.getCredit()));
//        System.out.println(stream.max((o1, o2) -> o1.getCredit() - o2.getCredit()));
//        System.out.println(Arrays.toString(stream.toArray()));

        List<User> lll =stream
                .distinct()
                .filter(us -> us.getAge()>21 && us.isUniversyty() == true && us.getCredit()>1000)
                .skip(1)
                .limit(3)
                .sorted((o1, o2) -> o2.getCredit()- o1.getCredit())
                .collect(Collectors.toList());
//                .forEach(us -> System.out.println(us));

        System.out.println(lll);

    }
}
