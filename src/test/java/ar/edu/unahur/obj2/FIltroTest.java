package ar.edu.unahur.obj2;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.filters.FiltroInsular;
import ar.edu.unahur.obj2.filters.FiltroPoblacion;
import ar.edu.unahur.obj2.filters.Filtroidioma;
import ar.edu.unahur.obj2.filters.FiltroRegion;
import ar.edu.unahur.obj2.filters.IFiltro;
import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;

public class FIltroTest {
	
// devuelve todos los datps de los paises donde el idioma es Q"arabic"
    @Test
	void prueba() {
		IPaisService paisService = new PaisService();
		List<Pais> paises = paisService.getPaises();
        IFiltro filtro= new Filtroidioma("Arabic");
        
        //seg filtro:
        IFiltro filtro2= new Filtroidioma("Arabic").and(new Filtroidioma("French"));
        
        IFiltro filtro3= new FiltroInsular(); 
        
        IFiltro filtro4= filtro.and(filtro3);
        
        IFiltro filtro5 = new FiltroPoblacion(10000000);
    //en la variable pone la condicionm
        var paisesFiltrados = paises.stream().filter(
        		// appy hace que te devuelva un Booleano -esp espera filter (una conducion)
        		//.list() te devuelve la lista de obj que cumple con esa condicion 
        		p-> filtro3.apply(p)).toList();
        System.out.println(paisesFiltrados);
        
        //con el filtro 1
        var paisesFiltrados1 = paises.stream().filter(
        		p-> filtro.apply(p)).toList();
        System.out.println(paisesFiltrados1);
        
        //con el filtro 4
        var paisesFiltrados2 = paises.stream().filter(
        		p-> filtro4.apply(p)).toList();
        System.out.println(paisesFiltrados2);
        

        //con el filtro 5
        var paisesFiltrados3 = paises.stream().filter(
        		p-> filtro5.apply(p)).toList();
        System.out.println(paisesFiltrados3);
}
    void FiltroRegion() {
    	 IPaisService paisService = new PaisService();
		 List<Pais> paises = paisService.getPaises();
    	 IFiltro filtro6 = new FiltroRegion("Asia");
    	 
    	  var paisesFiltrados6 = paises.stream().filter(
          		p-> filtro6.apply(p)).toList();
          System.out.println(paisesFiltrados6);
    	 
    }
    
}
