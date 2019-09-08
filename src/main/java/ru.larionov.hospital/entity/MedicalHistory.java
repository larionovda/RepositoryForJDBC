package ru.larionov.hospital.entity;

public class MedicalHistory {
    private int id;
    private String diagnosis;
    private String medicine;
    private String procedure;
    private String operation;
    private String finalDiagnosis;
    private int idPatient;
    private int idNurse;
    private int idDoctor;

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public int getIdNurse() {
        return idNurse;
    }

    public void setIdNurse(int idNurse) {
        this.idNurse = idNurse;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getFinalDiagnosis() {
        return finalDiagnosis;
    }

    public void setFinalDiagnosis(String finalDiagnosis) {
        this.finalDiagnosis = finalDiagnosis;
    }

    @Override
    public String toString() {
        return "MedicalHistory{" +
                "id=" + id +
                ", diagnosis='" + diagnosis + '\'' +
                ", medicine='" + medicine + '\'' +
                ", procedure='" + procedure + '\'' +
                ", operation='" + operation + '\'' +
                ", finalDiagnosis='" + finalDiagnosis + '\'' +
                ", idPatient=" + idPatient +
                ", idNurse=" + idNurse +
                ", idDoctor=" + idDoctor +
                '}';
    }
}