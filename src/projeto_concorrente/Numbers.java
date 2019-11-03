package projeto_concorrente;

/**
 *
 * @author genilton
 */
public class Numbers{

    private int max;
    private int vector[];
    private int fist, last;

    public Numbers(int max) {
        this.max = max;
        this.vector = new int[max];
    }

    public Numbers(int fist, int last, int[] vector) {
        this.vector = vector;
        this.fist = fist;
        this.last = last;
    }

    public Numbers() {
    }

    public Numbers(Numbers number) {
        this.max = number.max;
        this.vector = number.vector.clone();
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
