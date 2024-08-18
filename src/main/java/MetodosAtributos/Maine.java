package MetodosAtributos;

public class Maine {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("Impresa");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");


        System.out.println();

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("rx7");
        mazda.setCilindrada(4.2);
        mazda.setColor("Verde");

        System.out.println(subaru.verDetalle());

        System.out.println(mazda.verDetalle());

        System.out.println();
        mazda.toString();
        //       System.out.println(mazda.acelerarFrenar(4000));
        //     System.out.println("Kilometros por litro " + subaru.calcularConsumo(200, 0.65f));
        //   System.out.println("Kilometros por litro " + subaru.calcularConsumo(300, 60));




    }

}
