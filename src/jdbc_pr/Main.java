package jdbc_pr;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/bank";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,user,password);

        PreparedStatement preparedStatement = connection.prepareStatement("select * from client");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Client>clients = new ArrayList<>();
        while (resultSet.next()) {
            int idClient = resultSet.getInt("idClient");
            String firstName = resultSet.getString("FirstName");
            String lastName = resultSet.getString("LastName");
            String education = resultSet.getString("Education");
            String passport = resultSet.getString("Passport");
            String city = resultSet.getString("City");
            int age = resultSet.getInt("Age");
            int department_idDepartment = resultSet.getInt("Department_idDepartment");
            clients.add(new Client(idClient,firstName,lastName,education,passport,city,age,department_idDepartment));
        }


        PreparedStatement preparedStatement1 = connection.prepareStatement("select * from application");
        ResultSet resultSet1 = preparedStatement1.executeQuery();
        List<Application>appl = new ArrayList<>();
        while (resultSet1.next()) {
            int idApplication = resultSet1.getInt("idApplication");
            int sum = resultSet1.getInt("Sum");
            boolean creditState = resultSet1.getBoolean("CreditState");
            String currency = resultSet1.getString("Currency");
            int client_idClient = resultSet1.getInt("Client_idClient");
            appl.add(new Application(idApplication,sum,creditState,currency,client_idClient));
        }

//        System.out.println(clients);
//        System.out.println(" ");
//        System.out.println(appl);

        for (Client client : clients) {
            int id = client.getIdClient();
            for (Application application : appl) {
                int clid = application.getClient_idClient();
                if (id == clid){
                    client.getAppl().add(application);
                }
            }
        }

        clients.sort((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
//        System.out.println(clients);

        Stream<Client> stream = clients.stream();
        stream
                .sorted((o1, o2) -> o2.getIdClient() - o1.getIdClient())


                .forEach(cl -> System.out.println(cl));
    }
}
