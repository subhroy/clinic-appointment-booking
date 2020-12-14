package roy.example.appointment.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import roy.example.appointment.book.model.Appointments;


public interface AppointmentsRepository extends JpaRepository<Appointments, Integer> {


}
