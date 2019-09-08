package ru.larionov.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.larionov.hospital.dao.JdbcTemplateDoctorDAO;

@Component
public class DoctorService {
    @Autowired
    private JdbcTemplateDoctorDAO jdbcTemplateDoctorDAO;

    public void setMedicine(String medicine, int patientId, int doctorId ){
        jdbcTemplateDoctorDAO.setMedicine(medicine, patientId, doctorId);
    }

    public void setProcedure(String procedure, int patientId, int doctorId){
        jdbcTemplateDoctorDAO.setProcedure(procedure, patientId, doctorId);
    }

    public void setOpertation(String operation, int patientId, int doctorId){
        jdbcTemplateDoctorDAO.setOperation(operation, patientId, doctorId);
    }

    public void setDiagnosis(String diagnosis, int patientId, int doctorId){
        jdbcTemplateDoctorDAO.setDiagnosis(diagnosis, patientId, doctorId);
    }

    public int getCountPatients(){
        return jdbcTemplateDoctorDAO.getCountPatients();
    }
}
