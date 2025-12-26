public class WhileLoop {
    public static void main(String[] args){
        int i = 5;
        while (i >= 0){
            System.out.println(i);
            i--;
        }
        System.out.println("Happy New Year!");
        doWhile1();
        doWhile2();
    }
    static void doWhile1(){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i < 5);
    }
    static void doWhile2(){
        int i = 10;
        do {
            System.out.println(i);
            i--;
        }while(i < 5);
    }
}
