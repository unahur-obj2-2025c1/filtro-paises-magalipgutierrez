package ar.edu.unahur.obj2.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.core.io.ClassPathResource;

public class ConsumoRecurso {

    private static final String FILEPAIS = "paises.json";

    public String obtenerDatos(){
        String json = null;
            try {
                ClassPathResource resource = new ClassPathResource(FILEPAIS);
                Path path = Paths.get(resource.getURI());
                json = Files.readString(path);
            } catch (IOException ioException) {
                throw new RuntimeException("Error al consumir el archivo: " + FILEPAIS, ioException);
            }
        return json;
    }


}
