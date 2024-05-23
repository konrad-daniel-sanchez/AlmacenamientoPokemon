
import java.util.LinkedList;
import persistencia.ArchivosConexion;
import pokemon.Pikachu;
import pokemon.Pokemon;
import pokemon.TipoPokemon;

public class Principal {
    public static void main(String[] args) {
        final String NOMBRE_ARCHIVO = "listaPokemones.pokeDany";
        LinkedList<Pokemon> pokemones = new LinkedList<>();
        
        // GUARDAR:
        /**
        Pokemon pikachu1 = new Pikachu("Pikachu No 1", 50, 60, TipoPokemon.ELECTRICO);
        Pokemon pikachu2 = new Pikachu("Pikachu No 2", 45, 32, TipoPokemon.ELECTRICO);
        pokemones.add(pikachu1);
        pokemones.add(pikachu2);
        
        // Guardo el archivo
        ArchivosConexion.guardar(pokemones, NOMBRE_ARCHIVO);
        * */

        // LEER:
        pokemones = (LinkedList<Pokemon>)ArchivosConexion.leer(NOMBRE_ARCHIVO);
        System.out.println("Los pokemones guardados son:");
        for (int i = 0; i < pokemones.size(); i++) {
            Pokemon p = pokemones.get(i);
            System.out.println(p.getNombre() + " - Salud: " + p.getSalud() + " - Ataque: " + p.getPuntosDeAtaque() + " - " + p.getTipo() + " - " + p.getEstado());
        }
        
    }
}
