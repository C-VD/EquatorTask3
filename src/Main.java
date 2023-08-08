import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("как тебя зовут?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.endsWith("а")
         || name.endsWith("я")
         || name.endsWith("и")
        )
        {
            System.out.println("Приветик!");
        }
        else
        {
            System.out.println("Здарова!");
        }
    }
}