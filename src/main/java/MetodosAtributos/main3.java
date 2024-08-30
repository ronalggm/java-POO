package MetodosAtributos;

public class main3 {
    public static void main(String[] args) {

        Persona conductorFord = new Persona("Luci", "Martinez");

        Automovil ford = new Automovil("Ford",
                "focus",
                Color.AZUL,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(60), TipoAutomovil.SEDAN);

        ford.setConductor(conductorFord);

        System.out.println(ford.toString());

        Persona conducrtorFordMustang = new Persona("pato", "gomez");
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


    }
}
