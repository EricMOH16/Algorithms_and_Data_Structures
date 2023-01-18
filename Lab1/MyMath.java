package Lab1;

public class MyMath {

    public static int smallest(int x, int y, int z){
        int smallest;
        if (x < y)
            smallest = x;
        else
            smallest = y;
        if (z < smallest)
            smallest = z;
        return smallest;
    }

    public static int power(int a,int b){
        int result = 1;

        for (int i = 1; i<=b; i++)

            result = result*a;

        return result;
    }
    public static int sumOf(int n){
        int sum = 0;

        for (int i = 0; i<=n; i++)
            sum = sum+i;
        return sum;
    }
}
