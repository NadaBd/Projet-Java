package consoCarbone;

public class Transport {
    private boolean possede;
    private Taille taille;
    private int kilomAnnee;
    private int amortissement;

    public Transport(boolean possede, Taille taille,int kilomAnnee, int amortissement){
        this.possede=possede;
        this.taille=taille;
        this.kilomAnnee=kilomAnnee;
        this.amortissement=amortissement;
    }

    public boolean getpossede(){
        return possede;
    }

    public void setpossede(boolean possede){
        this.possede=possede;
    }

    public Taille gettaille(){
        return taille;
    }

    public void settaille(Taille t){
        this.taille=t;
    }

    public int getkilomAnnee(){
        return kilomAnnee;
    }

    public void setkilomAnnee(int kA){
        this.kilomAnnee=kA;
    }

    public int getamortissement(){
        return amortissement;
    }

    public void setamortissement(int amo){
        this.amortissement=amo;
    }
}
