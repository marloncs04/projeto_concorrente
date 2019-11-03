
import java.util.Arrays;

/**
 *
 * @author genilton
 */
public class teste {

    public static void main(String args[]) throws InterruptedException {
        int[] array = new int[20];
        Thread[] threads = new Thread[4];
        int fist = 0;
        int last = 19/4;
        
        
        for (int i = 0; i < 20; i++) {
            array[i] = ((int) (Math.random() * 10));
        }
        
        System.out.println("Inicio: " + Arrays.toString(array));
        
        for(int i = 0; i < 4; i++){
            threads[i] = new Thread(new InsertSort( fist, last, array));
            threads[i].start();
            fist = last + 1;
            last += 5;          
        }
        for(int i = 0; i < 4; i++){
            threads[i].join();
        }       
        new InsertSort( 0, 19, array).insertionSort();        

        System.out.println("Fim: " + Arrays.toString(array));
    }
}


//        System.out.println(array.toString());
//        MergeThread merge = new MergeThread(array);
//        merge.run();
//        Thread thread = new Thread(new InsertSort(0, 3));
//        thread.start();
//        thread.join();        
