/**
 * @program: untitled
 * @description:
 * @author: chen hang
 * @create: 2022-09-08 23:21
 */
public class TestOverride {
    public static void main(String[] args) {

    }
}

class Father{
    public String name;
    public int age;
    public Father(){
    }
    public void work(){
        System.out.println("盖房子");
    }
}
class Son extends Father{
    public int weight;
    public Son(){
    }
    public void work(){
        System.out.println("i");
    }
}

class Son1 extends Father{
    public int weight;
    public Son1(){
    }

    public int work(int i){
        System.out.println();
        return 0;
    }
}

class Son2 extends Father{
    public int weight;
    public Son2(){
    }

//    @Override 不允许
//    public int work(){
//        System.out.println();
//        return 1;
//    }
}
