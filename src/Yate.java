public class Yate extends Barco {
    protected int cvPotencia;
    protected int camarotes;
    static final String tipoBarco = "Yate";


    public Yate(String matricula, double eslora, int añoFabr,int cvPotencia,int camarotes) {
        super(matricula, eslora, añoFabr,tipoBarco);

        this.cvPotencia=cvPotencia;
        this.camarotes=camarotes;
    }//Cierre Constructor

    public int getCvPotencia(int cvPotencia){
        return cvPotencia;
    }

    public int getCamarotes(int camarotes){
        return camarotes;
    }

    public void setCvPotencia(int cvPotencia){
        this.cvPotencia=cvPotencia;
    }

    public void setCamarotes(int camarotes){
        this.camarotes=camarotes;
    }

}//Cierre Yate
