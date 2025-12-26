public class Switch {
    public static void main(String[] args){
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednessday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sataday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
        coarse();
    }
    static void coarse(){
        String regstrationNumber = "eds";
        switch (regstrationNumber){
            case "i132":
                System.out.println("Computer Security & Forencsis");
                break;
            case "eds":
                System.out.println("Education");
                break;
            case "bcom":
                System.out.println("bechelor of commerce");
                break;
            default :
                System.out.println("Not offered here");
                break;

        }
    }
}
