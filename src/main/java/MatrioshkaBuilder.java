
import java.util.ArrayList;
import java.util.List;

public class MatrioshkaBuilder {

    private List<Matrioshka> matrioshkas;
    private int iD;
    private int i;

    public MatrioshkaBuilder (int i){
        matrioshkas=new ArrayList<>();
        this.i = i;
        this.iD = 1;
        addMatrioshka(i);
    }

    private void addMatrioshka(int j){
        if (j <= 1) {

            matrioshkas.add(new Matrioshka(iD));
        }else {
            matrioshkas.add(new Matrioshka(iD));
            this.iD++;
            addMatrioshka(j-1);
        }
    }

    public void printMatrioshka(){
        matrioshkas.stream().map(x -> x.getiD()+") "+x.getName()+"    ").forEach(System.out::print);
    }

}