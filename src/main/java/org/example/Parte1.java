package org.example;

import java.io.*;

public class Parte1 {

    // 1 Crear un archivo con contenido (no me di cuenta de que no pedía método)
    public static void main(String[] args) {
        String ruta = "C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\texto1.txt";
        String contenido = "Tanjiro \nNezuko \nMuzan\n";

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta))) {
            escritor.write(contenido);
            System.out.println("Archivo creado");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }

    // 2 Copiar archivo byte a byte usando un bucle por cada byte hasa que no queden
    // origen "C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\texto1.txt"
    //destino "C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\texto2.txt"

    public static void copiaArchivo(String ruta_origen, String ruta_destino) {
        File origen = new File(ruta_origen);
        File destino = new File(ruta_destino);

        try (FileInputStream in = new FileInputStream(origen);
             FileOutputStream out = new FileOutputStream(destino)) {

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

    // 3 Añade contenido en ved de sustituirlo
    // origen "C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\texto1.txt"
    //destino "C:\\Users\\DIEGO CURRÁS\\Desktop\\DAM2\\Acceso_Datos\\Trimestre_1\\texto3.txt"

    public static void addArchivo(String ruta_origen, String ruta_destino) {
        File origen = new File(ruta_origen);
        File destino = new File(ruta_destino);

        try (FileInputStream in = new FileInputStream(origen);
             FileOutputStream out = new FileOutputStream(destino, true)) {

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
}
