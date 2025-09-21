/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa1_busqueda2d.java;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Programa1_Busqueda2DJava {

    // Declaración de la matriz 3x3
    static int[][] matriz = {
        {5, 8, 12},
        {7, 3, 9},
        {4, 6, 1}
    };

    // Método para buscar un valor en la matriz
    public static int[] buscarValor(int valor) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == valor) {
                    return new int[]{fila, columna}; // Valor encontrado
                }
            }
        }
        return new int[]{-1, -1}; // Valor no encontrado
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor a buscar en la matriz: ");
        int valorBuscado = scanner.nextInt();

        int[] posicion = buscarValor(valorBuscado);

        if (posicion[0] != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado en la posición: [" + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("Valor " + valorBuscado + " no se encontró en la matriz.");
        }
    }
    
}