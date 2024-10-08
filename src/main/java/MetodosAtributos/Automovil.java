package MetodosAtributos;

import org.apache.commons.compress.harmony.pack200.CpBands;

public class Automovil {
    //FORMAS DE PARAMETRIZAR CONSTRUCTORES Y METODOS CON FINAL O CON ENUM

    /*En este caso se utilizo enum para todas los constructores y metodos, pero se pueden
    cambiar por las constantes clasicas*/

    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Tanque tanque;
    private int id;
    private Color ColorMatricula;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;
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
    private TipoAutomovil tipoAutomovil;


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
                     Color color, Motor motor, Tanque tanque) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo,
                     Color color, Motor motor,
                     Tanque tanque, TipoAutomovil tipo) {
        this(fabricante, modelo, color, motor, tanque);
        this.tipoAutomovil = tipo;
    }

    public Automovil(String fabricante, String modelo,
                     Color color, Motor motor,
                     Tanque tanque, TipoAutomovil tipo,
                     Rueda[] ruedas, Persona conductor) {

        this(fabricante, modelo, color, motor, tanque, tipo);
        this.ruedas = ruedas;
        this.conductor = conductor;
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
        if (tanque == null) {
            this.tanque = new Tanque();
        }

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
        return tipoAutomovil;
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

    //METODO ADD para ruedas
    public void addRueda(Rueda rueda) {
        if (indiceRuedas <= ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        } else {
            System.out.println("no se pueden agregar mas ruedas");
        }
    }


    public void setTipo(TipoAutomovil tipo) {
        this.tipoAutomovil = tipo;
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

        String tipoStr = (this.tipoAutomovil != null && this.tipoAutomovil.getNombre() != null) ? this.tipoAutomovil.getNombre() : "no tiene tipo";
        String fabricante = (this.fabricante != null) ? this.fabricante : "no tiene fabricante";
        String modelo = (this.modelo != null) ? this.modelo : "no tiene modelo";
        String color = (this.color != null && this.color.getColor() != null) ? this.color.getColor() : "no tiene color";
        String tanqueCapacidad = (this.tanque != null) ? String.valueOf(this.tanque.getCapacidad()) : "no tiene tanque";
        // double motorCilindrada = (this.motor.getCilindrada() != 0) ? this.motor.getCilindrada():0.0;

        String motorCilindrada = (this.motor != null && this.motor.getCilindrada() != null)
                ? String.valueOf(this.motor.getCilindrada())//se convierte a string un objeto de tipo Double (cilindrada)
                : "no se asignó cilindrada";

        return "Automovil {"
                + "fabricante= " + fabricante + '\n'
                + ", modelo= " + modelo + '\n'
                + ", color= " + color + '\n'
                + ", capacidadTanque= " + tanqueCapacidad + '\n'
                + ", colorMatricula= " + Automovil.colorMatricula + '\n'
                + " idVehiculo= " + id + '\n'
                + " Tipo= " + tipoStr + '\n'
                + " Motor= " + motorCilindrada
                + "' }'";


    }


    public String verDetalle() {
        /*En este caso vamos sumando cadenas segun si algun valor es null o no*/
        String detalle = "\nauto.id=" + this.id +
                "\nauto.fabricante=" + this.fabricante +
                "\nauto.modelo = " + this.modelo;

        if (getColor() != null) {
            detalle += "\nauto.color" + this.color;
        }

        if (this.getTipo() != null) {
            detalle += "\nauto.tipo=" + this.getTipo().getDescripcion();
        }
        if (this.getMotor() != null) {
            detalle += "\nauto.cilindrada = " + this.getMotor().getCilindrada();
        }
        if (this.getColorMatricula() != null) {
            detalle += "\nauto.colorMatricula =" + this.getColorMatricula();
        }
        if (getConductor() != null) {
            detalle += "\nNombre del conductor: " + this.getConductor();
        }


        if (getRuedas() != null) {
            detalle += "\nRuedas del automovil: ";
            for (Rueda r : this.getRuedas()) {
                detalle += "\n" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho:" + r.getAncho();
            }
        }

        return detalle;
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

