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

    public float insertionSort() {
        int key, i, j;
        
        long startTime = System.currentTimeMillis();

        for (j = 1; j < this.max; j++) {
            key = this.vector[j];
            for (i = j - 1; (i >= 0) && (this.vector[i] > key); i--) {
                this.vector[i + 1] = this.vector[i];
            }
            this.vector[i + 1] = key;
        }
        long endTime = System.currentTimeMillis();
        
        return endTime - startTime;
    }
}
