import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Main {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {

        /*               *****----CREAMOS LOS BARCOS----*****                 */

        Velero Vel1 = new Velero("WAR300", 6.5, 1990, 1);
        Velero Vel2 = new Velero("BMW250", 10.2, 2012, 3);
        Velero Vel3 = new Velero("M43I0B", 9.5, 1998, 2);
        Velero Vel4 = new Velero("P0N73R", 8.6, 2010, 4);

        Deportivo Dep1 = new Deportivo("D3P03T", 7.3, 2015, 280);
        Deportivo Dep2 = new Deportivo("13R34M", 7.5, 2017, 260);
        Deportivo Dep3 = new Deportivo("BHR011", 5.7, 2012, 150);
        Deportivo Dep4 = new Deportivo("M474D0R", 8.6, 2019, 310);

        Yate Yat1 = new Yate("H1P01N", 7.7, 2009, 230, 4);
        Yate Yat2 = new Yate("N10P1H", 6.5, 2014, 180, 2);
        Yate Yat3 = new Yate("K474M4", 8.5, 2015, 210, 3);
        Yate Yat4 = new Yate("MEI011", 9.8, 2020, 280, 5);

        Especial Esp1 = new Especial("04OCT1", 7.5, 2009, 250, 3, 4);
        Especial Esp2 = new Especial("1TCO40", 9.5, 2007, 210, 2, 1);
        Especial Esp3 = new Especial("M4NFR33", 6.5, 2014, 190, 2, 2);
        Especial Esp4 = new Especial("FR33F1R3", 10.8, 2019, 270, 3, 4);

        //      *****---- ALQUILER DE CADA BARCO----*****

        //Tenemos 14 Alquileres.

        ArrayList<Alquiler> listaAlquiler = new ArrayList<Alquiler>();

        Alquiler Aql1 = new Alquiler("Miklo Fedor", 95947836, "03/02/2020", "10/02/2020", 20, Vel1);
        listaAlquiler.add(Aql1);
        Alquiler Aql2 = new Alquiler("Gabriel Diaz", 95965984, "01/01/2020", "08/01/2020", 5, Vel2);
        listaAlquiler.add(Aql2);
        Alquiler Aql3 = new Alquiler("Ronald Koeman", 95758478, "15/10/2020", "20/10/2020", 10, Vel3);
        listaAlquiler.add(Aql3);


        Alquiler Aql4 = new Alquiler("Daniel Alves", 92569871, "05/02/2020", "20/02/2020", 10, Dep1);
        listaAlquiler.add(Aql4);
        Alquiler Aql5 = new Alquiler("Yosef Martinez", 91951357, "04/03/2020", "18/03/2020", 7, Dep2);
        listaAlquiler.add(Aql5);
        Alquiler Aql6 = new Alquiler("Roberto Carlos", 98369789, "01/08/2020", "29/08/2020", 6, Dep3);
        listaAlquiler.add(Aql6);
        Alquiler Aql7 = new Alquiler("Jefferson Savarino", 95321951, "05/05/2020", "15/05/2020", 17, Dep4);
        listaAlquiler.add(Aql7);

        Alquiler Aql8 = new Alquiler("Enrique Peña Zauner", 95561248, "05/11/2020", "28/11/2020", 15, Yat1);
        listaAlquiler.add(Aql8);
        Alquiler Aql9 = new Alquiler("Alexis Sanchez", 93357648, "15/10/2020", "20/10/2020", 4, Yat2);
        listaAlquiler.add(Aql9);
        Alquiler Aql10 = new Alquiler("Salomon Rondon", 90989254, "13/06/2020", "25/06/2020", 13, Yat3);
        listaAlquiler.add(Aql10);
        Alquiler Aql11 = new Alquiler("Ruud Van Nistelrooy", 94404573, "01/12/2020", "30/12/2020", 11, Yat4);
        listaAlquiler.add(Aql11);

        Alquiler Aql12 = new Alquiler("Ricardo Quaresma", 91753654, "01/09/2020", "30/09/2020", 3, Esp1);
        listaAlquiler.add(Aql12);
        Alquiler Aql13 = new Alquiler("Ronaldo Nazario", 99900900, "09/04/2020", "28/04/2020", 9, Esp2);
        listaAlquiler.add(Aql13);
        Alquiler Aql14 = new Alquiler("Edgar Davids", 97753357, "07/07/2020", "15/07/2020", 8, Esp3);
        listaAlquiler.add(Aql14);




        System.out.println( " *****----PRECIOS DE ALQUILERES DE BARCOS   ----*****        \n");
        for (Alquiler a: listaAlquiler) {
            System.out.println(" \tPrecio Alquiler: " + a.calcularAlquiler()
                    + " \tBarco: " + a.getBarco().tipoBarco);//.getTipoBarco()
        }



        /*     *****----ACA LLAMADO METODOS PROMEDIO, MAYOR, MENOR  (MENSUAL-ANUAL)----*****    */


        DecimalFormat patron = new DecimalFormat("#,00");
        String MesString[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        double promeAlquiler[] = calcularPromedioAlquiler(listaAlquiler, MesString);
        double promeAnual = calcularPromedioAlquilerAnual(promeAlquiler);

        double mayorAlquiler[] = MayorPrecioAlquiler(listaAlquiler, MesString);
        double mayorAlquilerAnual = MayorPrecioAlquilerAnual(mayorAlquiler);

        double menorAlquiler[] = MenorPrecioAlquiler(listaAlquiler, MesString, mayorAlquilerAnual);
        double menorAlquilerAnual =  MenorPrecioAlquilerAnual(menorAlquiler, mayorAlquilerAnual);


        System.out.println( "\n   *****----LISTADO  MENSUAL Y ANUAL----***** \n");
        for (int i = 0; i < MesString.length; i++) {
            System.out.println(" \tMes " + MesString[i] + " \tPromedio: " + patron.format(promeAlquiler[i])
                    + " \tMayor: " + mayorAlquiler[i] + " \tMenor :" + menorAlquiler[i]);
        }
        System.out.println("\t \n**--Promedio Anual: " + patron.format(promeAnual) +
                " \tMayor: " + mayorAlquilerAnual + " \tMenor: " + menorAlquilerAnual+"--**");

    }//Cierra metodo Main


    /*    *****----METODOS PARA PROMEDIO, MAYOR, MENOR  ( ANUAL )----*****       */


    public static double calcularPromedioAlquilerAnual(double promedioAlquileres[]) {
        double promedio = 0;

        for (int i = 0; i < promedioAlquileres.length; i++) {
            promedio += promedioAlquileres[i];
        }
        return (promedio / 12);
    }

    public static double MayorPrecioAlquilerAnual(double MayorAlquiler[]) {
        double mayor = 0;

        for (int i = 0; i < MayorAlquiler.length; i++) {
            if (mayor < MayorAlquiler[i]) {
                mayor = MayorAlquiler[i];
            }
            else {
                continue;
            }
        }
        return mayor;
    }

    public static double MenorPrecioAlquilerAnual(double MenorAlquiler[], double MayorAlquilerAnual) {
        double menor = 0;

        for (int i = 0; i < MenorAlquiler.length; i++) {
            if (MayorAlquilerAnual > MenorAlquiler[i]) {
                menor = MenorAlquiler[i];
            }
            else {
                continue;
            }
        }
        return menor;
    }



    /*       *****----METODOS PARA PROMEDIO, MAYOR, MENOR  ( MENSUAL )----***** */


    public static double[] MayorPrecioAlquiler(ArrayList<Alquiler> listaAlquiler, String Meses[]) {
        double mayorPrecioAlquiler[] = new double[12];
        double mayor;

        for (int i = 0; i < Meses.length; i++) {
            Calendar inicio = new GregorianCalendar(2020, i, 1);
            Calendar fin = new GregorianCalendar(2020, i, 30);
            mayor = 0;

            for (int j = 0; j < listaAlquiler.size(); j++) {
                Calendar fecha = listaAlquiler.get(j).getFechaIni();

                if ((fecha.getTime().after(inicio.getTime()) || fecha.getTime().equals(inicio.getTime())) && ((fecha.getTime().before(fin.getTime())) || fecha.getTime().equals(inicio.getTime()))) {
                    if (mayor < listaAlquiler.get(j).calcularAlquiler()) {
                        mayor = listaAlquiler.get(j).calcularAlquiler();
                    }
                }
                else {
                    continue;
                }
            }
            mayorPrecioAlquiler[i] = mayor;
        }
        return mayorPrecioAlquiler;
    }



    public static double[] MenorPrecioAlquiler(ArrayList<Alquiler> listaAlquiler, String Meses[], double mayorAlquilerAnual) {
        double menorPrecioAlquiler[] = new double[12];
        double menor;

        for (int i = 0; i < Meses.length; i++) {
            Calendar inicio = new GregorianCalendar(2020, i, 1);
            Calendar fin = new GregorianCalendar(2020, i, 30);
            menor = mayorAlquilerAnual;

            for (int j = 0; j < listaAlquiler.size(); j++) {
                Calendar fecha = listaAlquiler.get(j).getFechaIni();

                if ((fecha.getTime().after(inicio.getTime()) || fecha.getTime().equals(inicio.getTime())) && ((fecha.getTime().before(fin.getTime())) || fecha.getTime().equals(inicio.getTime()))) {
                    if (menor > listaAlquiler.get(j).calcularAlquiler()) {
                        menor = listaAlquiler.get(j).calcularAlquiler();
                    }
                    else {
                        continue;
                    }
                }
            }
            if (menor != mayorAlquilerAnual) {
                menorPrecioAlquiler[i] = menor;
            }
            else {
                menorPrecioAlquiler[i] = 0.0;
            }
        }
        return menorPrecioAlquiler;
    }



    public static double[] calcularPromedioAlquiler(ArrayList<Alquiler> listaAlquiler, String Meses[]) {
        double promeAlquiler[] = new double[12];
        double sumatoria;

        for (int i = 0; i < Meses.length; i++) {
            Calendar inicio = new GregorianCalendar(2020, i, 1);
            Calendar fin = new GregorianCalendar(2020, i, 30);
            sumatoria = 0;

            for (int j = 0; j < listaAlquiler.size(); j++) {
                Calendar fecha = listaAlquiler.get(j).getFechaIni();

                if ((fecha.getTime().after(inicio.getTime()) || fecha.getTime().equals(inicio.getTime())) && ((fecha.getTime().before(fin.getTime())) || fecha.getTime().equals(inicio.getTime()))) {
                    sumatoria += listaAlquiler.get(j).calcularAlquiler();
                } else {
                    continue;
                }
            }
            promeAlquiler[i] = (sumatoria / 30);
        }
        return promeAlquiler;
    }
}
