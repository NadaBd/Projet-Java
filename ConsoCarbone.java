package consoCarbone;

public class ConsoCarbone {
    private static int cpt;
    private final int ID;

    public ConsoCarbone(){
        cpt++;
        ID=cpt;
    }

    public int getID(){
        return ID;
    }
}
