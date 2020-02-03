package b_structural.decorator_demo;

public class FillColorDecorator extends ShapeDecorator {
    protected Color fillColor;

    public FillColorDecorator(Shape decoratedShape, Color fillColor) {
        super(decoratedShape);
        this.fillColor = fillColor;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.print(", z obwódką o kolorze: "+fillColor);
    }

    @Override
    public void resize() {
        decoratedShape.resize();  //bez funkcjonalności

    }

    @Override
    public String description() {
        return decoratedShape.description()+", z obwódką o kolorze: "+fillColor;
    }

    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }
}
