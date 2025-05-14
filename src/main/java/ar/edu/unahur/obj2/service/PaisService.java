package ar.edu.unahur.obj2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.model.DatosPais;
import ar.edu.unahur.obj2.model.Pais;

public class PaisService implements IPaisService {
   //aca va creando las variables 
    private final ConsumoRecurso consumoRecurso = new ConsumoRecurso();
    private final ConvierteDatos conversor = new ConvierteDatos();
    //aca armamos una lista con los datosPaises, info que se trae del arcivo paises.json
    private List <DatosPais> datosPaises = new ArrayList<>();

    @Override
    public List<Pais> getPaises() { 
    	//si la lista esta vacia -> solicitar el dato pais: una fc q se desarrolla mas abajo
        if(datosPaises.isEmpty()){
            datosPaises = solicitarPaises();
        }  
        //aca la convertimos en dato pais, que es con la lista que vamos a trabajar
        return datosPaises.stream()
                .map(dp -> new Pais(dp))
                .collect(Collectors.toList());
        
    }
    //solicitar te devuelve una lista con los datos que se guardan en la variable json
    private List<DatosPais> solicitarPaises(){
        var json = consumoRecurso.obtenerDatos();
        return conversor.obtenerListaDatos(json, DatosPais.class);
    }
}
