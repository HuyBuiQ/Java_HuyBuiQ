package bro_code_course;

public class method {
    public static void main(String[] args) {
        hello();
        int x = 2;
        int y = 4;
        System.out.println(add(x,y));

        int z = 6;
        System.out.println(add(x,y,z));


    }
    static void hello(){
        System.out.println("Hello");
    }
    static int add(int x, int y){
        return x+y;
    }
    static int add(int x, int y,int z){
        System.out.println("This is an overloaded method ");
        return x+y+z;
    }
}

