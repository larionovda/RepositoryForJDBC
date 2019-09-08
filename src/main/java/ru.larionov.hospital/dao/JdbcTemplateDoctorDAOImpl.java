package ru.larionov.hospital.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.larionov.hospital.entity.Doctor;
import ru.larionov.hospital.mapper.DoctorMapper;

@Component
public class JdbcTemplateDoctorDAOImpl implements JdbcTemplateDoctorDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final DoctorMapper DOCTOR_MAPPER = new DoctorMapper();

    @Override
    public int getCountPatients() {
        String SQL = "select count(*) from patient";
        return jdbcTemplate.queryForObject(SQL, Integer.class);
    }

    @Override
    public void removePatientByName(String name, String diagnosis) {
        String SQL = "delete from patients where name = ? and diagnosis = ?";
        jdbcTemplate.update(SQL, name, diagnosis);
    }

    @Override
    public void removePatientById(int id) {
        String SQL = "delete from patients where id = ?";
        jdbcTemplate.update(SQL, id);
    }

    @Override
    public Doctor getDoctorById(int id) {
        String SQL = "Select * from doctor where id = ?";
        return jdbcTemplate.queryForObject(SQL, DOCTOR_MAPPER, id);
    }

    @Override
    public void addPatient(int id, String firstName, String lastName) {
        String SQL = "insert into patients (id, first_name, last_name) values (?, ?, ?)";
        jdbcTemplate.update(SQL, id, firstName, lastName);
    }

    @Override
    public void setMedicine(String medicine, int id_patient, int id_doctor) {
        String SQL = "update medical_history set medicine = ? where id_patient = ? and id_doctor = ?";
        jdbcTemplate.update(SQL, medicine, id_patient, id_doctor);
    }

    @Override
    public void setProcedure(String procedure, int id_patient, int id_doctor) {
        String SQL = "update medical_history set procedures = ? where id_patient = ? and id_doctor = ?";
        jdbcTemplate.update(SQL, procedure, id_patient, id_doctor);
    }

    @Override
    public void setDiagnosis(String diagnosis, int id_patient, int id_doctor) {
        String SQL = "update medical_history set diagnosis = ? where id_patient = ? and id_doctor = ?";
        jdbcTemplate.update(SQL, diagnosis, id_patient, id_doctor);
    }

    @Override
    public void setOperation(String operation, int id_patient, int id_doctor) {
        String SQL = "update medical_history set operation = ? where id_patient = ? and id_doctor = ?";
        jdbcTemplate.update(SQL, operation, id_patient, id_doctor);
    }
}
