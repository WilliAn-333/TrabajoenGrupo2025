/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.wckm2025.Controlador;

import ec.edu.espoch.wckm2025.Modelo.GestorTareas;
import ec.edu.espoch.wckm2025.Vista;



public class Controlador {
    private Vista vista;
    private GestorTareas modelo;
    

    public Controlador(Vista vista) {
        this.vista = vista;
        this.modelo = new GestorTareas();
    }}

            
    
 
