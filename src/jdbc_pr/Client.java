package jdbc_pr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Objects;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Client {
   private int idClient;
   private String FirstName;
   private String LastName;
   private String education;
   private String Passport;
   private String City;
   private int age;
   private int Department_idDepartment;

private ArrayList<Application> appl = new ArrayList<>();

   public Client(int idClient, String firstName, String lastName, String education, String passport, String city, int age, int department_idDepartment) {
      this.idClient = idClient;
      FirstName = firstName;
      LastName = lastName;
      this.education = education;
      Passport = passport;
      City = city;
      this.age = age;
      Department_idDepartment = department_idDepartment;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Client client = (Client) o;
      return idClient == client.idClient &&
              age == client.age &&
              Department_idDepartment == client.Department_idDepartment &&
              Objects.equals(FirstName, client.FirstName) &&
              Objects.equals(LastName, client.LastName) &&
              Objects.equals(education, client.education) &&
              Objects.equals(Passport, client.Passport) &&
              Objects.equals(City, client.City) &&
              Objects.equals(appl, client.appl);
   }

   @Override
   public int hashCode() {
      return Objects.hash(idClient, FirstName, LastName, education, Passport, City, age, Department_idDepartment, appl);
   }
}
