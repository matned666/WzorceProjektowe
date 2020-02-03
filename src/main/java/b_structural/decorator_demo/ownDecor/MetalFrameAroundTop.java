package b_structural.decorator_demo.ownDecor;

public class MetalFrameAroundTop extends TableDecorator{

    public FrameType frameType;

    public MetalFrameAroundTop(Table decoratedTable, FrameType frameType) {
        super(decoratedTable);
        this.frameType = frameType;
    }

    @Override
    public void printTable() {
        decoratedTable.printTable();
        System.out.print(", with: "+frameType);
    }
}
