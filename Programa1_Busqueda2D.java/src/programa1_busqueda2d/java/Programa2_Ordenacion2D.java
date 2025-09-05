/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa1_busqueda2d.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Programa2_Ordenacion2D {

    // Declaración de la matriz 3x3
    static int[][] matriz = {
        {9, 3, 7},
        {5, 1, 8},
        {6, 4, 2}
    };

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    // Método para ordenar una fila específica
    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]); // Ordena la fila usando Arrays.sort
        } else {
            System.out.println("Número de fila inválido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        System.out.print("\nIngrese el número de fila a ordenar (0, 1 o 2): ");
        int fila = scanner.nextInt();

        ordenarFila(matriz, fila);

        System.out.println("\nMatriz con la fila " + fila + " ordenada:");
        mostrarMatriz(matriz);
    }
}


