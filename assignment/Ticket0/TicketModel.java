package assignment.Ticket0;

public class TicketModel {
    public static void main(String[] args) {
        int totalTicket=10;
        User 高1=new User("高1",0);
        User 高2=new User("高2",0);
        User 高3=new User("高3",0);
        do {
            totalTicket=高1.buyTicket(1,totalTicket);
            totalTicket=高2.buyTicket(1,totalTicket);
            totalTicket=高3.buyTicket(1,totalTicket);
        } while(totalTicket > 0);

        System.out.println("票买完了");

    }
}
