package MetodosAtributos;

import org.checkerframework.checker.units.qual.A;

public class main2 {
    public static void main(String[] args) {

        Automovil ford = new Automovil("Ford",
                "focus",
                Color.AZUL,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(60), TipoAutomovil.SEDAN);

        System.out.println(ford.toString());


        Automovil fordMustang = new Automovil("Ford",
                "Mustang",
                Color.AZUL,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(60), TipoAutomovil.SEDAN
        );
        fordMustang.toString();

        Automovil mclaren = new Automovil();
        mclaren.setMotor(new Motor(3.0, TipoMotor.DIESEL));
        mclaren.setTanque(new Tanque(90));
        mclaren.setModelo("f1");
        mclaren.setFabricante("Mclaren");
        mclaren.setTipo(TipoAutomovil.SEDAN);
        System.out.println();
        //con logica toString (con try catch)
        System.out.println(mclaren.toString());
        TipoAutomovil tipo = TipoAutomovil.COUPE;

        //con logica de ver detalle (con condicionales)
        System.out.println(mclaren.verDetalle());
        //logica getTanque
        //System.out.println(mclaren.getTanque());

        System.out.println();
        Automovil fiat = new Automovil("Fiat", "cronos", Color.BLANCO);
//fiat no tiene seteado:
        /*Tipo automovil*/
        System.out.println(fiat.toString());


    }
}
