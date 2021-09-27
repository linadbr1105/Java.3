package sec04.exam01_arithmetic;

public class InputDataNaNExample{
  public static void main(String[] args){
  
    String useInput = "NaN";

    double val = Double.valueOf(useInput);

    double currentBalance = 10000.0;

    if(Double.isNaN(val)){
      System.out.println("NaN이 입력되어 처리할 수 없음");
      val = 0.0;
    }

    currentBalance = currentBalance + val;
    //위 코드는 다음과 같이 쓸 수 있음.
    //currentBalance += val; 
    
    System.out.println(currentBalance);
  }
//NaN이 입력되어 처리할 수 없음
//10000.0
}
