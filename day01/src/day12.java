public class day12 implements Runnable {

    private int ticket=100;

    @Override
    public void run() {

        while(true){
            sellTicket();
        }
    }
    public synchronized void sellTicket(){//同步方法
        if(ticket>0){
            try {
                Thread.sleep(100);//模拟出票时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            System.out.println(name+"正在卖:"+ticket--);
        }
    }



}
