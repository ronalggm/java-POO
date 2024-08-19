package MetodosAtributos;

public class MainEnum {
    public static void main(String[] args) {


        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impresa");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.NARANJA);
        subaru.setColorMatricula(Automovil.COLOR_AMARILLO); //constante de forma clasica
        subaru.setTipo(TipoAutomovil.COUPE);
        System.out.println();

//OBJETO DE TIPO AUTOMOVIL CON CONSTRUCTOR SIMPLE
        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("rx7");
        mazda.setCilindrada(4.2);
        mazda.setColor(Color.BLANCO);
        mazda.setTipo(TipoAutomovil.SEDAN);

        //CON CONSTRUCTOR POR PARAMETROS
        Automovil mercedez = new Automovil(
                "mercedez",
                "blk",
                Color.AMARILLO,
                2.4);
        mercedez.setTipo(TipoAutomovil.SEDAN);


        System.out.println(subaru.toString());
        System.out.println();
        System.out.println(mazda.toString());
        System.out.println();

        //comparando tipos de vehiculosl;
        TipoAutomovil tipoSubaru = subaru.getTipo();
        TipoAutomovil tipoMazda = mazda.getTipo();
        TipoAutomovil tipoMercedez = mercedez.getTipo();

        System.out.println("SWITCH CASE:");
        switch (tipoSubaru) {
            case CONVERTIBLE -> System.out.println("El automovil es convertible");
            case FURGON -> System.out.println("El automovil es un furgon");
            case COUPE -> System.out.println("El automovil es un coupe");
            case HATCHBACK -> System.out.println("El automovil es un HatchBack");
            case PICKUP -> System.out.println("El automovil es un pickUp");
            case SEDAN -> System.out.println("El automovil es un Sedan");
            case STATION_WAGON -> System.out.println("El automovil es un stationWagon");
        }
        System.out.println();
        System.out.println("Recorriendo array");
        //ITERAR UNA CLASE DE TIPO ENUM:
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil e : tipos) {
            System.out.println(
                    e +
                            " ==> " + e.name()
                            + ", " + e.getNombre() + ", "
                            + e.getDescripcion()
                            + ", "
                            + e.getNumeroPuerta());

        }

    }


}
