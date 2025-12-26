public class IfStatement {
    public static void main(String[] args){
        int time = 16 ;
        if (time<11){
            System.out.println("Good morning");
        }else{
            System.out.println("Good afternoon");
        }
        greetings(time);
        ternaryOperator(time);
        nestedIf();
        logicalOperators();

    }
    static void greetings(int time){
        if (time < 11){
            System.out.println("Good morning");
        } else if(time < 15){
            System.out.println("Good afternoon");
        } else{
            System.out.println("Good evening");
        }
        
    }
    static void ternaryOperator(int time){
        String results = (time<11) ? "Good morning" 
        : (time<15) ? "Good afternoon" 
        : "Good evening";
        System.out.println(results);
    }
    static void nestedIf(){
        int age = 19;
        boolean kenyanCitizen = false;
        if (age>=18){
            if (kenyanCitizen){
                System.out.println("You qualify to vote.");
            } else{
                System.out.println("You must bea kenyan citizen for to participate in voting.");
            }
        } else{
            System.out.println("You are under-age.");
        }
    }
    static void logicalOperators(){
        int securityLevel = 3;
        boolean isAdmin = false;
        boolean isLoggedIn = true;

        if(isLoggedIn &&(isAdmin || securityLevel <= 3)){
            System.out.println("Access granted");
        } else{
            System.out.println("Access denied");
        }
    }
    
}
