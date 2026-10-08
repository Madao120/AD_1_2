package org.example;

import java.io.*;

import static java.lang.System.in;

public class Parte3 {

    public static void escribir_fichero(String rutaArchivo, String cadena) {

        try {
            FileOutputStream archivo = new FileOutputStream(rutaArchivo);
            DataOutputStream datos = new DataOutputStream(archivo);

            for (int i = 0; i < 3; i++) { //contador

                System.out.println("escribindo a cadea: " + cadena);

                datos.writeUTF(cadena);

                System.out.println("tamano do ficheiro: " + datos.size() + " bytes");
            }

            System.out.println("tamano final do ficheiro: " + datos.size() + " bytes");

            datos.close();
            archivo.close();

        } catch (IOException e) {
            System.out.println("Error al escribir el ficheiro");
        }
    }

    public static void leer_fichero(String rutaArchivo) {

        try {
            FileInputStream archivo = new FileInputStream(rutaArchivo);
            DataInputStream datos = new DataInputStream(archivo);

            while (datos.available() > 0) {

                System.out.println("quedan: " + datos.available() + " bytes por ler");

                String cadena = datos.readUTF();

                System.out.println("cadea: " + cadena);
            }

            System.out.println("Xa non queda nada por ler");

            datos.close();
            archivo.close();

        } catch (IOException e) {
            System.out.println("Error al leer el ficheiro");
        }
    }

    public static void main(){
        // escribir_fichero("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\texto3.txt", "o tempo está xélido");
        leer_fichero("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\texto3.txt");
    }
}