package org.example.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorizationRule {

    private int idAuthorizationRule;
    private int codAuthorizationRule;
    private int age;
    private char gender;
    private String allowed;

    public AuthorizationRule(int codAuthorizationRule, int age, char gender, String allowed) {
        this.codAuthorizationRule = codAuthorizationRule;
        this.age = age;
        this.gender = gender;
        this.allowed = allowed;
    }

    public int getIdAuthorizationRule() {
        return idAuthorizationRule;
    }

    public int getCodAuthorizationRule() {
        return codAuthorizationRule;
    }

    public void setCodAuthorizationRule(int codAuthorizationRule) {
        this.codAuthorizationRule = codAuthorizationRule;
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

    public static AuthorizationRule fromResultSet(ResultSet resultSet) throws SQLException {
        int codAuthorizationRule = resultSet.getInt("COD_AUTHORIZATION_RULE");
        int age = resultSet.getInt("AGE");
        char gender = resultSet.getString("GENDER").charAt(0);
        String allowed = resultSet.getString("ALLOWED");

        return new AuthorizationRule(codAuthorizationRule, age, gender, allowed);
    }
}
