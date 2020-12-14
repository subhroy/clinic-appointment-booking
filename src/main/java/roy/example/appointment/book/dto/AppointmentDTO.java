package roy.example.appointment.book.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
public class AppointmentDTO implements Serializable {

    Integer appintmentId;
    String patientName;
    String appintmentDate;
    String appintmentType;
    String appintmentDuration;
    String slotAvailable;

    @Override
    public String toString() {
        return "AppointmentDTO{" +
                "appintmentId=" + appintmentId +
                ", patientName='" + patientName + '\'' +
                ", appintmentDate='" + appintmentDate + '\'' +
                ", appintmentDuration='" + appintmentDuration + '\'' +
                ", slotAvailable='" + slotAvailable + '\'' +
                '}';
    }
}
