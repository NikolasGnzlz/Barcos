public  class Barco {
    protected String matricula;
    protected int añoFabr;
    protected double eslora;
    protected String tipoBarco;

    public Barco(String matricula, double eslora, int añoFabr,String tipoBarco){

        this.matricula=matricula;
        this.eslora = eslora;
        this.añoFabr = añoFabr;
        this.tipoBarco = tipoBarco;

    }

    public String getMatricula(){
        return matricula;
    }
    public int getAñoFabr(){
        return añoFabr;
    }
    public double getEslora(){
        return eslora;
    }
    public String getTipoBarco(){ return tipoBarco; }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setAñoFabr(int añoFabr) {
        this.añoFabr = añoFabr;
    }
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
    public void setTipoBarco(String tipoBarco) { this.tipoBarco = tipoBarco; }
}
