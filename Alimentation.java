package consoCarbone;

public class Alimentation extends ConsoCarbone {
    private double txBoeuf;
    private double txVege;
    private double impact;


    public Alimentation(double txBoeuf, double txVege){
        super();
        this.txBoeuf=txBoeuf;
        this.txVege=txVege;
        this.impact=8*txBoeuf+(1.6*(1-txVege-txBoeuf)+0.9*txVege);
    }

    public double gettxBoeuf(){
        return txBoeuf;
    }

    public double gettxVege(){
        return txVege;
    }

    public double getimpact(){
        return impact;
    }

    public void settxBoeuf(double txBoeuf){
        this.txBoeuf=txBoeuf;
    }

    public void settxVege(double txVege){
        this.txVege=txVege;
    }

    public void setimpact(double impact){
        this.impact=impact;
    }


    static public void empcarbonne(){
        System.out.println("Les francais émettent en moyenne 1144 kg de CO2 dans la consommation de viandes et poissons, 408 en produit laitiers et oeufs, 538 dans la consommation d'autres types de nourriture et 263 dans la consommation de boissons en moyenne par an.\nC'est un total de 2353 kg d'émission de CO2 par an dédié uniquement à l'alimentation.");
    }
}

