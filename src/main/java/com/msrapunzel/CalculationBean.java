/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.msrapunzel;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

/**
 *
 * @author msrapunzel
 */
@Named(value = "calculationManagedBean")
@RequestScoped
public class CalculationBean {

    private int initialValue;
    private int currentValue;

    public CalculationBean() {
        this.initialValue = 0;
        this.currentValue = 0;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
        this.currentValue = initialValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void add(int value) {
        this.currentValue += value;
    }

    public void subtract(int value) {
        this.currentValue -= value;
    }
}
