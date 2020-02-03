package b_structural.decorator_demo.ownDecor;

public class OwnDecorMain {
    public static void main(String[] args) {

        Table table1 = new DiningTable(TableBaseType.M300,TopType.OAK,100,300);
        table1.printTable();
        System.out.println();
        new MetalFrameAroundTop(table1,FrameType.STEEL_BRACKET).printTable();

    }
}
