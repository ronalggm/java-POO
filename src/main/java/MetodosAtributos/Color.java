package MetodosAtributos;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NARANJA("Naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

}



