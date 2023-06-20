package org.example.entity;

public class MedicalProcedure {

    private int idMedicalProcedure;
    private int codMedicalProcedure;
    private int age;
    private char gender;
    private String allowed;

    public int getIdMedicalProcedure() {
        return idMedicalProcedure;
    }

    public int getCodMedicalProcedure() {
        return codMedicalProcedure;
    }

    public void setCodMedicalProcedure(int codMedicalProcedure) {
        this.codMedicalProcedure = codMedicalProcedure;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAllowed() {
        return allowed;
    }

    public void setAllowed(String allowed) {
        this.allowed = allowed;
    }
}
