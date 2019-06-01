package assignment.TicketLine;

public class TicketA extends Thread{
    public static int tickets = 100;
    public static String str  =  new String("哈哈");
    public void run() {
        while (true) {
            synchronized (str) {
                if (tickets > 0) {
                    System.out.println("第"+Thread.currentThread().getName()+"个线程卖出了第" + tickets+"张票" );
                    --tickets;
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketA aa1 = new TicketA();
        TicketA aa2 = new TicketA();
        aa1.start();
        aa2.start();

    }

}