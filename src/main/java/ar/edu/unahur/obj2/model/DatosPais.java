package ar.edu.unahur.obj2.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosPais(
    @JsonAlias("name") String nombre, 
                        String capital, 
                        String region, 
    @JsonAlias("subregion") String subRegion, 
    @JsonAlias("population") Long poblacion, 
    @JsonAlias("borders") List<String> limites, 
    @JsonAlias("languages") List<Idioma> idiomas) {

}