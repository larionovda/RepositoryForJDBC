package ru.larionov.hospital.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.larionov.hospital.entity.MedicalHistory;
import ru.larionov.hospital.mapper.MedicalHistoryMapper;

@Component
public class JdbcTemplatePMedicalHistoryDAOimpl implements JdbcTemplatePMedicalHistoryDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final MedicalHistoryMapper PATIENT_MAPPER = new MedicalHistoryMapper();

    @Override
    public MedicalHistory getMedicalHistoryByIdPatient(int idPatient) {
        String SQL = "select * from medical_history where id_patient = ?";
        return jdbcTemplate.queryForObject(SQL, PATIENT_MAPPER, idPatient);
    }
}
