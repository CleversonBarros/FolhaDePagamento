package controle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a opção desejada:");
        System.out.println("[1] Adição de um empregado");
        System.out.println("[2] Remoção de um empregado");
        System.out.println("[3] Lançar um Cartão de Ponto");
        System.out.println("[4] Lançar um Resultado Venda");
        System.out.println("[5] Lançar uma taxa de serviço");
        System.out.println("[6] Alterar detalhes de um empregado");
        System.out.println("[7] Rodar a folha de pagamento para hoje");
        System.out.println("[8] Undo/redo");
        System.out.println("[9] Agenda de Pagamento");
        System.out.println("[10] Criação de Novas Agendas de Pagamento");

        String resposta = input.nextLine();

    }
}
