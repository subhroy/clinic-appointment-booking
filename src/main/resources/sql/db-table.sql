CREATE TABLE users (
id INT(6) PRIMARY KEY AUTO_INCREMENT,
firstname VARCHAR(30) NOT NULL,
password VARCHAR(50) NOT NULL

);

--Insert data
--INSERT INTO `coding_schema`.`users` (`id`, `firstname`, `password`) VALUES ('3', 'amit', 'pass3');


-- AppointmentsTable

CREATE TABLE appointments (

 id INT(6) PRIMARY KEY,
 patient_name VARCHAR(30),
 created_at TIMESTAMP NOT NULL,
 appointment_date TIMESTAMP NOT NULL,
 appointment_duration INTEGER NOT NULL,
 appintment_type VARCHAR(10),
 slot VARCHAR(20)
);

-- INSERT INTO `coding_schema`.`Appointments` (`id`,`patient_name`, `created_at`, `appointment_date`, `appointment_duration`,`appintment_type`, `slot`) VALUES ('1','Mr. Anil', '2020-12-14 00:00:01', '2020-12-15 02:30:01', '45','MR', 'filled');
-- INSERT INTO `coding_schema`.`Appointments` (`id`,`patient_name`, `created_at`, `appointment_date`, `appointment_duration`,`appintment_type`, `slot`) VALUES ('2','Mr. Durga', '2020-12-14 00:00:01', '2020-12-15 03:30:01', '30','CT', 'filled');
