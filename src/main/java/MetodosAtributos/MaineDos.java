package MetodosAtributos;

public class MaineDos {
    public static void main(String[] args) {


        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impresa");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.NARANJA);
        subaru.setColorMatricula(Automovil.COLOR_AMARILLO);

        System.out.println();

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("rx7");
        mazda.setCilindrada(4.2);
        mazda.setColor(Color.BLANCO);

        Automovil mercedez = new Automovil("mercedez", "blk",Color.AMARILLO, 2.4);

        System.out.println(subaru.toString());
        System.out.println(mazda.toString());

        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAX_CIUDAD);

  //EJEMPO UTILIZANDO LA ENUM:
        Automovil ferrari=new Automovil();
        ferrari.setColor(Color.AZUL);

    }
}
