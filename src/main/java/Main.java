
import java.util.*;
import java.util.List;


public class Main {

    public static void main (String ... args) throws MyVariousException {

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

        FileList.printFilteredFiles(3,"D:\\Java\\testowe\\",x->x.getName().endsWith("txt"));   //podaje ilość subfolderów, ścieżkę i predykat filtra

        int matrioshkas = 6;
        try {
            if (matrioshkas<1) throw new MyVariousException();
            MatrioshkaBuilder matrioshka = new MatrioshkaBuilder(matrioshkas);
            matrioshka.printMatrioshka();
        }catch(MyVariousException ex){
            System.out.println("Musi być większa niż zero");
        }
        System.out.println();
        System.out.println("Prime number check: "+PrimeNumbCheck.isPrime(11));

//        Integer[] lista = {1,9,2,3,5,4,5,6,7,8,9,5,7,9,9,9,9,6,9};
        List<Integer> list = new ArrayList<>(Arrays.asList(9,1,9,2,3,5,4,5,-6,7,8,9,5,7,9,9,9,9,6,9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(9,1,9,2,3,4,4,-5,-6,7,8,9,-5,7,9,9,9,9,6,9));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(9,1,9,2,3,5,4,5,-6,7,8,-9,-5,-7,-9,-9,-9,-9,6,9));

        BinarySearch search = new BinarySearch();
//        System.out.println(search.search(0,lista.length-1));
//        System.out.println(search.mostCommonNumber());

        search.numberOfEach();

        System.out.println();
        search.printArray(list);
        System.out.println();
        search.printArray(search.swap(list,0,4));
        System.out.println();
        search.printArray(search.quickSort(list2));
        System.out.println();
        search.printArray(search.sortedArrayBombelkowo(list));
        System.out.println();
        search.printArray(search.quickSort(list3));
    }
}
