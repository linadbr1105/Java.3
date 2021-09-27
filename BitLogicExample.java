package sec04.exam05_bit;

public class BitLogicExample {
  public static void main(String[] args){
    System.out.print("45 & 25="+(45 & 25));
    //45&25 = 9
    System.out.print("45|25="+(45|25));
    //45|25 = 61
    System.out.print("45^25="+(45^25));
    //45^25 = 52
    System.out.println("~45="+(~45));
    //~45 = -46

    System.out.println(toBinaryString(45));
    System.out.println("&");
    System.out.println(toBinaryString(25));
    System.out.println(||);
    System.out.println(toBinaryString(45&25));
  }
 public static String toBinaryString(int value){
   String str = Integer.toBinaryString(value);
   while(str.length()<32){
     str = "0"+ str;
   }
   return str;
 }
}
