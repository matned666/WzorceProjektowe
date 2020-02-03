package b_structural.decorator_demo;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.print("Rysuję prostokąt ");
    }

    @Override
    public void resize() {
        System.out.print("Zmieniam rozmiar prostokąta ");
    }

    @Override
    public String description() {
        return "Obiekt: prostokąt ";
    }

    @Override
    public boolean isHidden() {
        return false;
    }
}
