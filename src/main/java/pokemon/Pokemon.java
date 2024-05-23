package pokemon;

import java.io.Serializable;

public abstract class Pokemon implements Serializable {
    protected String nombre;
    protected int salud;
    protected int puntosDeAtaque;
    protected TipoPokemon tipo;
    protected Estado estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = Estado.NORMAL;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public Estado getEstado() {
        return estado;
    }
}
