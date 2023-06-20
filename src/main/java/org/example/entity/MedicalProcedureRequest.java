package org.example.entity;

public class MedicalProcedureRequest {

    private int idMedicalProcedureRequest;
    private int codMedicalProcedure;
    private int patientAge;
    private char patientGender;

    public int getIdMedicalProcedureRequest() {
        return idMedicalProcedureRequest;
    }

    public int getCodMedicalProcedure() {
        return codMedicalProcedure;
    }

    public void setCodMedicalProcedure(int codMedicalProcedure) {
        this.codMedicalProcedure = codMedicalProcedure;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public char getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(char patientGender) {
        this.patientGender = patientGender;
    }
}
