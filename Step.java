public class Step{

public static void main()
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=new int[n];
    int b=new int[n];
    
    //to read first array
    for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
    }

    //to read second array
    for(int i=0;i<n;i++)
    {
     b[i]=sc.nextInt();
    }

    //logic
    for(int i=0;i<n;i++)
    { 
       
         if(a[i]>=b[j])
         {
            a[i]=a[i]-b[j];
            System.out.println(a[i]);
         }
       
    }
    

}
}