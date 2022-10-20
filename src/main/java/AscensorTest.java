import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
public class AscensorTest {

    @Rule
    public ExpectedException exception=ExpectedException.none();

    private Ascensor ascensor;

    @Before
    public void  before(){
        ascensor=new Ascensor();
    }

    @Test

    public void SeCreaUnaPersona() throws Exception{


        System.out.println("==================================== "+ascensor);



        assertArrayEquals(new int[]{1,2},ascensor.CrearPersona());
    }
    @Test
    public void CuandoElDestinoYElOrigenSonIguales() throws Exception {
        System.out.println("==================================== "+ascensor);
        exception.expect(Exception.class);
        ascensor.VerificarPersona(1,1);
    }
    @Test
    public void CuandoSubeUnaPersonaDePiso() throws Exception {

        System.out.println("==================================== "+ascensor);

        assertEquals("El asensor Sube 1 pisos",ascensor.UsarAsensor(1,2));
    }

    @Test
    public void CuandoSeLLamaAlAsensorDesdeOtroPiso() throws Exception {


        System.out.println("==================================== "+ascensor);


        assertEquals("El asensor Sube 1 pisos El asensor Baja 1 pisos ", ascensor.UsarAsensor(2,1));
    }
}

