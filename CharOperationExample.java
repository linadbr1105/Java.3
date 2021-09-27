package sec04.exam01_arithmetic;
public class CharOperationExample {
 
  public static void main(String[] args){

  char c1 = 'A' + 1;
  System.out.println(c1);
  //B

  char c2 = 'A';
  char c3 = c2 + 1;
  //위 코드는 c2가 산술계산으로 int값이 되기 때문에 char로 받으면 오류남
  int result = c2 +1;
  System.out.println(result);
  // 66

  char c3 = (char) result
  System.out.println(c3);
  //B 
  //int result = c2 +1; 이라는 코드에서 이미 정수값 66을 가졌고, 이는 4byte인 int 값이다.
  //이를 강제로 char로 변환시키면서 2,2 byte로 쪼개고 뒤쪽 2byte만 챙기는데, 66은 2byte만으로 표현 가능한 숫자이므로 문제 없다.
  
  }
}

