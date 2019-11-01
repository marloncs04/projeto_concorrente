package projeto_concorrente;

/**
 *
 * @author genilton
 */
public class Numbers {

    int max;
    int vector[];

    public Numbers(int max) {
        this.max = max;
        this.vector = new int[max];
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public void random() {
        for (int i = 0; i < this.max; i++) {
            this.vector[i] = (int) (Math.random() * this.max);
        }
    }
}
