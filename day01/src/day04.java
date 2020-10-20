// interface USB {

//    public void show() {
//        System.out.println("1");
//    }
//}
//    class Day extends day04 {
//        public void show() {
//            System.out.println("2");
//        }
//    }

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入");
//        int week = scanner.nextInt();
//        switch (week){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            case 4:
//                System.out.println("4");
//                break;
//            case 5:
//                System.out.println("5");
//                break;
//            case 6:
//                System.out.println("6");
//                break;
//        }
//    }

//abstract class animal {
//    public abstract void run();
//}
//
//class cat {
//    public void run() {
//
//    }
//    void open();
//    void close();
//}
//
//
// class Mouse implements USB{
//
//     @Override
//     public void open() {
//         System.out.println("鼠标开启,红灯闪一闪");
//     }
//
//     @Override
//     public void close() {
//         System.out.println("鼠标关闭,红灯熄灭");
//     }
//
//     public void click() {
//         System.out.println("鼠标单击");
//     }
// }
//
// class KeyBoard implements USB{
//
//     @Override
//     public void open() {
//         System.out.println("键盘开启,绿灯闪一闪");
//     }
//
//     @Override
//     public void close() {
//         System.out.println("键盘关闭,绿灯熄灭");
//     }
//     public void type() {
//         System.out.println("键盘打字");
//     }
// }
//
// class Laptop{
//    public void run(){
//        System.out.println("笔记本运行");
//    }
//    public void useUSB(USB usb){
//        if(usb != null){
//            usb.open();
//            if (usb instanceof Mouse){
//                Mouse m = (Mouse) usb;
//                m.click();
//            }else if (usb instanceof KeyBoard){
//                KeyBoard k = (KeyBoard) usb;
//                k.type();
//            }
//            usb.close();
//        }
//    }
//    public void shutDown(){
//        System.out.println("笔记本关闭");
//    }




