package Classes;

import java.io.Serializable;

/**
 * @author Chaphloziferar
 *
 */
public class Persona implements Serializable {

    private String nombre;
    private int edad;
    private String consola;
    private double precio;
    private String fecha;
    private String comentario;
    private String codigo;

    public Persona(String nombre, int edad, String consola, double precio, String fecha, String comentario, String codigo) {
        this.nombre = nombre;
        this.edad = edad;
        this.consola = consola;
        this.precio = precio;
        this.fecha = fecha;
        this.comentario = comentario;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
