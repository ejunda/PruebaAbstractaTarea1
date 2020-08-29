/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaabstractatarea1;

/**
 *
 * @author Erick Unda
 */
abstract class VehiculoAutonomo{
    private double ancho;
    private double altura;
    private double longitud;
    private String tipoMotor;
    private int amperajeMotor;

    public VehiculoAutonomo(double ancho, double altura, double longitud, String tipoMotor, int amperajeMotor){

        this.ancho = ancho;
        this.altura = altura;
        this.longitud = longitud;
        this.tipoMotor = tipoMotor;
        this.amperajeMotor =amperajeMotor;
    }

    public double Disenio(){
        System.out.println("Caracteristicas para el diseÃ±o del vehÃ­culo autÃ³nomo.");
        return 0.0;
    }

    public void Ensamble(){
        System.out.println("Comprobar que las medidad "+ancho+", "+altura+" y "+longitud+" seÃ¡n correctas.");
    }

    public String toString(){
        return ancho+""+altura+""+longitud+""+tipoMotor+""+amperajeMotor;
    }

    public double getAncho(){
        return ancho;
    }
    public double getAltura(){
        return altura;
    }
    public double getLongitud(){
        return longitud;
    }

    public String getTipoMotor(){
        return tipoMotor;
    }

    public int getAmperajeMotor(){
        return amperajeMotor;
    }

}

class Prototipo extends VehiculoAutonomo{
    private int prototipo;

    public Prototipo(double ancho,double altura,double longitud ,String tipoMotor,int amperajeMotor, int prototipo){
        super(ancho,altura,longitud,tipoMotor,amperajeMotor);
        setPrototipo(prototipo);
    }

    public void Ensamble(){
        System.out.println("Dentro del Metodo Ensamble de la clase Prototipo");
        System.out.println("Verificado medidas "+getAncho()+" cm de ancho, "+getAltura()+" cm de altura y "+getLongitud()+" cm"
                + " de longitud del vehÃ­culo autÃ³nomo para el prototipo "+getPrototipo()+" con motor "+getTipoMotor()+""
                        + " de "+getAmperajeMotor()+" Amperios.");

    }

    public int getPrototipo(){
        return prototipo;
    }

    public void setPrototipo(int nuevo){
        if(nuevo>=0.0)
            prototipo=nuevo;
    }

    public double Disenio(){

        return prototipo;
    }
}

class Construccion extends VehiculoAutonomo{
    private int construccion;

    public Construccion(double ancho,double altura,double longitud ,String tipoMotor,int amperajeMotor, int construccion){
        super(ancho,altura,longitud,tipoMotor,amperajeMotor);
        setConstruccion(construccion);
    }

    public void Ensamble(){
        System.out.println("Dentro del Metodo Ensamble de la clase Construccion");
        System.out.println("Verificado medidas "+getAncho()+" cm de ancho, "+getAltura()+" cm de alto y "+getLongitud()+" cm de longitud"
                + " del vehÃ­culo autÃ³nomo para la construcciÃ³n nÃºmero "+getConstruccion()+" con motor "+getTipoMotor()+""
                        + " de "+getAmperajeMotor()+" Amperios.");

    }

    public int getConstruccion(){
        return construccion;
    }

    public void setConstruccion(int nuevo){
        if(nuevo>=0.0)
            construccion=nuevo;
    }

    public double Disenio(){

        return construccion;
    }
}
public class PruebaAbstractaTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("____________________");
        System.out.println("---------[UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE]---------");
        System.out.println("ASIGNATURA: PROGRAMACION");
        System.out.println("DOCENTE: ING. LUIS ALBERTO GUERRA CRUZ");
        System.out.println("NRC: 7450");
        System.out.println("INTEGRANTES:");
        System.out.println("-----> ALEX BELTRAN");
        System.out.println("-----> ERICK UNDA");

        VehiculoAutonomo ObjetoVehiculoAutonomo1 = new Prototipo(50.5, 24.5, 80, "DC", 8,1);
        Prototipo ObjetoPrototipo = new Prototipo(48, 25.5, 79.5, "DC",8,2);

        System.out.println("\nIntegrando los datos de un vehículo autónomo:");
        System.out.println("LLamada a Ensamble de vehículo usando la referencia"
                + " de la clase VehiculoAutonomo***");
        ObjetoVehiculoAutonomo1.Ensamble();
        System.out.println("\nIntegrando los datos de un vehículo autónomo:");
        System.out.println("LLamada a Ensamble de vehículo usando la referencia"
                + " de la clase VehiculoAutonomo***");
        ObjetoPrototipo.Ensamble();

        VehiculoAutonomo ObjetoVehiculoAutonomo2 = new Construccion(51.5, 25, 80, "DC",8,1);
        Construccion ObjetoConstruccion = new Construccion(49.5, 26.5, 81.5, "DC",8,2);

        System.out.println("\nIntegrando los datos de un vehículo autónomo:");
        System.out.println("LLamada a Ensamble de vehículo usando la referencia"
                + " de la clase VehiculoAutonomo***");
        ObjetoVehiculoAutonomo2.Ensamble();
        System.out.println("\nIntegrando los datos de un vehículo autónomo:");
        System.out.println("LLamada a Ensamble de vehículo usando la referencia"
                + " de la clase VehiculoAutonomo***");
        ObjetoConstruccion.Ensamble();

    }

}
