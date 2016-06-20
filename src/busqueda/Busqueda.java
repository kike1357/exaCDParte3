package busqueda;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Busqueda {

    public static void main(String[] args) {
        
        int tamaño;
        tamaño=Integer.parseInt(JOptionPane.showInputDialog("Introduce tamaño del array")); 
        int[] numeros = new int[tamaño];
        int clave;
        clave = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero clave"));
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, clave, 0, numeros.length - 1);
        System.out.println("El indice del valor buscado es: " + indice);
  

    }

    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        }
    }
}
