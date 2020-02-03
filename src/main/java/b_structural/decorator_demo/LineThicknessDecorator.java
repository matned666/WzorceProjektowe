package b_structural.decorator_demo;

public class LineThicknessDecorator extends ShapeDecorator {
    protected double lineThickness;

    public LineThicknessDecorator(Shape decoratedShape, double lineThickness) {
        super(decoratedShape);
        this.lineThickness = lineThickness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.print(", o grubości linii: "+lineThickness);
    }

    @Override
    public void resize() {
        decoratedShape.resize();  //bez funkcjonalności

    }

    @Override
    public String description() {
        return decoratedShape.description()+", z linią o grubści: "+lineThickness;
    }

    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }

}
