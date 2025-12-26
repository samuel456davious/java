public static void main(String[] args){
// vaiable that can be changed
    String myName = "Samuel";
    String whoami;
    whoami ="Programmer";
    System.out.println("intial values:");
    System.out.println(myName);
    System.out.println(whoami);

    // update the variable
    myName ="Nadela";
    whoami = "Hacker";
    System.out.println("new values:");
    System.out.println(myName);
    System.out.println(whoami);

    // vaiables that cant be changed
    System.out.println("Variables whose values cant be changed using final keyword");
    final String java_Data_Types = "string, boolean,int, float";
    System.out.println(java_Data_Types);
}