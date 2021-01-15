package roy.example.appointment.book.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import roy.example.appointment.book.dto.AppointmentDTO;
import roy.example.appointment.book.service.BookAppointmentService;

import java.util.List;

@RestController
@RequestMapping("/booking/api/v1")
public class BookAppointmentRestController {

    @Autowired
    BookAppointmentService bookAppointmentService;


    @GetMapping("/validate/{customerId}/{password}")
    public String checkUser(@PathVariable String customerId, @PathVariable String password){
        boolean isValid =  bookAppointmentService.validateUser(customerId,password);
        return "User is authenticated";
    }

    @GetMapping("/appointment/details")
    public List<AppointmentDTO> getBookedAppointmentDetails(){
        return bookAppointmentService.getAllBookedSlotDetails();
    }

    @RequestMapping("/add/user")
    @PostMapping
    public ResponseEntity<AppointmentDTO> addUserToDB(@RequestBody AppointmentDTO appointmentDTO){
       bookAppointmentService.addAppointments(appointmentDTO);
        return new ResponseEntity<AppointmentDTO>(appointmentDTO, HttpStatus.OK);
    }


}
