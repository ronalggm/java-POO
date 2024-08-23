package MetodosAtributos;

public class Automovil {
    //FORMAS DE PARAMETRIZAR CONSTRUCTORES Y METODOS CON FINAL O CON ENUM

    /*En este caso se utilizo enum para todas los constructores y metodos, pero se pueden
    cambiar por las constantes clasicas*/

    private String fabricante;
    private String modelo;
    private Color color = Color.AZUL;
    private Motor motor;
    private Tanque tanque;
    private int id;
    private Color ColorMatricula;
    private Persona conductor;
    private Rueda[] ruedas;
    //statics
    private static int ultimoId;
    private static Color colorMatricula = Color.BLANCO;

    //CONSTANTES
    public static final Integer VELOCIDAD_MAX_CARRETERA = 160;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    //CONSTANTES COLORES DE FORMA CLASICA
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_VERDE = "Verde";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    //CONSTANTES CON ENUM
    private TipoAutomovil tipo;


    //Constructores anidados (ahorramos codigo  )

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;

    }

    public Automovil(String fabricante, String modelo, Color color) {

        this(fabricante, modelo);/*Implicitamente con this() llamamos al constructor
                de arriba que tiene los dos parametros fabricante y modelo*/
        this.color = color;

    }

    public Automovil(String fabricante, String modelo,
                     Color color, Motor motor) {

        this(fabricante, modelo, color);
        this.motor = motor;
    }


    public Automovil(String fabricante, String modelo,
                     Color color, Motor motor,
                     Tanque tanque) {

        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo,
                     Motor motor, Color color,
                     Tanque tanque, Rueda[] ruedas,
                     Persona conductor)
    {
        this(fabricante, modelo, color, motor);
        this.ruedas = ruedas;
        this.conductor = conductor;
    }

    public Automovil(String fabricante, String modelo,
                     Color color, Motor motor,
                     Tanque tanque, TipoAutomovil tipo)
    {
        this(fabricante, modelo, color, motor, tanque);
        this.tipo = tipo;
    }

    public String verDetalle() {
       String detalle="";
        if(this.getTipo()!=null){

        }
        
        return detalle="auto.fabricante=" + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.motor.getCilindrada() +
                "\nauto.colorMatricula =" + Automovil.colorMatricula;
    }


    //GETTERS AND SETTERS
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public int GetUltimoId() {
        return Automovil.ultimoId;
    }


    public void setColorMatricula(Color colorMatricula) {
        this.ColorMatricula = colorMatricula;
    }

    public Color getColorMatricula() {
        return Automovil.colorMatricula;
    }


    public TipoAutomovil getTipo() {
        return tipo;
    }


    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }


    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

//METODOS LOGICOS

    //METODO COMPARATIVO

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Automovil)) {
            return false;
        }

        Automovil a = (Automovil) obj;
        return this.fabricante != null &&
                this.modelo != null &&
                this.getFabricante().equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo());
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        String tipo = "";
        try {
            tipo = getTipo().getNombre();

        } catch (NullPointerException e) {
            tipo = "no tiene tipo";
        }

        return "Automovil {"
                + "fabricante= " + fabricante
                + '\n'
                + ", modelo='" + modelo
                + '\n'
                + ", color='" + color.getColor()
                + '\n'
                + ", capacidadTanque"
                + tanque.getCapacidad()
                + '\n'
                + ", colorMatricula: " + Automovil.colorMatricula
                + '\n'
                + " idVehiculo: " + id
                + '\n'
                + " Tipo: " + tipo
                + '\n'
                + " Motor: " + motor.getCilindrada()
                + "' }'";


    }


    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + "acelerando a" + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + "frenando";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (this.tanque.getCapacidad() * porcentajeBencina);
    }


    public float calcularConsumo(int km, int porcentajeBencina) {

        return km / (this.tanque.getCapacidad() * (porcentajeBencina / 100f));
    }


}

