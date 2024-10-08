package MetodosAtributos;

public class Main {
    public static void main(String[] args) {


        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impresa");
        subaru.setMotor(new Motor(2.0, TipoMotor.NAFTA));
        subaru.setColor(Color.NARANJA);
        subaru.setColorMatricula(Color.BLANCO); //constante de forma clasica
        subaru.setTipo(TipoAutomovil.COUPE);
        System.out.println();

//OBJETO DE TIPO AUTOMOVIL CON CONSTRUCTOR SIMPLE
        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("rx7");
        mazda.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        mazda.setColor(Color.BLANCO);
        mazda.setTipo(TipoAutomovil.SEDAN);
        mazda.setTanque(new Tanque(60));
        //CON CONSTRUCTOR POR PARAMETROS
        Automovil mercedez = new Automovil(
                "mercedez",
                "blk",
                Color.AMARILLO,
                new Motor(2.0, TipoMotor.DIESEL));

        mercedez.setTipo(TipoAutomovil.SEDAN);


        System.out.println(subaru.toString());
        System.out.println();
        System.out.println(mazda.toString());
        System.out.println();


        //EJEMPO UTILIZANDO LA ENUM: y sin setear el tipo de vehiculo
        Automovil ferrari = new Automovil("Ferrari", "f40", Color.ROJO);
        System.out.println(ferrari.toString());
    }


}
