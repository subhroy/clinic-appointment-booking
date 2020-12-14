package roy.example.appointment.book.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roy.example.appointment.book.dto.AppointmentDTO;
import roy.example.appointment.book.model.Appointments;
import roy.example.appointment.book.repository.AppointmentsRepository;
import roy.example.appointment.book.repository.UsersRepository;
import roy.example.appointment.book.service.BookAppointmentService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

@Service
public class BookAppointmentServiceImpl implements BookAppointmentService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    AppointmentsRepository appointmentsRepository;

    @Override
    public boolean validateUser(String firstName, String password) {
        boolean isValueUser = false;
        List userLst = usersRepository.validateUser(firstName,password);

        if(userLst!=null&&userLst.size()>0){
            isValueUser = true;
        }else{
            isValueUser = false;
        }
        return isValueUser;
    }

    @Override
    public  List<AppointmentDTO> getAllBookedSlotDetails() {
        List<AppointmentDTO> apptList = new ArrayList<AppointmentDTO>();
        appointmentsRepository.findAll().stream().forEach(appointments -> {
            AppointmentDTO aDto = new AppointmentDTO();

            aDto.setAppintmentId(appointments.getApptId());
            aDto.setPatientName(appointments.getPatientName());
            aDto.setAppintmentDate(appointments.getAppointment_date());
            aDto.setAppintmentDuration(appointments.getDuration());
            aDto.setAppintmentType(appointments.getAppintmentType());
            aDto.setSlotAvailable(appointments.getSlot());


            apptList.add(aDto);
        });
        return  apptList;
    }

    public void addAppointments(AppointmentDTO apptDto) {
        Appointments apptObj = new Appointments();
        apptObj.setPatientName(apptDto.getPatientName());
        apptObj.setCreateDate(BookAppointmentServiceImpl.getCurrentDate());
        apptObj.setAppointment_date(apptDto.getAppintmentDate());
        apptObj.setAppintmentType(apptDto.getAppintmentType());
        apptObj.setDuration(apptDto.getAppintmentDuration());

        appointmentsRepository.save(apptObj);
    }

    public static String getCurrentDate(){
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Date date = new Date();
        return new Timestamp(date.getTime()).toString();

    }


}
