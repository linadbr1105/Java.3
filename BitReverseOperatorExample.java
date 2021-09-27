package sec03.exam04_bit_reverse;

public class BitReverseOperatorExample {
  public static void main(String[] args){
   int v1 = 10;
   int v2 = ~v1;
    int v3 = ~v1 + 1;
   System.out.println(v2);
   //-11
   System.out.println(v3);
   //-10

   int v4 = -10;
   int v5 = ~v4;
   int v6 = ~v4 + 1;
   System.out.println(v5);
   //9
   System.out.println(v6);
   //10
  }

  //이진법으로 숫자 도출해주는 코드
  public static String toBinaryString(int value){
    String str = Integer.toBinaryString(value);
    while(str.length()<32){
      str = "0" + str;
    }
  }

}