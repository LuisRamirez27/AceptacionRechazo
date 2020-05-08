package sample;

import java.io.IOException;

public class AceptacionRechazo {
    double R1,R2;
    double X;
    double probabilidad;
    double [] numeros;
    int i,j;
    Archivo_dato archivo_dato=new Archivo_dato();
//----------------------------------------------------------------------------------------------------------------------
   public AceptacionRechazo(int muestra) throws IOException {
       numeros=archivo_dato.Leer(muestra,"sample/numeros.dato");
       j=0;
       i=0;
        do {

            do {
                R1=numeros[i];
                X=2*R1;
                i++;
            }while ((X<0 || X>1)&&i<muestra);
            R2=numeros[j];
            j++;
        }while (R2>2*X && j<muestra);
        if (j>=muestra)
        {
            System.out.println("Los numeros NO cumplen con la distribucion deseada");
        }
        else{
            System.out.println("Los numeros cumplen con la distribucion deseada");
            System.out.println(R1);
            System.out.println(R2);
        }

    }//fin del constructor
//----------------------------------------------------------------------------------------------------------------------


}
