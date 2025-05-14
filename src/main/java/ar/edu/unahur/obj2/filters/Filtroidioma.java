package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class Filtroidioma extends Filtro {
// como se va a evaluar el idiioma hay q crear un constructor
	private String idioma;
	//que reciba el idioma que queremos que evalue, y recien en el constructor se guarda. No en la variable
	public Filtroidioma (String i) {
		this.idioma=i;
	}
	@Override
	public Boolean apply(Pais pais) {
		// La lista debe contener el idioma que se quiere filtrar
		//te devuelve la lista de idiomas y ese idioma se compara con el idioma de contains
		return pais.getIdiomas().contains(idioma);
	}


	
}
