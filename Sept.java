import java.util.Scanner;
public class Sept {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter some input");
        int rollno = input.nextInt();
        System.out.println("your roll number is" + rollno);
       String name = input.nextLine();
        System.out.println(name);

    }
}