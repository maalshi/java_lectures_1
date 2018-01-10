public class Task4 {
    public static void main(String[] args) {

        int n = 10;

        int[] array = new int[n];

        for (int a = 0;a<n;a++){
            array[a]= (int)(Math.random()*(1+100));
        }

        for (int a=0;a<array.length/2;a++) {
            int sum = array[a] + array[n - 1];
            System.out.println(sum);
            n--;
        }

    }
}
