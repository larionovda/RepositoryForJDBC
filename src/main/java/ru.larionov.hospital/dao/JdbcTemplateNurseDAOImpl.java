package ru.larionov.hospital.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.larionov.hospital.entity.Nurse;
import ru.larionov.hospital.mapper.NurseMapper;

@Component
public class JdbcTemplateNurseDAOImpl implements JdbcTemplateNurseDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final NurseMapper NURSE_MAPPER = new NurseMapper();

    @Override
    public Nurse getNurseByID(int id) {
        String SQL = "Select * from nurse where id = ?";
        return jdbcTemplate.queryForObject(SQL, NURSE_MAPPER, id);
    }

    @Override
    public void setMedicine(String medicine, int id_patient, int id_nurse) {
        String SQL = "update medical_history set medicine = ? where id_patient = ? and id_nurse = ?";
        jdbcTemplate.update(SQL, medicine, id_patient, id_nurse);
    }

    @Override
    public void setProcedure(String procedure, int id_patient, int id_nurse) {
        String SQL = "update medical_history set procedure = ? where id_patient = ? and id_nurse = ?";
        jdbcTemplate.update(SQL, procedure, id_patient, id_nurse);
    }
}
