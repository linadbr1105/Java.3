package sec04.exam03_compare;

public class StringConcatExample1 {
  public static void main(String[] args){
    
    int num1 = 10;
    int nun2 = 10;
    boolean result1 = (num1 == num2);
    boolean result2 = (num1 != num2);
    boolean result3 = (num1 <= num2);

    System.out.println(result1);
    //true
    System.out.println(result2);
    //flase
    System.out.println(result3);
    //true

    char char1 = 'A';
    char char2 = 'B';
    boolean result4 = (char1<char2);
    System.out.println(result4);
    //true
  }

}
