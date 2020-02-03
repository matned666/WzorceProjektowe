package b_structural.decorator_demo.ownDecor;

import java.sql.SQLOutput;

public class DiningTable implements Table{

    private TableBaseType tableBaseType;
    private TopType topType;
    private int topWidth;
    private int topLength;

    public DiningTable(TableBaseType tableBaseType, TopType topType, int topWidth, int topLength) {
        this.tableBaseType = tableBaseType;
        this.topType = topType;
        this.topWidth = topWidth;
        this.topLength = topLength;
    }

    public void printTable(){
        System.out.print("Dining table with base type: "+tableBaseType+", top: "+topLength+"x"+topWidth+"cm, "+topType);
    }
}
