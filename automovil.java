package prueba_1;

/**
 *
 * @author usuario
 */
public abstract class automovil {

    public final String marca;
    public final int modelo;

    public abstract String arrancar();
    public abstract String frenar();
   
    public automovil(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

}
