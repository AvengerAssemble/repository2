import java.util.Scanner;

public class demo {
//    public static void main(String[] args){
//        System.out.println("开始");
//        int a = 10;
//        int b = 20;
//        if(a == b){
//            System.out.println("a等于b");
//        }
//        int c = 10;
//        if(a == c){
//            System.out.println("a等于c");
//        }
//        System.out.println("结束");
//    }


//    public static void main(String[] args) {
//        // x和y的关系满足如下：    
//        //  // x>=3 y = 2x + 1;    
//        //  //‐1<=x<3 y = 2x;   
//        //   // x<=‐1 y = 2x – 1;    
//        //  // 根据给定的x的值，计算出y的值并输出。   
//        //   // 定义变量     
//        int x = 5;
//        int y;
//        if (x >= 3) {
//            y = 2 * x + 1;
//        } else if (x >=-1 && x<3)
//        {
//            y = 2 * x;
//        }
//        else{
//            y = 2 * x - 1; }
//         System.out.println("y的值是：" + y);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int wek = scanner.nextInt();

    switch(wek){
        case 1:
            System.out.println("星期一");
            break;
        case 2:
            System.out.println("星期二");
            break;
        case 3:
            System.out.println("星三");
            break;
        case 4:
            System.out.println("星期四");
            break;
        default:
            System.out.println("有误差");
            break;
    }

//        for (int x =1;x<=100;x++){
//            System.out.println("helloword"+x);
//        }
//
//        int sum = 0;
//        for(int x =1;x<100;x++){
//            if (x % 2 == 0){
//                sum += x;
//            }
//
//        }
//        System.out.println(sum);
//        int x =1;
//        do {
//            System.out.println("helloword"+x);
//            x++;
//        }while (x<=100);

//        for (int i=1;i<=10;i++){
//            if(i == 3){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int x = 0; x < 5; x++) {
//            for (int y = 0; y < x; y++) {
//                System.out.print("1");
//            }
//            for (int z = 4; z >= x; z--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入");
//        int sum = scanner.nextInt();
//        for(int i=1;i<=sum;i++){
//            for (int j =1;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int x = 1;x <= 2*(sum-i)-1;x++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        scanner.close();
//        }

//        int sum = getsum(5,6);
//        System.out.println(sum);
//    }
//    public static int getsum(int a,int b){
//        return   a+b;
//        int sum = getsum();
//        System.out.println(sum);
//    }
//    public static int getsum(){
//        int sum =0;
//        for (int i=1;i<=100;i++){
//            sum += i;
//        }
//        return sum;
//    }

    }}
