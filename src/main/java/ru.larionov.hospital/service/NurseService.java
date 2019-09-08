package ru.larionov.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.larionov.hospital.dao.JdbcTemplateNurseDAO;

@Component
public class NurseService {
    @Autowired
    private JdbcTemplateNurseDAO jdbcTemplateNurseDAO;

    public void setMedicine(String medicine, int patientId, int nurseId ){
        jdbcTemplateNurseDAO.setMedicine(medicine, patientId, nurseId);
    }

    public void setProcedure(String procedure, int patientId, int nurseId){
        jdbcTemplateNurseDAO.setProcedure(procedure, patientId, nurseId);
    }

}