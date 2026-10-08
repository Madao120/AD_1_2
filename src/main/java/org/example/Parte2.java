package org.example;

import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Parte2 {
    public static void copia_archivo_buffered(String ruta_origen, String ruta_destino) {
        File origen = new File(ruta_origen);
        File destino = new File(ruta_destino);

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(origen));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destino))) {

            int b;
            // Lee el archivo byte a byte (-1 indica el final del archivo)
            while ((b = in.read()) != -1) {
                out.write(b);
            }

            System.out.println("Copia completada");
        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Parte 2 1
        copia_archivo_buffered("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\AD_1_2\\imagen.png", "C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\AD_1_2\\imagen1.png");
        // Parte 2 2
        copia_archivo_buffered("C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\AD_1_2\\imagen.png", "C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\AD_1_2\\imagen3.png");
    }
}


