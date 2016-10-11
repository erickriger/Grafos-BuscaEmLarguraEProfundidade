package grafos.buscaemlargura;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class GrafosBuscaEmLargura {

    static Grafo grafo;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("########## GRAFOS - LARGURA E PROFUNDIDADE ##########");
        System.out.println(" O programa executará operações de largura e "
                + "profundidade sobre um grafo, fornecido pelo usuario na forma"
                + " de lista de adjacência.");
        System.out.print(" Digite o número de vértices do grafo: ");
        Scanner sc = new Scanner(System.in);
        grafo = new Grafo(Integer.parseInt(sc.nextLine()));
        // preencher lista de adjacencia
        grafo.getListaAdjacencia().preencherLista();
        // exibir lista de adjacencia
        grafo.getListaAdjacencia().exibirLista();
        
        menu();
    }

    public static void menu() {
        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n =================== MENU ===================\n");
            System.out.println("1. Largura");
            System.out.println("2. Profundidade");
            System.out.println("0. Sair");
            System.out.print("\n Digite a opção desejada: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    BuscaLargura largura = new BuscaLargura(grafo);
                    largura.executarBusca();
                    break;
                case 2:
                    BuscaProfundidade profundidade = new BuscaProfundidade(grafo);
                    profundidade.executarBusca();
                    break;
                case 0:
                    return;
                default:
                    System.out.println(" Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);
    }

}
