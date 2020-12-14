package roy.example.appointment.book.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class UsersDTO implements Serializable {

    Integer userid;
    String firstname;
    String lastname;
    String password;

    @Override
    public String toString() {
        return "UserDTO{" +
                "userid=" + userid +
                ", firstname='" + firstname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
