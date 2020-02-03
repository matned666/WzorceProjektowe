package b_structural.decorator_demo;

public class LineColorDecorator extends ShapeDecorator {
    protected Color lineColor;

    public LineColorDecorator(Shape decoratedShape, Color lineColor) {
        super(decoratedShape);
        this.lineColor = lineColor;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.print(", o kolorze linii: "+lineColor);
    }

    @Override
    public void resize() {
        decoratedShape.resize();  //bez funkcjonalności

    }

    @Override
    public String description() {
        return decoratedShape.description()+", z linią w kolorze:  "+lineColor;
    }

    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }
}
