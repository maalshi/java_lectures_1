public class Task3 {
    public static void main(String[] args) {
        int a = 0; //начало отрезка
        int b = 10; //конец отрезка
        int h = 1; //шаг
        double x = a; //точка
        double f = 0; //функция

        while (x<b){
            x = x+h;
            f = (Math.tan((2*x)-3));
            System.out.print(x);
            System.out.print(" ");
            System.out.print(f);
            System.out.println(" ");
        }
    }
}
