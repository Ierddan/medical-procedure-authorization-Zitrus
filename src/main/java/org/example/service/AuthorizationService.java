package org.example.service;

import org.example.entity.AuthorizationRequest;
import org.example.entity.AuthorizationRule;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorizationService {
    private List<AuthorizationRule> authorizationRules;

    public AuthorizationService() {
        authorizationRules = new ArrayList<>();
    }

    public void loadAuthorizationRulesFromDatabase() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/testdb", "user", "user")) {
            String query = "SELECT * FROM authorization_rule";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    AuthorizationRule rule = AuthorizationRule.fromResultSet(resultSet);
                    authorizationRules.add(rule);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String checkAuthorization(AuthorizationRequest request) {
        for (AuthorizationRule rule : authorizationRules) {
            if (rule.getCodAuthorizationRule() == request.getCodAuthorizationRule()
                    && rule.getAge() == request.getPatientAge()
                    && rule.getGender() == request.getPatientGender()) {
                return "Authorized procedure!";
            }
        }
        return "Procedure not listed in the registered rules, deny authorization\n";
    }
}