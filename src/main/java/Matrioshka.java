import org.apache.commons.lang3.RandomStringUtils;

public class Matrioshka {

    private int iD;
    private String name;

    public Matrioshka (int iD){
        this.iD = iD;
        this.name = RandomStringUtils.randomAlphabetic(1).toUpperCase()+RandomStringUtils.randomAlphabetic(5,20).toLowerCase();
    }

    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }
}


