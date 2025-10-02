import java.util.Scanner;

public class AtendimentoCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🛒 Bem-vindo ao atendimento da Loja Tech Solutions!");
        System.out.println("Por favor, escolha uma opção:");
        System.out.println("1 - Falar com o setor de Vendas");
        System.out.println("2 - Falar com o Suporte Técnico");
        System.out.println("3 - Sair");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu o setor de Vendas. Um atendente entrará em contato em breve.");
                break;
            case 2:
                System.out.println("Você escolheu o Suporte Técnico. Aguarde enquanto conectamos com um técnico...");
                break;
            case 3:
                System.out.println("Obrigado por visitar a Loja Tech Solutions! Até logo 👋");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }

        sc.close();
    }
}
