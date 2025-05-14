package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroRegion extends Filtro{
	private String region;
	public FiltroRegion(String reg) {
		this.region=reg;
	}
	@Override
	public Boolean apply(Pais pais) {
		// los string es una ñlista de caracteres -> entonces se puede comparar con otro
		// strarwith compara los prefijos, cada caracter con cada caracter segun el orden de la palabra
		return pais.getRegion().startsWith(region);
	}

}
