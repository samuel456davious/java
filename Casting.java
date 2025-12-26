public class Casting{
    public static void main(String[] args) {
        int myInt = 4;
        System.out.println(myInt);
        double myDouble =  myInt; // wideninng casting (automatic)
        System.out.println("widening casting " + myDouble);
        int myInt2 = (int) myDouble; //narrowing casting (manual)
        System.out.println( "narrowing casiting " + myInt2);
       
    }
}