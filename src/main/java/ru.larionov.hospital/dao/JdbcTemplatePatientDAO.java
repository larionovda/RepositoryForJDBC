package ru.larionov.hospital.dao;

import ru.larionov.hospital.entity.Patient;

public interface JdbcTemplatePatientDAO {
    Patient getPatientById(int id);
}
