/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import exceptions.IllegalTemperatureException;

/**
 *
 * @author Javier_T
 */
public class Temperature {
    
    private double celsius;
    private double kelvin;

    public Temperature() {
    }

    public double getC() {
        return celsius;
    }

    public double getK() {
        return kelvin;
    }

    public void setC(double celsius) throws IllegalTemperatureException {
        if (celsius < -273.15) {
            throw new IllegalTemperatureException("No se admite un valor menor de -273.15ºC ya que no será posible convertirlo a Kelvin");
        } else {
            this.celsius = celsius;
        }
    }

    public void setK(double kelvin) throws IllegalTemperatureException {
        if (kelvin < 0) {
            throw new IllegalTemperatureException("No se admite un valor menor de 0º en la escala Kelvin");
        } else {
            this.kelvin = kelvin;
        }
    }
}
