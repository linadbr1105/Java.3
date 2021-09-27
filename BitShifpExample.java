package sec04.exam03_compare;

public class BitShifpExample {
  public static void main(String[] args){
    
    System.out.print("1<<3="+(1<<3));
    //1<<3 = 8
    System.out.print("-8>>3="+(-8>>3));
    //-8>>3 = -1
    System.out.print("-8>>>3="+(-8>>>3));
    //-8>>3 = 536870911

    System.out.print(toBinaryString(-8));
    System.out.print(">>3=");
    System.out.print(toBinaryString(-8>>3));
    System.out.print();
    System.out.print(toBinaryString(-8));
    System.out.print(">>>3=");
    System.out.print(toBinaryString(-8>>>3));
    
  }

  public static String toBinaryString(int value){
    String str = Integer.toBinaryString(value);
    while(str.length()<32){
      str = "0"+ str;
    }
    return str;
  }

}


