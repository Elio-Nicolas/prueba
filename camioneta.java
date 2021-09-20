package prueba_1;

/**
 *
 * @author usuario
 */
public class camioneta extends automovil implements Interface_1 {

    private String color;

    public camioneta(String marca, int modelo) {
        super(marca, modelo);
        this.color = "blanco";
    }

    @Override
    public String arrancar() {

        return "El automovil " + marca + " arranco";
    }

    @Override
    public String frenar() {

        return "El automovil " + marca + " freno";
    }

    @Override
    public String construir() {
        return "El automovil se construyo";
    }

    public String getColor() {
        return color;
    }

}
