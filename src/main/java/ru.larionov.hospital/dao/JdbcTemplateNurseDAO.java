package ru.larionov.hospital.dao;

import org.springframework.stereotype.Component;
import ru.larionov.hospital.entity.Nurse;

@Component
public interface JdbcTemplateNurseDAO {
    Nurse getNurseByID(int id);

    void setMedicine(String medicine, int id_patient, int id_doctor);

    void setProcedure(String procedure, int id_patient, int id_doctor);
}
