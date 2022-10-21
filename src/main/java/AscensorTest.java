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

            //Se prueba la creacion de persona.

        System.out.println("==================================== "+ascensor);



        assertArrayEquals(new int[]{1,2},ascensor.CrearPersona());
    }
    @Test
    public void CuandoElDestinoYElOrigenSonIguales() throws Exception {

        //Se prueba la validacion de que el origen y destino de una persona no sean iguales.

        System.out.println("==================================== "+ascensor);
        exception.expect(Exception.class);
        ascensor.VerificarPersona(1,1);
    }
    @Test
    public void CuandoSubeUnaPersonaDePiso() throws Exception {

        //Se hace una prueba simple de subir del piso 1 al 2

        System.out.println("==================================== "+ascensor);

        assertEquals("El asensor Sube 1 pisos",ascensor.UsarAsensor(1,2));
    }

    @Test
    public void CuandoSeLLamaAlAsensorDesdeOtroPiso() throws Exception {

        //Se hace una prueba de llamar el asensor a al segundo piso para bajar al primer piso.

        System.out.println("==================================== "+ascensor);


        assertEquals("El asensor Sube 1 pisos El asensor Baja 1 pisos ", ascensor.UsarAsensor(2,1));
    }

    @Test
    public void CuandoElDestinoYelOrigenSonElMismoEnElAsensor() throws Exception{
        //Se Prueba el uso del asensor cuando el destino y origen de una persona es el mismo.
        System.out.println("==================================== "+ascensor);
        exception.expect(Exception.class);
        ascensor.UsarAsensor(1,1);

    }
}

