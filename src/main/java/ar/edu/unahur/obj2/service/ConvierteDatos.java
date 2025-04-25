package ar.edu.unahur.obj2.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos{
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> List<T> obtenerListaDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, clase));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error al deserializar la lista de objetos", e);
        }
    }
}
