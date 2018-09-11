import  java.io.*;
class MyCode{
	
  public static void main(int[] args){
     myPow(args[0],args[1]);
     System.out.println("pow ")
   }
    public double myPow(double x, int n) {
        // Deal with corner case
        if (x == 0) return 0.0;
        if (n == 0) return 1.0;
        
        double ans = 1.0;
        // Seperate positive and negative cases:
        if (n > 0) {
            ans = myPowRecursive(x, n);
            return ans;
        } else {
            ans = x * myPowRecursive(x, -(n + 1));
            return 1.0 / ans;
        }
    }
    
    public double myPowRecursive(double x, int n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;
        double res;
        res = myPowRecursive(x, n/2);
        if (n % 2 == 1)
            return x * res * res;
        else 
            return res * res;
    }
   
}
