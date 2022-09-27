import org.junit.*;
import org.junit.runners.MethodSorters;
import org.testng.annotations.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class AnimalTestes {

    @BeforeClass
    public void setup(){
        AnimalBuilder.retornagato();
        AnimalBuilder.retornarCachorro();
        AnimalBuilder.retornaave();
        System.out.println("Gato, Cachorro, Ave");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After");
    }

    @Test

    public void testeAlimentação() {

        //given
        AnimalService animalService = new AnimalServiceImpl();

        Animal animal =
                AnimalBuilder.retornaave().getAnimal();

        //when
        animalService.alimentar(animal);

        //then
        System.out.println(animal);
    }

    @Test
    public void testeComparacaoAnimal() {

        //Given
        AnimalService animalService = new AnimalServiceImpl();

        Animal cachorro =
                AnimalBuilder.retornarCachorro().getAnimal();

        Animal gato =
                AnimalBuilder.retornagato().getAnimal();

        Animal ave =
                AnimalBuilder.retornaave().getAnimal();

        // When
        animalService.toString();

        //Then - EQUALS
        Assert.assertNotEquals(cachorro, ave);
        Assert.assertNotEquals(gato, ave);

    }

    @Test
    public void testeTipo() {

        //Given
        AnimalService animalService = new AnimalServiceImpl();

        Animal cachorro =
                AnimalBuilder.retornarCachorro().getAnimal();

        Animal gato =
                AnimalBuilder.retornagato().getAnimal();

        Animal ave =
                AnimalBuilder.retornaave().getAnimal();


        // When
        animalService.brincar();

        //Then THAT
        Assert.assertThat(cachorro.getPorteAnimal(), is(equalTo("M")));

        Assert.assertThat(ave.getTipoAnimal(), is(not("Cachorro")));

    }

}


