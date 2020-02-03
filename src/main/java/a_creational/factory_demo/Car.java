package a_creational.factory_demo;

public abstract class Car {

    public abstract String getType();
    public abstract String getEngine();
    public abstract String getBodyType();
    public abstract String getBrand();

    @Override
    public String toString() {
        return "Your "+ getType()+" is: "+ getEngine()+", "+getBodyType()+", "+getBrand();
    }
}
