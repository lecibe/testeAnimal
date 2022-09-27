public class AnimalServiceImpl implements AnimalService {


    @Override
    public void brincar() {
        System.out.println("Brincando com animal");

    }

    @Override
    public void darBanho(Animal animal) {
        System.out.println("Animal tomando banho");

    }

    @Override
    public void alimentar(Animal animal) {
        System.out.println("Alimentando animal");

    }
}
