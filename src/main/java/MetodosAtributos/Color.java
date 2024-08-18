package MetodosAtributos;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NARANJA("Naranja");
    private final String color;

    public String getColor() {
        return color;
    }

    Color(String color) {
        this.color = color;

    }


}



