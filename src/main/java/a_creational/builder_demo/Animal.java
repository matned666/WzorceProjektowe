package a_creational.builder_demo;

public class Animal {

    private String SEX;
    private int AGE;
    private String SPECIES;


    private String name;
    private String coat;
    private String continent;
    private boolean isPredator;

    public String getNAME() {
        return name;
    }

    public String getSEX() {
        return SEX;
    }

    public int getAGE() {
        return AGE;
    }

    public String getSPECIES() {
        return SPECIES;
    }

    public String getCoat() {
        return coat;
    }

    public String getContinent() {
        return continent;
    }

    public boolean isPredator() {
        return isPredator;
    }

    private Animal(AnimalBuilder animal) {
        this.SEX = animal.SEX;
        this.AGE = animal.AGE;
        this.SPECIES = animal.SPECIES;
        this.name = animal.name;
        this.coat = animal.coat;
        this.continent = animal.continent;
        this.isPredator = animal.isPredator;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "SEX='" + SEX + '\'' +
                ", AGE=" + AGE +
                ", SPECIES='" + SPECIES + '\'' +
                ", name='" + name + '\'' +
                ", coat='" + coat + '\'' +
                ", continent='" + continent + '\'' +
                ", isPredator=" + isPredator +
                '}';
    }

    static class AnimalBuilder {

        private String SEX;
        private int AGE;
        private String SPECIES;

        private String name;
        private String coat;
        private String continent;
        private boolean isPredator;

        public AnimalBuilder(String SEX, int AGE, String SPECIES) {
            this.SEX = SEX;
            this.AGE = AGE;
            this.SPECIES = SPECIES;
        }

        AnimalBuilder coat(String coat) {
            this.coat = coat;
            return this;
        }

        AnimalBuilder continent(String continent) {
            this.continent = continent;
            return this;
        }

        AnimalBuilder isPredator(boolean isPredator) {
            this.isPredator = isPredator;
            return this;
        }

        AnimalBuilder name(String name) {
            this.name = name;
            return this;
        }
        Animal buid(){ return new Animal(this);}

    }

}
