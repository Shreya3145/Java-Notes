package Week_4;

public class RandomPattern {
    public class PrintingNumbersRandomly {
        public static void main(String[] args) {
            int num=5;
            for(int i=1;i<=num;i++)
            {
                for(int j=1;j<=num;j++)
                {
                    if(i%2!=0)
                        System.out.print(i*j +" ");
                    else
                        System.out.print(i*j+1 +" ");	
                }
                System.out.println();
            }
        }
    
    }
    
}
