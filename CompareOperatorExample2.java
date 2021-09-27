package sec04.exam03_compare;

public class StringConcatExample2 {
  public static void main(String[] args){
    int v2 = 1;
    double v3 = 1.0;
    System.out.println(v2==v3);
    //true

    double v4 = 0.1;
    float v5 = 0.1f;
    System.out.println(v4 == v5);
    //false. double과 float은 정밀도에 차이가 있어서 다른 값이라고 본다.
    System.out.println((float)v4 == v5);
    //true
    System.out.println((int)(v4*10)==(int)(v5*10));
    //true
    //v4,v5둘다 int로 정수 저장되어서 같은 값으로 취급된다.
    
  }

}