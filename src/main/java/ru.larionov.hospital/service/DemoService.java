package ru.larionov.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.larionov.hospital.dao.JdbcTemplateDoctorDAO;
import ru.larionov.hospital.dao.JdbcTemplatePMedicalHistoryDAOimpl;
import ru.larionov.hospital.dao.JdbcTemplatePatientDAO;
import ru.larionov.hospital.entity.Doctor;
import ru.larionov.hospital.entity.Patient;

@Component
public class DemoService {
    @Autowired
    private JdbcTemplateDoctorDAO jdbcTemplateDoctorDAO;
    @Autowired
    private JdbcTemplatePatientDAO jdbcTemplatePatientDAO;
    @Autowired
    private JdbcTemplatePMedicalHistoryDAOimpl jdbcTemplatePMedicalHistoryDAOimpl;
    @Autowired
    private DoctorService doctorService;

    public void run() {
        Doctor doctor = jdbcTemplateDoctorDAO.getDoctorById(1);
        Patient patient = jdbcTemplatePatientDAO.getPatientById(1);
        doctorService.setMedicine("Aspirin", patient.getId(), doctor.getId());
        doctorService.setProcedure("Run", patient.getId(), doctor.getId());
        doctorService.setDiagnosis("Diabet", patient.getId(), doctor.getId());
        doctorService.setOpertation("no operation scheduled", patient.getId(), doctor.getId());
        System.out.println(doctorService.getCountPatients());
        System.out.println(jdbcTemplatePMedicalHistoryDAOimpl.getMedicalHistoryByIdPatient(patient.getId()));
    }
}