package sec04.exam01_arithmetic;

public class AccuracyExample{
  public static void main(String[] args){
  
    double result = 7 * 0.1;
    System.out.println(result);
    //0.700000000000007 정확하게 0.7이 안나옴. 정확한 계산이 안됨

    int apple=1;
    double pieceUnit = 0.1;
    int number = 7;
    
    double result = apple - number*pieceUnit;

    System.out.println("사과 한개에서");
    System.out.println("0.7조각을 빼면");
    System.out.println(result + "조각이 남는다.");
    //사과 한개에서
    //0.7조각을 빼면
    //0.2999999999999993조각이 남는다.
  }

}

