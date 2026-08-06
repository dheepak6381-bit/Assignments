
public class sumofelemnetsinarray
{
    public static void main(String[] args) {
        int x[] = {1,2,3,4,5};
        int sum = 0;
        int n = x.length;

        for (int i = 0;i<n;i++)
        {
            sum = sum + x[i];
        }
        System.out.println("The sum is: "+sum);
    }
}
