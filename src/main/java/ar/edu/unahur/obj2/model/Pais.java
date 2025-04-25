package ar.edu.unahur.obj2.model;

import java.util.List;

public class Pais {
    private String nombre;
    private String capital; 
    private String region;
    private String subRegion; 
    private Long poblacion;
    private List<String> idiomas;
    private List<String> limites;

    public Pais(DatosPais dp){
        this.nombre = dp.nombre();
        this.capital = dp.capital();
        this.region = dp.region();
        this.subRegion = dp.subRegion();
        this.poblacion = dp.poblacion();
        this.idiomas = dp.idiomas().stream()
                .map(i -> i.name())
                .toList();
        this.limites = dp.limites();
    }

    public Boolean esIsla(){
        return this.limites == null || this.limites.isEmpty();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegion() {
        return region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public Long getPoblacion() {
        return poblacion;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    @Override
    public String toString() {
        return "Pais [nombre=" + nombre + ", capital=" + capital + ", region=" + region + ", subRegion=" + subRegion
                + ", poblacion=" + poblacion + ", idiomas=" + idiomas + ", esIsla()=" + esIsla() + "]";
    }

    

}

