public class Velero extends Barco {
   protected int mastiles;
    static final String tipoBarco = "Velero";


    public Velero(String matricula, double eslora, int añoFabr, int mastiles) {
        super(matricula, eslora, añoFabr,tipoBarco);

        this.mastiles=mastiles;
    }//Cierre de constructor

    public int getMastiles(){
        return mastiles;
    }
    public void setMastiles(int mastiles){
        this.mastiles=mastiles;
    }


}//Cierre de Tipos de Barco
