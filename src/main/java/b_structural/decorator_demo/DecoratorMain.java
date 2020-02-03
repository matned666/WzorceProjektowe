package b_structural.decorator_demo;

public class DecoratorMain {
    public static void main(String[] args) {

        System.out.println("Tworzenie zwykłych obiektów Shape...");
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        System.out.println("Rysowanie zwykłych obiektów Shape...");
        rectangle.draw();
        System.out.println();
        circle.draw();
        System.out.println();
        System.out.println("Tworzenie udekorowanego czerwonego koła " +
                "z niebieskim obrysem w stylu rokokoko  i grubością linii 2");
        Shape circle1 = new FillColorDecorator(
                new LineColorDecorator(
                        new StyleDecorator(
                                new LineThicknessDecorator(
                                        new Circle(), 2.0d
                                )
                        , LineStyle.ROKOKOKO)
                , Color.BLUE)
        ,Color.RED);
        circle1.draw();
        System.out.println(".");
        System.out.println(circle1.description()+".");
        System.out.println("");
        Shape rectangle2 = new FillColorDecorator(new LineThicknessDecorator(new Rectangle(), 5.0d),Color.GREY);
        System.out.println(rectangle2.description()+".");
        System.out.println(new StyleDecorator(rectangle,LineStyle.ROKOKOKO).description()+".");

        rectangle2.draw();


    }
}
