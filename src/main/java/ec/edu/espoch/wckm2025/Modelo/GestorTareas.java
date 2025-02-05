/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.wckm2025.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class GestorTareas {
    
    private List<Tarea> tareas;
    private int contadorId;

    public GestorTareas() {
        tareas = new ArrayList<>();
        contadorId = 1; // Iniciar el contador de ID
    }

    public void agregarTarea(String titulo, String descripcion) {
        Tarea nuevaTarea = new Tarea(contadorId++, titulo, descripcion);
        tareas.add(nuevaTarea);
    }

    public List<Tarea> listarTareasPendientes() {
        List<Tarea> pendientes = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                pendientes.add(tarea);
            }
        }
        return pendientes;
    }

    public List<Tarea> listarTareasCompletadas() {
        List<Tarea> completadas = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (tarea.isCompletada()) {
                completadas.add(tarea);
            }
        }
        return completadas;
    }

    public void marcarComoCompletada(int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.marcarComoCompletada();
                break;
            }
        }
    }
    
}
