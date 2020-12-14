package roy.example.appointment.book.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer apptId;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name="created_at")
    private String createDate;
    private String appointment_date;
    @Column(name = "appointment_duration")
    private String duration;
    @Column(name = "appintment_type")
    private String appintmentType;
    @Column(name = "slot")
    private String slot;
}
