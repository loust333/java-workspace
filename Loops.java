public class Loops {
  public static void main(String[] args){
    System.out.println("Working with loops!");
    for_loop();
    enhanced_for_loop();
    while_loop();
    do_while_loop();
  }

  private static void for_loop(){
    System.out.println("This is a for loop");
    for(int i = 0; i < 10; i++){
      System.out.println(i);
    }
  }

  private static void enhanced_for_loop(){
    System.out.println("This is an enhanced for loop");
    int[] numbers = {0,1,2,3,4,5,6,7,8,9};
    for(int n : numbers){
      System.out.println(n);
    }
  }

  private static void while_loop(){
    System.out.println("This is a while loop");
    int n = 0;
    while(n < 10){
      System.out.println(n);
      n++;
    }
  }

  private static void do_while_loop(){
    System.out.println("This is a do_while loop!");
    int n = 0;
    do {
      System.out.println(n);
      n++;
    } while(n < 10);
  }
}
