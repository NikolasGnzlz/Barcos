public class Deportivo extends Barco{
    protected int cvPotencia;
    static final String tipoBarco = "Deportivo";


    public Deportivo(String matricula, double eslora, int añoFabr,int cvPotencia) {
        super(matricula, eslora, añoFabr,tipoBarco);

        this.cvPotencia=cvPotencia;
    }//Cierre Constructor

    public int getCvPotencia(int cvPotencia){
        return cvPotencia;
    }
    public void setCvPotencia(int cvPotencia){
        this.cvPotencia=cvPotencia;
    }

}//Cierre Deportivo
