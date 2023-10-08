import java.util.Scanner;

public class Median {
    public void median(){
    Scanner sc = new Scanner(System.in);
    int ar[] =  new int[100];
    int temp;
    double median;
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
        ar[i] = sc.nextInt();
    }

    for(int i = 0; i < n-1; i ++)
    {
        for(int j = 0; j < n - i -j; j++)
        {
            if(ar[j] > ar[j + 1])
            {
                temp = ar[j];
                ar[j] = ar[j + 1];
                ar[j + 1] = temp;
            }
        }
    }
    if (n % 2 == 0)
        {
        median = (ar[n/2-1] + ar[n/2] + 1) / 2;
        } else {
        median = ar[n/2];
        }
    }
}
