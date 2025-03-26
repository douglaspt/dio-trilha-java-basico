import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nome = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o Saldo");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        scanner.close();

    }
    
}
