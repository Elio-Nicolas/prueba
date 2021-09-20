package prueba_1;

/**
 *
 * @author usuario
 */
public class moto extends automovil {

    public final String color = "bordo";

    public moto(String marca, int modelo) {

        super(marca, modelo);
    }

    @Override
    public int getModelo() {
        return super.getModelo();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public String arrancar() {
        return " la moto " + marca + " arranco";
    }

    @Override
    public String frenar() {
        return " La moto " + marca + " freno";
    }

    public String construir() {

        return "La moto se construyo ";
    }

    public String getColor() {
        return color;
    }

}
