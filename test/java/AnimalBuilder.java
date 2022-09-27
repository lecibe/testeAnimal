import com.beust.ah.A;

public class AnimalBuilder {

    private Animal animal;

    public static AnimalBuilder retornarCachorro(){
        AnimalBuilder cachorro = new AnimalBuilder();
        cachorro.animal = new Animal("Cachorro", "M", false, false);
        return cachorro;
    }

    public static AnimalBuilder retornagato(){
        AnimalBuilder gato = new AnimalBuilder();
        gato.animal = new Animal("Gato", "M", false, false);
        return gato;
    }

    public static AnimalBuilder retornaave(){
        AnimalBuilder ave = new AnimalBuilder();
        ave.animal = new Animal("Passáro", "P", true, false);
        return ave;
    }


    public AnimalBuilder voar(){
        animal.setPodeVoar(true);
        return this;
    }

    public AnimalBuilder nadar(){
        animal.setPodeNadar(true);
        return this;
    }

    public Animal getAnimal(){
        return animal;
    }

}

