package org.example.servlet;

import org.example.entity.AuthorizationRequest;
import org.example.service.AuthorizationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/authorize")
public class AuthorizationServlet extends HttpServlet {
    private AuthorizationService authorizationService;

    @Override
    public void init() throws ServletException {
        authorizationService = new AuthorizationService();
        authorizationService.loadAuthorizationRulesFromDatabase();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int codAuthorizationRule = Integer.parseInt(request.getParameter("codAuthorizationRule"));
        int age = Integer.parseInt(request.getParameter("patientAge"));
        char gender = request.getParameter("patientGender").charAt(0);

        AuthorizationRequest authRequest = new AuthorizationRequest(codAuthorizationRule, age, gender);

        String isAuthorized = authorizationService.checkAuthorization(authRequest);

        PrintWriter out = response.getWriter();
        out.println("Procedure " + codAuthorizationRule + ": " + isAuthorized );
    }
}
