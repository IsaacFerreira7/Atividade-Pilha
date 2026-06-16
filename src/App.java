import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = lerInteiro(scanner, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    executarExercicio01();
                    break;
                case 2:
                    executarExercicio02();
                    break;
                case 3:
                    executarExercicio03(scanner);
                    break;
                case 4:
                    executarExercicio04(scanner);
                    break;
                case 5:
                    executarExercicio05(scanner);
                    break;
                case 6:
                    executarExercicio06(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenuPrincipal() {
        System.out.println("=== Exercicios com Pilha ===");
        System.out.println("1 - Pilha com valores fixos");
        System.out.println("2 - Pilha de nomes");
        System.out.println("3 - Remover 10 numeros da pilha");
        System.out.println("4 - Menu interativo de pilha");
        System.out.println("5 - Inverter palavra com pilha");
        System.out.println("6 - Historico de navegacao");
        System.out.println("0 - Sair");
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);

            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                scanner.nextLine();
                return valor;
            }

            System.out.println("Entrada invalida. Digite um numero inteiro.");
            scanner.nextLine();
        }
    }



    private static void executarExercicio01() {
        Stack<Integer> pilha = new Stack<Integer>();
    }
     public static Stack<Integer> criarPilhaValoresFixos() {   
        Stack<Integer> pilha = new Stack<Integer>();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        System.out.println(pilha);
        // pilha.pop();
        System.out.println(pilha);
        return pilha;
    }


    private static void executarExercicio02() {
        Stack<String> pilhaNomes = new Stack<String>();
    }
        public static Stack<String> criarPilhaNomes() {
     Stack<String> pilhaNomes = new Stack<String>();
        pilhaNomes.push("Ana");
        pilhaNomes.push("Carlos");
        pilhaNomes.push("Pedro");
        pilhaNomes.push("Juliana");


        System.out.println("Nome no topo da pilha: " + pilhaNomes.peek());
        System.out.println("Quantide de nomes: " + pilhaNomes.size());
        return pilhaNomes;
    }


    private static void executarExercicio03(Scanner scanner) {
        Stack<Integer> pilhaNumeros = new Stack<Integer>();
    }
        public static Stack<Integer> removerTodosElementos(Stack<Integer> pilha) {
        Stack<Integer> pilhaNumeros = new Stack<Integer>();
        for (int i = 1; i <= 10; i++) {
            pilhaNumeros.push(i);
        }

        System.out.println("Pilha com os 10 números: " + pilhaNumeros);

        for (int i = 0; i < 10; i++) {
            pilhaNumeros.pop();
        }

        System.out.println("Pilha apos remover 10 números: " + pilhaNumeros);
      return pilhaNumeros;
    }


    private static void executarExercicio04(Scanner scanner) {
       Stack<Integer> pilha = new Stack<Integer>();
        int opcao;

        do {
            System.out.println("=== Menu Interativo de Pilha ===");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Mostar topo");
            System.out.println("4 - Mostar pilha");
            System.out.println("5 - Sair");
            System.out.println("5 - Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número a ser empilhado: ");
                    int empilhar = scanner.nextInt();
                    pilha.push(empilhar);
                    System.out.println("Número empilhado");
                    break;

                 case 2:
                if (!pilha.isEmpty()) {
                    System.out.println("Número removido: " + pilha.pop());
                } else {
                    System.out.println("A pilha está vazia.");
                }
                break;
                
                case 3:
                    if (!pilha.isEmpty()) {
                    System.out.println("Topo da pilha: " + pilha.peek());
                    
                    } else {
                        System.out.println("A pilha esta vazia.");
                    }
                    break;

                case 4:
                    System.out.println("Mostrando pilha." + pilha);
                    break;

                case 5:
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }

            System.out.println();
        } while (opcao != 5);
        scanner.close();
    }

    private static void executarExercicio05(Scanner scanner) {

        
       Stack<Character> pilha = new Stack<Character>();
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        for (char letra : palavra.toCharArray()) {
            pilha.push(letra);
        }

        StringBuilder palavraInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }

        System.out.println("Palavra invertida: " + palavraInvertida.toString());
    }


    private static void executarExercicio06(Scanner scanner) {
        Stack<String> historico = new Stack<String>();
        int opcao;

           do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Visitar página");
            System.out.println("2 - Voltar página");
            System.out.println("3 - Mostrar página atual");
            System.out.println("4 - Exibir histórico");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome da página: ");
                    String pagina = scanner.nextLine();
                    historico.push(pagina);
                    System.out.println("Página visitada!");
                    break;

                case 2:
                    if (!historico.isEmpty()) {
                        System.out.println("Voltando da página: " + historico.pop());
                    } else {
                        System.out.println("Não há páginas no histórico.");
                    }
                    break;

                case 3:
                    if (!historico.isEmpty()) {
                        System.out.println("Página atual: " + historico.peek());
                    } else {
                        System.out.println("Nenhuma página aberta.");
                    }
                    break;

                case 4:
                    System.out.println("Histórico: " + historico);
                    break;

                case 5:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}

    
