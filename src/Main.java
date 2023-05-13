import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opt;

        try {

            do {
                System.out.println("1 -- Adicionar Artista");
                System.out.println("2 -- Excluir Artista");
                System.out.println("3 -- Olhar Lista");
                System.out.println("4 -- Buscar indice por nome");
                System.out.println("5 -- Apagar Lista");
                System.out.println("0 -- SAIR");
                System.out.print("Digite a opção: ");
                opt = sc.nextInt();
                sc.nextLine();
                System.out.println();

                switch (opt) {
                    case 1:
                        System.out.print("Quantos artistas deseja adicionar? ");
                        int n = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < n; i++) {
                            System.out.print("Digite o nome do artista: ");
                            String nome = sc.nextLine();
                            list.add(nome);
                        }
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Digite o índice de um artista para excluir da lista.");
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice >= 0 && indice < list.size()) {
                            String nome = list.remove(indice);
                            System.out.println("Artista '" + nome + "' removido com sucesso.");
                        } else {
                            System.out.println("Índice inválido. Nenhum artista removido da lista.");
                        }
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Quantidade de artistas na lista atualmente: " + list.size());
                        for(String x: list){
                            System.out.println(list.indexOf(x) + ": " + x);
                        }
                        System.out.println();
                        break;

                    case 4:
                        System.out.print("Digite um nome para buscar na lista e mostrar seu indice: ");
                        String nomeBusca = sc.nextLine();
                        int indiceBusca = list.indexOf(nomeBusca);
                        if (indiceBusca != -1) {
                            System.out.println("O índice de " + nomeBusca + " é " + indiceBusca);
                        } else {
                            System.out.println("Nome não encontrado na lista.");
                        }
                        System.out.println();
                        break;

                    case 5:
                        list.removeAll(list);
                        System.out.println();
                        break;

                    case 0:
                        opt = 0;
                        break;
                }


            } while (opt != 0);
        }catch (InputMismatchException e){
            System.out.println("Opção inválida. Digite uma das opções.");
            sc.nextLine();
        }
    }
}