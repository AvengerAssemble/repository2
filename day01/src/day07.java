import java.util.*;

public class day07 {

    public static void main(String[] args) {


//             int[] arr = {1, 2, 3};
//
//             for (int a : arr) {
//                    System.out.println(a);
//             }
//        Collection<String> c = new ArrayList<>();
//        c.add("你好");
//        c.add("大哥");
//        c.add("小弟");
//
//        for (String i : c){
//            System.out.println(i);
//        }

//        int[] arr = {1,2,3,4};
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//
//
//        for (int i=0;i<arr.size();i++){
//            System.out.println(arr.get(i));
//        }

//
//        Collection<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//
//        Iterator<Integer> a = arr.iterator();
//       while (a.hasNext()){
//            int b = a.next();
//            System.out.println(b);
//       }
//        Random i = new Random();
//        int r = i.nextInt(100)+1;
//        System.out.println(r);

        ArrayList<String> pokerBox = new ArrayList<>();

        ArrayList<String> colors = new ArrayList<>();

        ArrayList<String> numbers = new ArrayList<>();

        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for (int i=2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");


        for (String color : colors){
            for (String number : numbers){
                String card = color+number;
                pokerBox.add(card);
            }
        }

        pokerBox.add("小☺");
        pokerBox.add("大☠");

        //洗牌
        Collections.shuffle(pokerBox);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i=0;i<pokerBox.size();i++){
            String card = pokerBox.get(i);
            if(i>=51){
                dipai.add(card);
            }else {
                if (i%3 ==0){
                    player1.add(card);
                }else if (i%3 ==1){
                    player2.add(card);
                }else {
                    player3.add(card);
                }
            }
        }

        System.out.println("令狐冲"+player1);
        System.out.println("田伯光"+player2);
        System.out.println("绿竹翁"+player3);
        System.out.println("底牌"+dipai);
    }
}
