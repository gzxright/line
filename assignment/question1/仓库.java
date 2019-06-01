package assignment.question1;

public class 仓库 {
    private int production;

    public 仓库(int production) {
        this.production = production;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) throws Exception {
        if(production>1000){
            throw new Exception("本仓库容量1000");
        }
        this.production = production;
    }
}
