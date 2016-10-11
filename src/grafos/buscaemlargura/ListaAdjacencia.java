package grafos.buscaemlargura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eric
 */
public class ListaAdjacencia {

    private int quantidadeVertices;
    private List<int[]> listaArrays;
    private List<Vertice> listaVertices;
//    private List<List> listaVertices;

    public ListaAdjacencia(int quantidadeVertices) {
        this.quantidadeVertices = quantidadeVertices;
        listaVertices = new ArrayList();
        listaArrays = new ArrayList<>();
        for (int i = 1; i <= quantidadeVertices; i++) {
            Vertice v = new Vertice(i);
            listaVertices.add(v);
        }
    }

    public void preencherLista() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n =================== Instruções ===================");
        System.out.println(" Para cada vértice, digite um array com valores separados por espaco.");
        System.out.println(" Ex.:");
        System.out.println("\t Se o array de adjacência do vértice 1 for 2, 3 e 5: ");
        System.out.println("\t Entrada esperada: 2 3 5");
        System.out.println(" ==================================================");
        for (int i = 0; i < listaVertices.size(); i++) {
            System.out.print("\n Digite o array de adjacência do vértice " + listaVertices.get(i).getId() + ": ");            
            listaArrays.add(i, lerArray());
        }

        System.out.println("");
    }

    private int[] lerArray() {
        Scanner s = new Scanner(System.in);

        int count = quantidadeVertices;

        int[] numbers = new int[count];
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                //System.out.println("You didn't provide enough numbers");
                break;
            }
        }

        return numbers;
    }

    public void exibirLista() {
        System.out.println("\n +++++++++++++ LISTA DE ADJACENCIA +++++++++++++");
        for (int i = 0; i < listaVertices.size(); i++) {
            System.out.println("\t" + listaVertices.get(i).getId() + " -> " + Arrays.toString(listaArrays.get(i)));
        }
        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

//    public static int[] readNumsFromCommandLine() {
//        Scanner s = new Scanner(System.in);
//
//        int count = s.nextInt();
//        s.nextLine(); // throw away the newline.
//
//        int[] numbers = new int[count];
//        Scanner numScanner = new Scanner(s.nextLine());
//        for (int i = 0; i < count; i++) {
//            if (numScanner.hasNextInt()) {
//                numbers[i] = numScanner.nextInt();
//            } else {
//                System.out.println("You didn't provide enough numbers");
//                break;
//            }
//        }
//
//        return numbers;
//    }

//    public static void main(String[] args) {
//        int[] numbers = readNumsFromCommandLine();
//        System.out.println(Arrays.toString(numbers));
//    }

}
