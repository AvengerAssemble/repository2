import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {

//    public static void main(String[] args){
////        Day day = new Day();
////         day.show();
//        Laptop it = new Laptop();
//        it.run();
//
//        Mouse u = new Mouse();
//        it.useUSB(u);
//
//        KeyBoard kb = new KeyBoard();
//        it.useUSB(kb);
//
//        it.shutDown();
//    }


    //        public static void main(String[] args){
//
//
//            hah h = new hah();
//
//            Cat c = new Cat();
//            h.yoxi(c);
//
//
//            Dog d = new Dog();
//            h.yoxi(d);
//
//
//
//        }
    public static void main(String[] args) {
//    day12 t = new day12();
//    Thread t1 = new Thread(t,"窗口1");
//    Thread t2 = new Thread(t,"窗口2");
//    Thread t3 = new Thread(t,"窗口3");
//
//    t1.start();
//    t2.start();
//    t3.start();

//    ExecutorService service = Executors.newFixedThreadPool(2);
//
//    day13 stock = new day13();

//    Thread t = new Thread(stock);
//    t.start();
//    service.submit(stock);
//    service.submit(stock);
//    service.submit(stock);
//    int num =5;
//    int sum = getSum(num);
//    System.out.println(sum);
//
//}
//public static  int getSum(int num){
//    if(num == 1){
//        return 1;
//    }
//    return num + getSum(num-1);//5+4+3+2+1
//}
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void change(int a, int b) {
        a = a + b;
        b = a + b;
    }
}