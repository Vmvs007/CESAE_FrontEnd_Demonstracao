import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String option = input.next();

        switch (option) {
            case "Y":
            case "y":
                System.out.println("Login");
                break;

            case "N":
            case "n":
                System.out.println("Menu de Cliente");
                break;
            }



        }


    }
}
