package org.example.entity;

public class AuthorizationRequest {

    private int idAuthorizationRequest;
    private int codAuthorizationRule;
    private int patientAge;
    private char patientGender;

    public AuthorizationRequest(int codAuthorizationRule, int patientAge, char patientGender) {
        this.codAuthorizationRule = codAuthorizationRule;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
    }

    public int getIdAuthorizationRequest() {
        return idAuthorizationRequest;
    }

    public int getCodAuthorizationRule() {
        return codAuthorizationRule;
    }

    public void setCodAuthorizationRule(int codAuthorizationRule) {
        this.codAuthorizationRule = codAuthorizationRule;
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
