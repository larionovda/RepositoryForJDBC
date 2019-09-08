package ru.larionov.hospital.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.larionov.hospital.entity.Patient;
import ru.larionov.hospital.mapper.PatientMapper;

@Component
public class JdbcTemplatePatientDAOImpl implements JdbcTemplatePatientDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final PatientMapper PATIENT_MAPPER = new PatientMapper();

    @Override
    public Patient getPatientById(int id) {
        String SQL = "select * from patient where id = ?";
        return jdbcTemplate.queryForObject(SQL, PATIENT_MAPPER, id);
    }
}
