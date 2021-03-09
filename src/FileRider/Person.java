package FileRider;

import lombok.ToString;

@ToString
public class Person {
    private String name;
    private Sex sex;

    public static PersonGenerator builder(){
        return new PersonGenerator();
    }
   static class PersonGenerator {

        private Person person = new Person();

        public PersonGenerator name (String name){
            this.person.name = name;
            return this;
        }
        public PersonGenerator sex(Sex sex){
            this.person.sex = sex;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
