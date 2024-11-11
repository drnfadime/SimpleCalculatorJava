//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double number1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double number2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch(operation){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if(number2 == 0){
                    System.out.println("Herhangi bir sayı 0'a bölünemez.");
                    scanner.close();
                    return;
                }else{
                    result = number1 / number2;
                }
                break;
            default:
                System.out.println("Geçersiz işlem !");
                scanner.close();
                return;

        }
        System.out.println("İşlem sonucu = " + result);
        scanner.close();



    }
}