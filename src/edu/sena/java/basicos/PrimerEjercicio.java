/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.sena.java.basicos;
import java.util.Scanner;

/**
 * @author kanen
 * Hacer un programa que llene una matriz con nombre, edad y salario; y después imprima esos datos.
 */
public class PrimerEjercicio {
    //Atributos
    private Scanner lect;
    private String nombre;
    private String edad;
    private String salario;
    private String[] arreglo;

    
    public PrimerEjercicio(String nombre, String edad, String salario) {
        Scanner lect = new Scanner(System.in);
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        String[] arreglo = new String[3];
    }
    
    public void crearMatriz() {
        //Petición de los datos que irán en la matriz al usuario
        
        //Ingresar en la matriz
        
    }
    
    public void imprimir() {
        
    }
    public static void main(String[] args) {
        
    }
    
}