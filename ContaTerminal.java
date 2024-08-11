package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
                
        int numeroConta;
        double saldo = 0.0;
        String agencia;
        String nomeCliente;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Por favor, digite o número da conta: ");
        numeroConta = input.nextInt();
        
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = input.next();
        
        input.nextLine();
        
        System.out.print("Por favor, digite seu nome completo: ");
        nomeCliente = input.nextLine();
        
        System.out.print("Por favor, deposite um valor: ");
        saldo = input.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }
}
