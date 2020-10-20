import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class day11 {


    public static void main(String[] args){
//        HashMap<String,String> map = new HashMap<>();
//        map.put("胡歌","霍建华");

//        Set<Map.Entry<String,String>> entrySet = map.entrySet();
//        for (Map.Entry<String,String> Entry : entrySet){
//            String key = Entry.getKey();
//            String value = Entry.getValue();
//            System.out.println(key+value);
//        }
//        Set<String> set = map.keySet();
//        for (String key :set){
//            String value = map.get(key);
//            System.out.println(key+value);
//        }

        System.out.println("请输入一个字符串");
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }
        public static void findChar(String line){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<line.length();i++){
            char c = line.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else {
                Integer count = map.get(c);
                map.put(c,++count);
            }
        }
        System.out.println(map);
        }

}
