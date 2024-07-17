// dio-trilha-java-basico

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.next();

        sc.nextLine(); /* Esta linha foi necessária, pois sem ela estava recebendo a exceção:
        
                        * Exception in thread "main" java.util.InputMismatchException
                        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
                        at java.base/java.util.Scanner.next(Scanner.java:1594)
                        at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
                        at ContaTerminal.main(ContaTerminal.java:18)
                        */

        System.out.print("Por favor, digite o valor do saldo: ");
        double saldo = sc.nextDouble();

        sc.close();
        
        System.out.println();
        System.out.println("============= DADOS DA CONTA DIGITADA =============");
        System.out.println();
        System.out.println("Número da conta: "+numeroConta);
        System.out.println("Número da agência: "+agencia);
        System.out.println("Nome do cliente: "+nomeCliente);
        System.out.println("O saldo é: "+saldo);
    }
}
