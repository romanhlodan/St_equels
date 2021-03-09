package jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
public class User  {
    private int id;
    private String Fmane;
    private String Lmane;
    private int age;
    private boolean universyty;
    private String email;
    private int credit;
}
