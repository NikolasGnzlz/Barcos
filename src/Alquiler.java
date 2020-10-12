import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alquiler {

    protected String Nombre;
    protected int Dni;
    protected String fechaIni;
    protected String fechaFin;
    protected int posicionAmarre;
    protected Barco barco;
    protected int valorFijo;


    public Alquiler(String cliente, int Dni, String fechaIni, String fechaFin, int posicionAmarre, Barco barco) {
        this.Nombre = cliente;
        this.Dni = Dni;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.valorFijo = 2;
    }

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    private Calendar formateoDefecha(String fecha) {
        String splitFecha  [] = fecha.split("/");
        int año = Integer.parseInt(splitFecha[2]);
        int mes = Integer.parseInt(splitFecha[1])-1;
        int dia = Integer.parseInt(splitFecha[0]);
        Calendar fechaFormat = new GregorianCalendar(año, mes, dia);//dia,mes,año
        return fechaFormat;
    }

    public Calendar getFechaIni() {
        return formateoDefecha(this.fechaIni);
    }

    public double calcularAlquiler() {
        int diasOcupado = cantidadDias();
        double Modulo = Modulo();

        double totalAlquiler = diasOcupado * Modulo * this.valorFijo;
        return totalAlquiler;

    }
    private int cantidadDias() {
        Calendar fechaIni = formateoDefecha(this.fechaIni);
        Calendar fechaFin = formateoDefecha(this.fechaFin);
        int dias =  fechaFin.get(Calendar.DATE) - fechaIni.get(Calendar.DATE);
        return dias;
    }


    private double Modulo() {
        return barco.getEslora() * 10;

    }

    public int getValorFijo() {
        return valorFijo;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getDni() {
        return Dni;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setValorFijo(int valorFijo) {
        this.valorFijo = valorFijo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void  setBarco(Barco barco){
        this.barco = barco;
    }

}//Cierra Alquiler

