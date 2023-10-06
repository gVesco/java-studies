import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in).useLocale(java.util.Locale.US);
        
        System.out.println("Bem vindo ao banco do Bootcamp Java 2023");
        System.out.print("Digite o nome do titular: ");
        String nomeCliente = scn.nextLine();

        System.out.print("Digite a agência da sua conta bancária: ");
        int agenciaConta = scn.nextInt();

        System.out.print("Digite o número da sua conta bancária: ");
        int numeroConta = scn.nextInt();
        

        System.out.print("Digite o saldo inicial da sua conta bancária: ");
        double saldoConta = scn.nextDouble();
        

        System.out.print("\nOlá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta);
        System.out.print(", conta " + numeroConta  + " e seu saldo " + saldoConta + " já está disponível para saque.");


        //TODO: Exibir as mensagens para o nosso usuario

        //TODO: Obter pelo scanner os valores digitados no terminal

        //TODO Exibir a mensagem conta criada
    }
}
