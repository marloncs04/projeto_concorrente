package projeto_concorrente;

/**
 *
 * @author genilton
 */
public class Numbers implements Runnable {

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

    public double insertionSort() {
        int key, i, j;

        double startTime = System.currentTimeMillis();

        for (j = 1; j < this.max; j++) {
            key = this.vector[j];
            for (i = j - 1; (i >= 0) && (this.vector[i] > key); i--) {
                this.vector[i + 1] = this.vector[i];
            }
            this.vector[i + 1] = key;
        }
        double endTime = System.currentTimeMillis();

        return (endTime - startTime);
    }

    @Override
    public void run() {
        this.insertionSortThread();
    }

    public void insertionSortThread() {
        int key, i, j;

        for (j = this.fist + 1; j <= this.last; j++) {
            key = this.vector[j];
            for (i = j - 1; (i >= this.fist) && (this.vector[i] > key); i--) {
                this.vector[i + 1] = this.vector[i];
            }
            this.vector[i + 1] = key;
        }
//        System.err.print(Thread.currentThread().getName() + ": ");
//        for (int x = this.fist; x <= this.last; x++) {
//            System.err.print(" " + this.vector[x] + ",");
//        }
//        System.err.println("");
    }
}
