package a_creational.builder_demo;

public class BuilderMain {
    public static void main(String[] args) {
        // używamy buildera, żeby dostać obiekt z zawsze dobrym stanem i parametrami
        //dla obiektów prostych lepsza jest metoda wytwórcza czyli factory

        System.out.println("People:");
        Human adas = new Human.HumanBuilder("Male", "Adam", "28")
                .isWorshiper(true)
                .didCommitSin(false)
                .buid();
        System.out.println(adas.toString());

        Human ewa = new Human.HumanBuilder("Female", "Ewa", "25")
                .isWorshiper(true)
                .didCommitSin(true)
                .buid();
        System.out.println(ewa.toString());
        System.out.println("Animals:");

        Animal iguana = new Animal.AnimalBuilder("male",3,"raptor")
                .continent("Australia")
                .isPredator(true)
                .buid();

        System.out.println(iguana.toString());

    }
}
