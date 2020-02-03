package b_structural.decorator_demo.ownDecor;

public abstract class TableDecorator implements Table {

    Table decoratedTable;

    public TableDecorator(Table decoratedTable) {
        super();
        this.decoratedTable = decoratedTable;
    }

}
