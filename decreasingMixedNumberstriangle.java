public class decreasingMixedNumberstriangle
{
    public static void main(String[] args) {
        int n=5;
        for (int i=1,p=5;i<=n;i++,p--)
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print(p+" ");
            }
            System.out.println();

            
        }
    }
}