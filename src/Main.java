

public class Main {


    public static void main(String[] args) {
        int numero=0;
        int num=0;
        String estacion="otono";

        System.out.println("Condicionales ");

        if(numero == 0){

            System.out.println(" La variable es un cero ");
        }
        if(numero<0){
            System.out.println(" La variable es un numero negativo");
        }
        if(numero > 0 ){
            System.out.println("La variable es un numero positivo");
        }

        System.out.println("Ejecucion  bucle while ");


        while (numero<3){

            numero ++;
            System.out.println("ejecutando " + numero);
        }


        System.out.println(" ejecucion Do-While");

        do{
            numero ++;
            System.out.println("ejecutando " + numero);
        }while(numero<3);


        System.out.println(" ejecucion del for ");


        for (int nume = 0; nume <=3 ; nume++) {

            System.out.println("ejecucion numero: "+ nume);
        }


        System.out.println("Ejecucion Switch ");


        switch(estacion){

            case "verano":
                System.out.println("La estacion es Verano");
                break;

            case "invierno":
                System.out.println("La estacion es invierno ");
                break;
            case "otono":
                System.out.println("La estacion es Otono");
                break;
            case "primavera":
                System.out.println("La estacion es Primavera ");
                break;
            default:
                System.out.println("La palabra no es una estacion ");
        }
        
        

    }


}