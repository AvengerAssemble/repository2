public class day13 implements Runnable{
    @Override
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了"+Thread.currentThread().getName());
        System.out.println("教练走了，回游泳池去了");
    }
}
