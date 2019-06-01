package assignment.question1;

public class Factory {
    ProductionLine 牛奶Line=new ProductionLine("牛奶供应",0);
    ProductionLine 发酵剂Line=new ProductionLine("发酵剂制作",0);
    ProductionLine 奶酪Line=new ProductionLine("奶酪",0);

    奶酪 生产10分钟(){
        奶酪 奶酪10=new 奶酪(11);

        return 奶酪10;
    }

}
