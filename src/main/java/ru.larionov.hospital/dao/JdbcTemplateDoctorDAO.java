package ru.larionov.hospital.dao;

import org.springframework.stereotype.Component;
import ru.larionov.hospital.entity.Doctor;

@Component
public interface JdbcTemplateDoctorDAO {
    Doctor getDoctorById(int id);

    void setMedicine(String medicine, int id_patient, int id_doctor);

    void setProcedure(String procedure, int id_patient, int id_doctor);

    void setDiagnosis(String diagnosis, int id_patient, int id_doctor);

    void setOperation(String operation, int id_patient, int id_doctor);

    void addPatient(int id, String firstName, String lastName);

    int getCountPatients();

    void removePatientById(int id);

    void removePatientByName(String name, String diagnosis);
}
