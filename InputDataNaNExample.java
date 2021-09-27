package sec04.exam01_arithmetic;

public class InputDataNaNExample{
  public static void main(String[] args){
  
    String useInput = "NaN";

    double val = Double.valueOf(useInput);

    double currentBalance = 10000.0;

    currentBalance = currentBalance + val;
    System.out.println(currentBalance);
  }

}
