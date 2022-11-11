public class MAIN {

    public static void main(String[] args) {

    int numeroif = 10;

    if (numeroif > 0){
        System.out.println("Es positivo");
    }
    else if (numeroif < 0){
        System.out.println("Es negativo");
    }
    else {
        System.out.println("Es igual a 0");
    }

///////////////////////////////////////////////////////////////////////////

    int numeroWhile = 1;

    while (numeroWhile < 3){
        System.out.println(numeroWhile);
        numeroWhile++;

    }

/////////////////////////////////////////////////////////////////////////////

    do{
        System.out.println(numeroWhile);
        numeroWhile++;
    } while (numeroWhile < 3);

////////////////////////////////////////////////////////////////////////////////

    for (int numeroFor=0; numeroFor<=3; numeroFor++){
        System.out.println(numeroFor);
    }

///////////////////////////////////////////////////////////////////////////////////

    String estaciones = "INVIERNO";

    switch (estaciones){
        case "VERANO": System.out.println("Es verano"); break;
        case "OTOÑO": System.out.println("Es otoño"); break;
        case "PRIMAVERA": System.out.println("Es primavera"); break;
        case "INVIERNO": System.out.println("Es invierno"); break;
        default: System.out.println("No es ninguna estacion"); break;
    }
    }




}
