public class Task2 {
    public static void main(String[] args){

        double a;
        double n = 0.0;
        double e = 0.01; //epsilon

         while (n>=0){
             a=(1/((n+1)*(n+1)));
             if (a<e){
                 System.out.println(n);
                 break;
             }
             n++;
         }
    }
}
