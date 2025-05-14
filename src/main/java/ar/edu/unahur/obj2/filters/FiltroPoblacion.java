package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPoblacion extends Filtro{
	private Integer poblacion;
	//
	public FiltroPoblacion(Integer poblacion) {
		this.poblacion= poblacion;
	}

	@Override
	public Boolean apply(Pais pais) {
		// TODO Auto-generated method stub
		return pais.getPoblacion() >= poblacion;
	}

}
