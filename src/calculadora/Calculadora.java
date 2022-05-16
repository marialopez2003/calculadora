/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Maria
 */
public class Calculadora {
    private double numero1;
    private double numero2;
    private String marca;
    private String modelo;

    public Calculadora(double numero1, double numero2, String marca, String modelo) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.marca=marca;
        this.modelo=modelo;
    }

    public Calculadora(String marca, String modelo) {
        this.marca=marca;
        this.modelo=modelo;
    }
    
    public Calculadora(){
        
    }
}
