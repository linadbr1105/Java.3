package sec03.exam01_sign;

public class SignOperationExample {
  public static void main(String[] args){
    int x = -100;
    int result1 = +x;
    int result2 = -x;

    System.out.println(result1);
    //-100
    System.out.println(result2);
    //100

    short s = 100;
    short result3 = -s;
    //위의 리터럴은 산출값으로, int로 저장되므로 오류발생
    int result3 = -s;
    System.out.print(result3);
    //-100
  }

}