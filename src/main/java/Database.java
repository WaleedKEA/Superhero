
import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public void createSuperhero(String superheltnavn, String rigtigenavn,
                                String superkræft, double powerlevel, int opdagelsesår) {

        Superhero superhero = new Superhero(superheltnavn, rigtigenavn, superkræft, powerlevel, opdagelsesår);
        superheroes.add(superhero);
    }

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public Superhero searchForSuperhero(String searchTerm) {
        for (Superhero s : getSuperheroes()) {
            if (s.getSuperheltNavn().contains(searchTerm)) {
                System.out.println("Fundet superhelt: ");
                return s;
            }
            if (s.getSuperheltNavn().equals(searchTerm)) {
                System.out.println("Fundet superhelt:  ");
                return s;
            }
            System.out.println("Ikke muligt at finde superhelt: ");
            return null;
        }
        System.out.println("Ikke muligt at finde superhelt: ");
        return null;
    }
}
