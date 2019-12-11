public class Recurence {

    public static int pascal(int n, int k){
        if (k == 0 || k == n) return 1;
        else return (pascal(n-1, k-1) + pascal(n-1,k));
    }

    public static void pascalTriangle(int n){
        String intToString;
        for(int i = 0 ; i <= n ; i++){
            intToString = "";
            for(int k = 0 ; k <= i ; k++ ){
                intToString = intToString+pascal(i,k)+"a";
            }
            for(int j = ((n-intToString.length()/2)+n)+n*(n/10); j >= 2 ; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i;j++){
                System.out.print(pascal(i,j)+" ");
            }
            System.out.println();
        }
    }


    public static double procentSkladany(double i, double s, double p){
        if (i == 0) return s;
        else return procentSkladany(i-1,s,p)+procentSkladany(i-1,s,p)*p;
    }

    


}
