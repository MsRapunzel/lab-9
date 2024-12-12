/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.msrapunzel;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author msrapunzel
 */
@Path("/calculation")
public class CalculationController {
    
    @Inject
    private CalculationBean calculationBean;

    @GET
    @Path("/add")
    @jakarta.ws.rs.Produces(MediaType.TEXT_PLAIN)
    public String add() {
        calculationBean.add(5); // Додаємо 5
        return "Current Value after addition: " + calculationBean.getCurrentValue();
    }

    @GET
    @Path("/subtract")
    @jakarta.ws.rs.Produces(MediaType.TEXT_PLAIN)
    public String subtract() {
        calculationBean.subtract(3); // Віднімаємо 3
        return "Current Value after subtraction: " + calculationBean.getCurrentValue();
    }
}
