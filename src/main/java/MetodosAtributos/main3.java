package MetodosAtributos;

public class main3 {
    public static void main(String[] args) {

        Rueda[] ruedasFord = new Rueda[5];
        for (int i = 0; i < ruedasFord.length; i++) {
            ruedasFord[i] = new Rueda("Yokohama", 16, 7.5);
        }


        //OBJETO SETEADO DESDE METODOS:
        Persona conductorFord = new Persona("Luci", "Martinez");
        //persona seteada fura del constructor
        Automovil ford = new Automovil(
                "Ford",
                "focus");


        ford.setConductor(conductorFord);
        ford.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        ford.setTanque(new Tanque());
        ford.setColor(Color.BLANCO);
        ford.setTipo(TipoAutomovil.SEDAN);
        ford.setConductor(conductorFord);
        ford.setRuedas(ruedasFord);


        Rueda[] ruedasMaz = new Rueda[5];
        for (int i = 0; i < ruedasMaz.length; i++) {
            ruedasMaz[i] = new Rueda("Michelin", 18, 10.5);
        }


        //persona utilizada instanciada dentro del constructor
        //objeto completamente seteado con constructor
        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil(
                "Mazda",
                "rx-7",
                Color.AZUL,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(60),
                TipoAutomovil.SEDAN,
                ruedasMaz, pato
        );
        //METODOS DEL OBJETO fordMustan
        mazda.setConductor(pato);
        mazda.toString();

        Rueda[] ruedasNissan = new Rueda[5];
        for (int i = 0; i < ruedasNissan.length; i++) {
            new Rueda("Pirelli", 20, 11.5);
        }
        Persona Bea = new Persona("Bea", "Rodriguez");
        Automovil nissan = new Automovil(
                "Nissan",
                "Navara",
                Color.NARANJA,
                new Motor(3.0, TipoMotor.NAFTA),
                new Tanque(80),
                TipoAutomovil.SEDAN,
                ruedasNissan, Bea);

        //EJEMPLO EXACTO DEL VIDEO

        Persona lalo = new Persona("lalo", "Rodrgiguez");
        Automovil nissan2 = new Automovil(
                "Nissan",
                "petete",
                Color.AMARILLO,
                new Motor(3.0, TipoMotor.DIESEL));
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setTanque(new Tanque());
        nissan2.setConductor(lalo);


        //ver detalles
        System.out.println(mazda.verDetalle());


    }
}
