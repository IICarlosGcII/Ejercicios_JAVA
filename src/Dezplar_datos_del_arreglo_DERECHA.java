import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Dezplar_datos_del_arreglo_DERECHA {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Iniciamos el scanner para poder leer y guardar datos...
        int[] arreglo = new int[10]; //Declaramos es tamaño del arreglo...
        int ultimo;

        System.out.println("Guardando los datos del arreglo...");
        for(int i=0 ; i<10 ; i++) { //Guardamos los datos en el arreglo
            arreglo[i] =Integer.parseInt(JOptionPane.showInputDialog("Digite los 10 numeros del arreglo: ")); //guardamos los enteros en el arreglo.
        }
        ultimo = arreglo[9]; //le decimos al programa cual es el ultimo espacio del arreglo
        for(int i=8 ; i>=0 ; i--){ //avanzamos hacia la derecha del arreglo, arrancamos desde el 8vo digito porque son 9 y tiene que haber un espacio para correr todo
            arreglo[i+1] = arreglo[i]; //quiero que la posicion siguiente sea la que tiene antes....
        }
/*
        for (int i = 0; i < 9; i++) {
            arreglo[i] = arreglo[i + 1];
        }*/

        arreglo[0] = ultimo; //actualizamos la variable de la ultima posicon
        System.out.println("Los datos dela arreglo son: ");
        for(int i=0 ; i<10 ; i++){ //imprimimos los datos del arreglo resultante
            System.out.print(arreglo[i]+" - ");

        }
    }
}