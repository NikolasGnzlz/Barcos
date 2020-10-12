public class Especial extends Barco {
    protected int mastiles;
    protected int cvPotencia;
    protected int camarotes;
    static final String tipoBarco = "Especial";

    public Especial(String matricula, double eslora, int añoFabr,int cvPotencia,int mastiles,int camarotes) {
        super(matricula, eslora, añoFabr,tipoBarco);

        this.mastiles=mastiles;
        this.cvPotencia=cvPotencia;
        this.camarotes=camarotes;
    }//Cierre Constructor

    public int getMastiles(int mastiles){
        return mastiles;
    }

    public int getCvPotencia(int cvPotencia){ return cvPotencia; }

    public int getCamarotes(int camarotes){
        return camarotes;
    }

    public void setMastiles(int mastiles){
        this.mastiles=mastiles;
    }

    public void setCvPotencia(int cvPotencia){
        this.cvPotencia=cvPotencia;
    }

    public void setCamarotes(int camarotes){
        this.camarotes=camarotes;
    }
}//Cierra Barco Especial
