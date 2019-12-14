public class PrimeNumbCheck {

    private int a;

    public PrimeNumbCheck(int a) {
        this.a = a;
    }

    public int dividingNumbers(int x){
        if (this.a <=3 && this.a >=0) return 0;
        else if (a%x!=0) return dividingNumbers(x+1);
        else return x;
    }

    public static boolean isPrime (int a){
        PrimeNumbCheck primeNumbCheck = new PrimeNumbCheck(a);
        return primeNumbCheck.dividingNumbers(2) == a;
    }



}
