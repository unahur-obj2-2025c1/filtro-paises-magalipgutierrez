package ar.edu.unahur.obj2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Idioma(
    String iso639_1,
    String iso639_2,
    String name,
    String nativeName) {

}
