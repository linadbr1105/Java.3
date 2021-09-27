package sec04.exam07_conditional;

public class ConditionalOperationalExample{
  public static void main(String[] args){
    
    int score = 85;

    char grade = (score>90) ? 'A':((score>80)? 'B': 'C');
    //90이상이면 A가, 그렇지 않으면 다시 80이상인지 확인하여 B가, 그 둘다 아니면 최종적으로 C가 선택되는 코드
    System.out.println(score + "점은"+grade+"등급입니다.")
    //85점은 B등급입니다.
  }

}
