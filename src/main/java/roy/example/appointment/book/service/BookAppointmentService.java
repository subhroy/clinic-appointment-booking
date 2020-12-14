package roy.example.appointment.book.service;

import roy.example.appointment.book.dto.AppointmentDTO;

import java.util.List;

public interface BookAppointmentService {

    public boolean validateUser(String id, String password);

    List<AppointmentDTO> getAllBookedSlotDetails();

    public void addAppointments(AppointmentDTO apptDto);
}
