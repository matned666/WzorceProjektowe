package b_structural.decorator_demo;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.print("Rysuję koło");
    }

    @Override
    public void resize() {
        System.out.print("Zmieniam rozmiar koła");

    }

    @Override
    public String description() {
        return "Obiekt: koło";
    }

    @Override
    public boolean isHidden() {
        return false;
    }
}
