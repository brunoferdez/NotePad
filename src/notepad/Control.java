/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notepad;

/**
 *
 * @author dam2
 */
public class Control {
    
    private Modelo miModelo;
    private Ventana miVentana;

    public Control(Modelo miModelo, Ventana miVentana) {
        this.miModelo = miModelo;
        this.miVentana = miVentana;
        System.out.println("Iniciando Constructor");
        miModelo.setTitulo("");
    }
    
    public void iniciarControl(){
        miVentana.setTitle("");
    }
    
}
