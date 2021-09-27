package sec04.exam01_arithmetic;
public class InfinityAndNaNCheckExample {
 
  public static void main(String[] args){
    int x = 5;
    double y = 0.0;

    double z = 5/y;
    System.out.println(Double.isInfinite(z));
    //true 값이 infinite하다는 뜻

    double z = 5 % y;
    System.out.println(Double.isNaN(z));
    //true 값이 NaN하다는 뜻

    System.out.println(z + 2);
    //NaN


    lf(Double.isInfinite(z)||Double.isNaN(z)){
      System.out.println("값 산출 불가");
    } else {
      System.out.println(z + 2);
    }
  }
  //값 산출불가
  //위에서 y에 0이 아닌 값을 주면 특정 값이 도출됨.
  
  ----------------------------------------------------------

  int  x = 5;
  int y = 0;

  try {
    int z = x/ y;
    System.out.prinyln("z=" + z);
  } catch (ArithmeticException e){
    System.out.println("0으로 나누면 안됨");
    //분모가 0.0이 아니라 0인 경우 예외 발생이라는 상황이 됨. 
  }

}
