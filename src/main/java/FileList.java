import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class FileList {

    private String path;

    private FileList(String path) {
        this.path = path.trim();
    }

    private List<File> files (int subFolders) throws IOException {
        List<File> filesList = Files.list(new File(this.path).toPath())
                .map(Path::toFile)
                .collect(Collectors.toList());
        int numberOfSubFolders=0;
        for (int j = 1 ; j <= subFolders ; j++) {
            numberOfSubFolders = 0;
            int filesListLength = filesList.size();
            for (int i = 0; i < filesListLength; i++) {
                if (filesList.get(i).isDirectory()) {
                    filesList.addAll(Files.list(new File(filesList.get(i).toString()).toPath())
                            .map(Path::toFile)
                            .collect(Collectors.toList()));
                    filesList.remove(filesList.get(i));
                    numberOfSubFolders++;
                }

            }
            if(numberOfSubFolders == 0) break;
        }

        return filesList;

    }

    private void filteredFiles(String extention, int subFolders) throws IOException {
        this.files(subFolders).stream()
                .filter(x -> x.getName().endsWith(extention))
                .map(x-> x.getParent().toUpperCase()+"\\"+x.getName())
                .forEach(System.out::println);
    }

    public static void printFilteredFiles(int subFolders,String path, String extention) {
        try {
            if(new File(path).isFile()) throw new MyVariousException();
            if(path.trim().equals("")) throw new MyVariousException2();
            FileList list = new FileList(path);
            list.filteredFiles(extention,subFolders);
        }catch(IOException ex){
            System.out.println("Nieprawidłowa ścieżka dostępu");
        }catch (MyVariousException ex){
            System.out.println("Podana ścieżka jest plikiem");
        }catch (MyVariousException2 ex){
            System.out.println("Podana ścieżka jest pusta");
        }
    }
}
