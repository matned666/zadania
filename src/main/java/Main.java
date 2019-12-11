public class Main {

    public static void main (String ... args){


        try {



            int n = 10, k = 12;
            if(k==n+1) throw new MyVariousException("n jest o 1 za duże");
            else if(k==n+2) throw new MyVariousException("n jest o 2 za duże");
            else if(k==n+3) throw new MyVariousException("n jest o 3 za duże");

            else if(k>n) throw new MyVariousException("n jest o wiele za duże");


            System.out.println(Recurence.pascal(n, k));
            Recurence.pascalTriangle(n);
        }catch(MyVariousException ex){
            System.out.println(ex);

        }

        System.out.println(Recurence.procentSkladany(2,5,5));




    }
}
