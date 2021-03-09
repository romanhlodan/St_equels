package FileRider;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
public class User implements Serializable {
    private int id;
    private String name;
    private int age;
    private transient String email;
    private String edukal;
}
