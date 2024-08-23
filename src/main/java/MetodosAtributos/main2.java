package MetodosAtributos;

import org.checkerframework.checker.units.qual.A;

public class main2 {
    public static void main(String[] args) {
        Automovil ford = new Automovil("Ford",
                "focus",
                Color.AZUL,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(60),TipoAutomovil.SEDAN);

        System.out.println(ford.toString());


        Automovil fordMustang = new Automovil("Ford",
                "Mustang",
                Color.AZUL,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(60),TipoAutomovil.SEDAN
                );




    }

}
