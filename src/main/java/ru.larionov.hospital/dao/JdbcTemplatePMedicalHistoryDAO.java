package ru.larionov.hospital.dao;

import org.springframework.stereotype.Component;
import ru.larionov.hospital.entity.MedicalHistory;

import java.util.List;

@Component
public interface JdbcTemplatePMedicalHistoryDAO {

    MedicalHistory getMedicalHistoryByIdPatient(int idPatient);

}