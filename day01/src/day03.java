import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class day03 {

//    //游戏开始时，会随机生成一个1-100之间的整数 number 。玩家猜测一个数字 guessNumber ，会与 number 作比 较，系统提示大了或者小了，直到玩家猜中，游戏结束
//    public static void main(String[] args){
//        Random r = new Random();
//        int number =r.nextInt(100)+1;
//        while (true){
//            Scanner s = new Scanner(System.in);
//            System.out.println("输入数字");
//            int gue = s.nextInt();
//            if(gue > number ){
//                System.out.println("你输入的数字大了");
//            }else if (gue < number){
//                System.out.println("你输入的数字小了");
//            }else {
//                System.out.println("你输入的数字正确");
//                break;
//            }
//        }
//    }
//
//
//    //定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
//    public static void main(String[] args){
//
//        //创建Random对象
//        Random random = new Random();
//        //创建ArrayList集合对象
//        ArrayList<Integer> list = new ArrayList<>();
//
//        //Random随机生成元素添加到ArrayList集合中去
//        for (int i=0;i<20;i++){
//            int r = random.nextInt(1000)+1;
//            list.add(r);
//        }
//
//        //调用偶数集合的方法
//        ArrayList<Integer> arraylist= getArraylist(list);
//        System.out.println(arraylist);
//
//    }
//    public  static ArrayList<Integer> getArraylist(ArrayList<Integer> list){
//
//         //创建一个放偶数的集合
//            ArrayList<Integer> small = new ArrayList<>();
//
//            //遍历list
//            for (int i=0; i<list.size();i++){
//                //获取元素
//                int sum = list.get(i);
//                //判断偶数添加到small
//                    if (sum % 2 ==0){
//                       small.add(sum);
//                    }
//            }
//            return  small;
//    }

//    public static void main(String[] args){
//        String s = "he|ow|or|ld";
//
////        System.out.println(s.indexOf("h"));
////        System.out.println(s.indexOf("ovo"));
////        System.out.println(s.indexOf("ak"));
////        System.out.println(s.substring(0));
////        System.out.println(s.substring(2));
////        System.out.println(s.substring(2, 4));
//
//        String[] list = s.split("|");
//        for (int i=0;i<list.length;i++){
//            System.out.println(list[i]);
//        }
//
//    }

    //统计字符数大写，小写，及数字字符个数
//public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("请输入字符串");
//    String  s = scanner.nextLine();
//
//    int bigCount = 0;
//    int smallCount = 0;
//    int numberCount = 0;
//
//    for (int i=0;i <s.length();i++){
//        char ch = s.charAt(i);
//
//        if (ch>='A'&&ch<='Z'){
//            bigCount++;
//        }else if (ch>='a'&&ch<='z'){
//            smallCount++;
//        }else if (ch>='0'&&ch<='9'){
//            numberCount++;
//        }else {
//            System.out.println(ch+"有错误");
//        }
//    }
//
//    System.out.println(bigCount);
//    System.out.println(smallCount);
//    System.out.println(numberCount);


    public static void main(String[] args){
//        int[] arr = {1,2,3,4};
//        System.out.println(arr);
//
//        Arrays.toString(arr);
//
//        System.out.println(Arrays.toString(arr));
//
//        String line = "adfFG";
//
//        char[] arr = line.toCharArray();
//
//        Arrays.sort(arr);
//
//        for (int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }

//        double min = -10.8;
//        double max = 5.9;
//        int count = 0;
//        for (double i=Math.ceil(min);i<=max;i++){
//            if (Math.abs(i) >6 || Math.abs(i)<2.1){
//                count++;
//            }
//
//        }
//        System.out.print(count);

        Random r = new Random();
        int number = r.nextInt(100)+1;
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.println("请输入");
            int gue = s.nextInt();
            if ((gue>number)){
                System.out.println("输入的大了");
            }else if(gue<number){
                System.out.println("输入的小了");
            }else {
                System.out.println("输入正确");
                break;
            }
        }
}


}
