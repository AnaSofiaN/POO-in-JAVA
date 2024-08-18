public class Mascota {
    private String raza;
    private String color;
    private String nombre;

    public Mascota(String raza, String color, String nombre) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
