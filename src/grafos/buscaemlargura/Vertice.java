package grafos.buscaemlargura;

/**
 *
 * @author eric
 */
public class Vertice {
    private int id;
    private CoresVertice cor;
    private Integer predecessor;
    private Integer distancia;
    
    public Vertice(int id) {
        this.id = id;
        this.cor = CoresVertice.BRANCO;
        this.predecessor = null;
        this.distancia = Integer.MAX_VALUE; // neste caso, equivale a infinito
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CoresVertice getCor() {
        return cor;
    }

    public void setCor(CoresVertice cor) {
        this.cor = cor;
    }

    public Integer getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Integer predecessor) {
        this.predecessor = predecessor;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }
    
}
