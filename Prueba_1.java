package prueba_1;

/**
 *
 * @author usuario
 */
public class Prueba_1 {

    public static void main(String[] args) {

        camioneta dos = new camioneta("Ranger", 2021);
        moto motito = new moto("Dax", 2020);

        System.out.println(dos.construir() + ": Ford : " + dos.getMarca() + " ,modelo " + dos.getModelo() + ", color " + dos.getColor());
        System.out.println(dos.arrancar());
        System.out.println(dos.frenar());
        System.out.println("");
        System.out.println(motito.construir() + ":Honda : " + motito.marca + " ,modelo " + motito.modelo + " color " + motito.color);
        System.out.println(motito.arrancar());
        System.out.println(motito.frenar());
    }

}
