package a_creational.factory_demo;

public class SportVehicle extends Car {

    private String type;
    private String engine;
    private String bodyType;
    private String brand;
    private boolean isSuperSportCar;

    public SportVehicle(String engine, String bodyType, String brand) {
        this.type = this.getClass().getSimpleName();
        this.engine = engine;
        this.bodyType = bodyType;
        this.brand = brand;
        isSuperSportCar = true;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getEngine() {
        return this.engine;
    }

    @Override
    public String getBodyType() {
        return this.bodyType;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    public boolean isSuperSportCar() {
        return isSuperSportCar;
    }

    @Override
    public String toString() {
        return super.toString() + ", isSuperSportCar: " + isSuperSportCar;
    }
}
