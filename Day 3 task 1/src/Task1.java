public class Task1 {
    public static void main(String[] args){
        int[][] ARRAY = new int[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<10;j++){
                ARRAY[i][j]=(i+1)*(j+1);        //saving values in array
                System.out.println((i + 1) + "*" + (j + 1) + "=" + ARRAY[i][j]);        //Output values from array
            }
            System.out.println("");
        }
    }
}
