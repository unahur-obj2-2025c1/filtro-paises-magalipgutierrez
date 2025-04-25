package ar.edu.unahur.obj2.service;

import java.util.List;

public interface IConvierteDatos {
    
    <T> List<T> obtenerListaDatos(String json, Class<T> clase);
}

