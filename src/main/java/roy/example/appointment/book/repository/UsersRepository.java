package roy.example.appointment.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import roy.example.appointment.book.model.Users;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    @Query(value = "select firstname, password from users where firstname=:firstname && password =:password", nativeQuery = true)
    List<Object[]> validateUser(@Param("firstname")String firstName, @Param("password")String password);
}
