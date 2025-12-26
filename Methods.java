public class Methods {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        int age = 21;
        String name = "Victoria";

        birthdayMethod(name ,age);
        birthdayMethod(name ,age);
        birthdayMethod(name ,age);
        // System.out.println(sum(x, y)); 
        int results = (sum(x, y));
        System.out.println(results);
        
    }
    static void birthdayMethod(String name , int age){
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s \n",name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy turning \n");
    }
    // return method
    public static int sum(int x ,int y){
        int sum = x + y;
        return sum;

    }
}
