package lab2;

public class Ex1 {
    public  static void main (String[] args){
    //date type in java
    //integer
    int x; // x is interger
    x = 10;
    System.out.println("x = " + x);
    x  = 20;
    int a, b, c = 30;

    //real number
    double n = 20.5;
    float m = 10;
    System.out.println(n);
    System.out.println(m);
    //charecter
    char d = '#';
    System.out.println(d);

    //String
    String s = "kamonkarn";
    System.out.println(s);
    String l = "rueangsang";
    String fullname = s + l;

    System.out.println(fullname);
    System.out.println(fullname.length());
    String t = fullname.concat("RUTS");
    //boolean
    boolean w = true;
    boolean o = false;

    System.out.println(!w);
    }//main

}//class