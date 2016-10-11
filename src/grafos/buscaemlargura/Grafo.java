package grafos.buscaemlargura;

import java.util.List;

/**
 *
 * @author eric
 */
public class Grafo {
    private int quantidadeVertices;
    private ListaAdjacencia listaAdjacencia;
    private List<Vertice> listaVertices;
    private List<Vertice> filaVertices;

    public Grafo() {
    }

    public Grafo(int quantidadeVertices) {
        this.quantidadeVertices = quantidadeVertices;
        this.listaAdjacencia = new ListaAdjacencia(quantidadeVertices);
    }

    public int getQuantidadeVertices() {
        return quantidadeVertices;
    }

    public void setQuantidadeVertices(int quantidadeVertices) {
        this.quantidadeVertices = quantidadeVertices;
    }

    public ListaAdjacencia getListaAdjacencia() {
        return listaAdjacencia;
    }

    public void setListaAdjacencia(ListaAdjacencia listaAdjacencia) {
        this.listaAdjacencia = listaAdjacencia;
    }

    public List<Vertice> getListaVertices() {
        return listaVertices;
    }

    public void setListaVertices(List<Vertice> listaVertices) {
        this.listaVertices = listaVertices;
    }

    public List<Vertice> getFilaVertices() {
        return filaVertices;
    }

    public void setFilaVertices(List<Vertice> filaVertices) {
        this.filaVertices = filaVertices;
    }
    
    
}
