import java.util.Scanner;

public class InputReader{
  public static void main(String[] args){
    System.out.println("Working with arguments!");
    print_arg(args);
    print_input();
  }

  private static void print_arg(String[] args){
    System.out.println(args[0]);
  }

  private static void print_input(){
    System.out.println("Please print your name:");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    System.out.println("Your name is: " + name);
  }
}
