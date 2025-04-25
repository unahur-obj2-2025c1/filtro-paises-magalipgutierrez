package ar.edu.unahur.obj2;
import java.util.List;
import org.junit.jupiter.api.Test;
import ar.edu.unahur.obj2.filters.IFiltro;
import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;

public class FIltroTest {

    @Test
	void prueba() {
		IPaisService paisService = new PaisService();
        List<Pais> paises = paisService.getPaises();
       
    
}
}