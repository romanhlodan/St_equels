package jdbc_pr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Application {
    private int idApplication;
    private int Sum;
    private boolean CreditState;
    private String currency;
    private int Client_idClient;
}
