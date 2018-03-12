package sk.akademiasovy.ProjectUnitTest;

public class unit {
    public int max(int a, int b, int c){
        int result=0;
        if(a>b && a>c){
          result=a;  }
        if(b>a && b>c){
            result=b;}
        if(c>a && c>b){
            result=c;}

        return result;
    }

    public String Reverse(String text){
        String reverse  = "";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            reverse = reverse + text.charAt(i);
        }
        //System.out.println(reverse);
        return reverse;
    }

    public static boolean isPrimeNumber(int num){
        int temp;
        boolean isPrime=true;
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //ak prime true je prvoc. ak false nieje
        //if(isPrime)
           // System.out.println(num + " is a Prime Number");
       // else
            //System.out.println(num + " is not a Prime Number");

        return isPrime;

    }

    public int sumOfArray(int[] arr){
        int sum=0;
        for(int value:arr){
            
        }
    }

}
