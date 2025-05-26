package com.campusdual.classroom;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class Exercise31 {
    public static void main(String[] args) {
        try {
            // Obtener la ruta del archivo
            Path path = Paths.get("src/main/resources/lorem.txt");

            // Leer todas las líneas del archivo
            List<String> lineas = Files.readAllLines(path);

            // Imprimir cada línea
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}