package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAnd extends FiltroCompuesto{
// constructor 1
	public FiltroAnd(List<IFiltro> filtros) {
		this.filtros=filtros;
	}
	// constructor2
	public FiltroAnd(IFiltro actual, IFiltro nuevo) {
		this.addFiltro(actual);
		this.addFiltro(nuevo);
	}
//ue se cumpla todas las condiciones de los filtros
@Override
	public Boolean apply(Pais pais) {
	// 
		return this.filtros.stream().allMatch(f -> f.apply(pais));
}
	public IFiltro or(IFiltro f) {
		return new FiltroOr(this, f);
	}
	
}
