import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinarySearch<E extends Comparable<E>> implements Comparable{

    E endIndex;
    E elementToSearch;
    E[] items;


    public BinarySearch(E elementToSearch, E[] items) {
        this.elementToSearch = elementToSearch;
        this.endIndex = items[items.length-1];
        this.items = items;
    }

//    public boolean search( int startIndex, int endIndex){
//
//
//        int pivot = items[indexOfPivot];
//        if(this.elementToSearch == pivot) return true;
//        if(startIndex==endIndex) return false;
//        if(elementToSearch > pivot){
//            this.indexOfPivot = this.endIndex/2;
//            return search(indexOfPivot,this.endIndex);}
//        this.indexOfPivot = this.indexOfPivot/2;
//        return search(0,indexOfPivot);
//    }
//
//    public int mostCommonNumber (){
//        int[] temp = new int[this.items[this.items.length-1]+1];
//        for (int el: temp) {
//            el = 0;
//        }
//        for(int el: this.items){
//            temp[el] ++;
//        }
//        for(int i = 0; i < temp.length ; i++ ){
//            if(temp[i] == Arrays.stream(temp)
//                    .max().getAsInt()) return i;
//        }
//        return Arrays.stream(temp)
//                .max().getAsInt();
//    }
//
//
    public E getHighest(List<E> array){
        sortedArrayBombelkowo(array);
        return array.get(array.size()-1);
    }

    public void numberOfEach (){
        List<E> temp = new LinkedList<>();

        for(int i = 0 ; i < temp.size() ; i++){
            temp.add(temp.get(i));
        }

        for(int i = 0;i<temp.size();i++){
            if(temp.get(i).equals(0)){
                System.out.print ("["+i+","+temp.get(i)+"],");
            }
        }
    }

    public List<E> swap(List<E> itemArr, int a, int b){
        E aN = itemArr.get(a);
        E bN = itemArr.get(b);
        itemArr.set(b,aN);
        itemArr.set(a,bN);
        return itemArr;
    }

    public void printArray(List<E> array){
        array.stream().forEach(System.out::print);
    }


    public List<E> sortedArrayBombelkowo (List<E> array){
        for(int i=0 ; i< array.size();i++){
            for(int j=0 ; j< array.size();j++){
                if((array.get(i).compareTo(array.get(j)) == -1 || array.get(i).equals(array.get(j)) && i!=j))
                swap(array,i,j);
            }
        }
        return array;
    }

//    public E[] quickSort (E[] array){
//        int[][] temp = new int[array.length][];
//        for(int i = 0; i<array.length;i++){
//            temp[i] = new int[array.length];
//        }
//        int pivot = temp.length/2;
//
//
//    }




    public List<E> quickSort  (List<E> items){
        if(items.isEmpty() || items.size()==1) return items;
        E pivot = items.get(items.size()/2);

        List<E> smaller = items.stream()
                .filter(x -> x.compareTo(pivot) == -1 )
                .collect(Collectors.toList());

        List<E> exactPivot = items.stream()
                .filter(x -> x.equals(pivot))
                .collect(Collectors.toList());

        List<E> greater = items.stream()
                .filter(x -> x.compareTo(pivot) == 1)
                .collect(Collectors.toList());

        return Stream.of(quickSort(smaller),exactPivot,quickSort(greater)).flatMap(Collection::stream).collect(Collectors.toList());

    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
