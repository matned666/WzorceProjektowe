package b_structural.decorator_demo;

public class StyleDecorator extends ShapeDecorator {
    protected LineStyle lineStyle;

    public StyleDecorator(Shape decoratedShape, LineStyle lineStyle) {
        super(decoratedShape);
        this.lineStyle = lineStyle;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.print(", o stylu linii: "+lineStyle);
    }

    @Override
    public void resize() {
        decoratedShape.resize();  //bez funkcjonalności

    }

    @Override
    public String description() {
        return decoratedShape.description()+", z linią o stylu: "+lineStyle;
    }

    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }
}
