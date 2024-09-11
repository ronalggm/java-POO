package MetodosAtributos;

public class main3 {
    public static void main(String[] args) {

        Rueda[] ruedasFord = new Rueda[5];
        ruedasFord[0] = new Rueda("Yokohama", 16,7.5 );

        Persona conductorFord = new Persona("Luci", "Martinez");
        //persona seteada fura del constructor
        Automovil ford = new Automovil(
                "Ford",
                "focus",
                Color.AZUL,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(60), TipoAutomovil.SEDAN);

        ford.setConductor(conductorFord);

        System.out.println(ford.toString());


        Persona conducrtorFordMustang = new Persona("pato", "gomez");
//persona utilizada por el constructor
        Automovil fordMustang = new Automovil("Ford",
                "Mustang",
                Color.AZUL,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(60),
                TipoAutomovil.SEDAN,
                null, conducrtorFordMustang
        );

        fordMustang.setConductor(conducrtorFordMustang);
        fordMustang.toString();


        Persona conductorMcLaren = new Persona("Bea", "Rodriguez");

        Automovil mclaren = new Automovil(
                "mClaren",
                "f1",
                Color.NARANJA,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(80),
                TipoAutomovil.SEDAN);


    }
}
