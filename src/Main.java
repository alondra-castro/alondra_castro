
import java.io.*;


class  Calculo {
    double interes, saldo, termino;

    public void asignar( double interes, double saldo,double termino ) {

        interes= interes;
        saldo = saldo;
        termino =termino;

    }


    public double amortizacion( double saldo, double termino){
        double amortizacion = ((saldo / termino)*12)+ 45.51;
        return amortizacion;

    }



    public double formula( double saldo, double termino)
    {   double pago;
        pago = (saldo + amortizacion(saldo, termino))/termino;
        return pago;

    }


    public double getTermino(){
        for(termino= termino; termino <= termino; termino--){
            termino--;
        }
        return termino;
    }

    public double getSaldo(double saldo){
        return saldo;

    }
}

public class Main {
    public static void main(String [] args)throws IOException {
        Calculo obj= new Calculo();
        double interes, termino, saldo;
        int con;

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


        try{
            System.out.println("Introduzca el interes");
            interes = Double.parseDouble(br.readLine());

            if(interes < 1 && interes > 25){
                System.out.println("Debe ser entre 1% al 25% " );

                System.out.println("Introduzca el interes");
                interes = Double.parseDouble(br.readLine());
            }
        }catch(NumberFormatException er){
            System.out.println("Debe introducir un número " + er );
            System.out.println("Introduzca el interes");
            interes = Double.parseDouble(br.readLine());

        }
        try{
            System.out.println("Introduzca el saldo");
            saldo = Double.parseDouble(br.readLine());
            if(saldo < 2000){
                System.out.println("Debe ser una cifra mayor a 2000 dolares " );

                System.out.println("Introduzca el saldo");
                saldo = Double.parseDouble(br.readLine());
            }

        }catch(NumberFormatException er){
            System.out.println("Debe introducir un número  " + er );
            System.out.println("Introduzca el saldo");
            saldo = Double.parseDouble(br.readLine());

        }
        try{
            System.out.println("Introduzca el termino");
            termino = Double.parseDouble(br.readLine());

            if(termino < 24  && termino > 360){
                System.out.println("Debe ser un numero entre 24 a 360 como terminos de meses a pagar" );

                System.out.println("Introduzca el termino");
                saldo = Double.parseDouble(br.readLine());
            }
        }catch(NumberFormatException er){
            System.out.println("Debe introducir un número entero " + er );
            System.out.println("Introduzca el termino");
            termino = Double.parseDouble(br.readLine());

        }


        obj.asignar(interes,saldo,termino);

        obj.formula(saldo,termino);

        System.out.println( "La amortización anual es de " + obj.amortizacion(saldo,termino));
        System.out.println( "El Pago Mensual es de " + obj.formula(saldo,termino));

        String []tabla = new String[]{"N°","SALDO ADEUDADO","INTERÉS","PAGO MENSUAL"};

        System.out.println("la Tabla de Amonetización");
        try{
            System.out.println("|" + tabla[0] + "|" +tabla[1] + "|" + tabla[2] + "|" +tabla[3] + "|");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error \\n" + e);
        }

            double pago = obj.formula( saldo, termino);
        double saldoe = saldo + obj.amortizacion(saldo,termino);

        for (termino= termino; termino >= 1 ; termino--) {

            //saldo= -  obj.getSaldo(saldo)- obj.formula(saldo, termino);

            //double pago= obj.formula(obj.getSaldo(saldo),  termino);

            String []tabla2 = new String[]{String.valueOf(con= (int) termino), String.valueOf(saldoe- obj.formula( saldo, termino)), String.valueOf(interes), String.valueOf(pago)};

            try{

                System.out.println("|" + tabla2[0] + "|" + tabla2[1] + "|" + tabla2[2] + "|" + tabla2[3] + "|");


            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error \\n" + e);
            }




        }
    }

}
