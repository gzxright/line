package assignment.question1;

public class 货车 {
    private int production;

    public 货车(int production) {
        this.production = production;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) throws Exception {
        if(production>100){
            throw new Exception("本货车最大装载量100份奶酪");
        }
        this.production = production;
    }
}
