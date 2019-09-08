package ru.larionov.hospital.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.larionov.hospital.entity.MedicalHistory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicalHistoryMapper implements RowMapper<MedicalHistory> {
    @Override
    public MedicalHistory mapRow(ResultSet resultSet, int i) throws SQLException {
        MedicalHistory medicalHistory = new MedicalHistory();
        medicalHistory.setId(resultSet.getInt("id"));
        medicalHistory.setDiagnosis(resultSet.getString("diagnosis"));
        medicalHistory.setMedicine(resultSet.getString("medicine"));
        medicalHistory.setProcedure(resultSet.getString("procedures"));
        medicalHistory.setOperation(resultSet.getString("operation"));
        medicalHistory.setFinalDiagnosis(resultSet.getString("final_diagnosis"));
        medicalHistory.setIdPatient(resultSet.getInt("id_patient"));
        medicalHistory.setIdNurse(resultSet.getInt("id_nurse"));
        medicalHistory.setIdDoctor(resultSet.getInt("id_doctor"));
        return medicalHistory;
    }
}