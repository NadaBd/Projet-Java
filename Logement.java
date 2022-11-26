package consoCarbone;

public class Logement extends ConsoCarbone{
    private int superficie;
    private CE ce;
    private double impact;

    public Logement(int superficie, CE ce){
        super();
        this.superficie=superficie;
        this.ce=ce;
        switch (this.ce){
            case A:
                this.impact=0.005*this.superficie;
                break;
            case B:
                this.impact=0.01*this.superficie;
                break;
            case C:
                this.impact=0.02*this.superficie;
                break;
            case D:
                this.impact=0.035*this.superficie;
                break;
            case E:
                this.impact=0.055*this.superficie;
                break;
            case F:
                this.impact=0.08*this.superficie;
                break;
            case G:
                this.impact=0.1*this.superficie;
                break;
        }
    }

    public int getsupericie(){
        return superficie;
    }

    public void setsuperficie(int superficie){
        this.superficie=superficie;
    }

    public CE getce(){
        return ce;
    }

    public void setce(CE ce){
        this.ce=ce;
    }

    public double getimpact(){
        return impact;
    }

    public void setimpact(double impact){
        this.impact=impact;
    }

    static public void empcarbonne(){
        System.out.println("Les francais émettent en moyenne 1696 kg de CO2 dans l'énergie et les utilités, 675 en construction et gros entretien et 335 en équipement des logements en moyenne par an.\nC'est un total de 2706 kg d'émission de CO2 par an dédié uniquement aux logements.");
    }
}
