package assignment.Ticket0;

public class User {
   private String name;
   private int ticketCount;

    public User(String name, int ticketCount) {
        this.name = name;
        this.ticketCount = ticketCount;
    }

    int   buyTicket(int buyNum,int totalTicket){
            if(buyNum>totalTicket){
                    System.out.println(name+"你要购买"+buyNum+"张票,现在余票"+totalTicket+"张,所以无法购买成功");
                    return totalTicket;
            }
            System.out.println("还剩"+(totalTicket-buyNum)+"张票");
            return totalTicket-buyNum;
        }


    public String getName() {
        return name;
    }


    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

}
