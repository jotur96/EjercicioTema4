public class App {
    public static void main(String[] args) throws Exception {

        // ejercicio del IF
        int numeroIf = -100;
        if(numeroIf>0){
            System.out.println(numeroIf+" es positivo");
        }else if(numeroIf < 0){
            System.out.println(numeroIf+" es negativo");
        }else {
            System.out.println(numeroIf+" es 0");
        }

        // ejercicio del WHILE
        int numeroWhile = -3;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // ejercicio del DO WHILE
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile < 3);

        // ejercicio del FOR
        for(int numeroFor =0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        // ejercicio del SWITCH
        
        String estacion = "INVIERNO";
        switch(estacion){
            case "OTONO":
                System.out.println("Es otonio");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es invierno");
                break;
            case "VERANO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }

    }
}