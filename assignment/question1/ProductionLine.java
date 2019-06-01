package assignment.question1;

public class ProductionLine {
    private String name;
    private int production;


    public ProductionLine(String name, int production) {
        this.name = name;
        this.production = production;
    }
    void 生产10分钟(){
        production = (int)(100*Math.random())+production;
    }

    public static void main(String[] args) {
        System.out.println((int)(1000*Math.random()));
    }
}
