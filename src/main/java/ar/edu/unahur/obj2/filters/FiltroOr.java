package ar.edu.unahur.obj2.filters;


import java.util.List;

import ar.edu.unahur.obj2.model.Pais;



public class FiltroOr extends FiltroCompuesto {
// aca pasamos una lista de filtros y se la agrega a filtroOr
    public FiltroOr(List<IFiltro> filtros) {
        this.filtros = filtros;
    }
   //o se puede pasar los filtros que ya tiene y agregarle un nuevo filtro 

    public FiltroOr(IFiltro actual, IFiltro nuevo) {
        this.addFiltro(actual);
        this.addFiltro(nuevo);
    }
  //ue se cumpla alguna de las condiciones de los filtros
    @Override
    public Boolean apply(Pais pais) {
        return this.filtros.stream().anyMatch(f -> f.apply(pais));
    }

    @Override
    public IFiltro and(IFiltro filtro) {
        return new FiltroAnd(this, filtro);
    }
}
