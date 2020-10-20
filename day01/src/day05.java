abstract class Animal{
    abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
    public void carchMouse(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("拆家");
    }
    public void watchHouse(){
        System.out.println("看家");
    }
}

class hah{

    void yoxi(Animal a) {
        a.eat();
        if (a instanceof Cat){
            Cat c = (Cat) a;
            c.carchMouse();
        }else if (a instanceof Dog){
            Dog d = (Dog) a;
            d.watchHouse();
        }

    }
    }





