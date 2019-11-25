import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter number below!");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
   Main main = new Main();
    main.reverseNumber(number);
  

    }
    public void  reverseNumber(int num){
       while(num > 0){
           int ans =           num % 10;
           System.out.print(ans);
            num = num / 10;
            
    }
    System.out.println();
  }
}
