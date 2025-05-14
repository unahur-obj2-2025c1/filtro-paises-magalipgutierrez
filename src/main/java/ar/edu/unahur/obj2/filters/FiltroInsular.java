package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroInsular extends Filtro{
  // si el constructor no necesita parametros se puedeomitir crear uno, como en este caso
	//porque ya hay un metodo para evaluar en el pais que estamos
	//y ya existia el metodo esIsla dentro de Pais, que ya se encarga de dar ese booleano
	@Override
	public Boolean apply(Pais pais) {
		return pais.esIsla();	
		}

	// si no tuvieramos el metodo -> tenemos que hacer lo mimos que en filtro poblacion
	//crear un atributo-> y un constructor donde se pueda guardar el atributo
}
