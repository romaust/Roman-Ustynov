import java.util.Random;

public class TASK2 {
    public static void main(String[] args){
        int[] ARRAY = new int[4];
        int[] ARRAY_COPY = new int[4];
        Random rand = new Random();

        System.out.println("Filling first array with random number (0-9):");
        for(int i = 0; i < ARRAY.length; i++)
        {
            ARRAY[i] = rand.nextInt(10);
            System.out.println("ARRAY[" + i + "]: " + ARRAY[i]);
        }
        System.out.println("Copy array into second array:");
        for(int i = 0; i < ARRAY.length; i++)
        {
            ARRAY_COPY[i] = ARRAY[i];
            System.out.println("ARRAY_COPY[" + i + "]: " + ARRAY[i]);
        }
    }
}
