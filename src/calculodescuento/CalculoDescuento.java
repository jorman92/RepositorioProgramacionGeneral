/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodescuento;

/**
 *
 * @author HP
 */
public class CalculoDescuento {
    
    // Método con dos parámetros
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
        
        
    }
    // Método sobrecargado con descuento por defecto del 10%
    public static double calcularDescuento (double montoTotal) {
        return calcularDescuento (montoTotal, 10); // 10% por defecto
    
    }
    
    public static void main(String[] args) {
        double monto1 = 1000;
        double monto2 = 2500;
        
        // Llamada con descuento por defecto (10%)
        double descuento1 = calcularDescuento(monto1);
        double total1 = monto1 - descuento1;
        
        System.out.println("Descuento (10%): $" + descuento1);
        System.out.println("Monto final a pagar: $" + total1);
        
        // Llamada con descuento personalizado (15%)
        double descuento2 = calcularDescuento(monto2, 15);
        double total2 = monto2 - descuento2;
        
        System.out.println("Descuento (15%): $" + descuento2);
        System.out.println("Monto final a pagar: $" + total2);
        
    }
}
