import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main (String ... args){
//
//        try {
//
//
//
//            int n = 10, k = 12;
//            if(k==n+1) throw new MyVariousException("n jest o 1 za duże");
//            else if(k==n+2) throw new MyVariousException("n jest o 2 za duże");
//            else if(k==n+3) throw new MyVariousException("n jest o 3 za duże");
//
//            else if(k>n) throw new MyVariousException("n jest o wiele za duże");
//
//
//            System.out.println(Recurence.pascal(n, k));
//            Recurence.pascalTriangle(n);
//        }catch(MyVariousException ex){
//            System.out.println(ex);
//
//        }
//
//        System.out.println(Recurence.procentSkladany(2,5,5));
        FileList.printFilteredFiles(2,"D:\\Java\\testowe\\",x->x==x);   //podaje ilość subfolderów, ścieżkę i predykat filtra

    }
}
