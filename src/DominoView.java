import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DominoView {
    public List<Domino> listaDomin = new ArrayList<>();

    public void fillDominos() {
        listaDomin.add(new Domino("Pustynia", "Pustynia", 1));
        listaDomin.add(new Domino("Pustynia", "Pustynia", 2));
        listaDomin.add(new Domino("Las", "Las", 3));
        listaDomin.add(new Domino("Las", "Las", 4));
        listaDomin.add(new Domino("Las", "Las", 5));
        listaDomin.add(new Domino("Las", "Las", 6));
        listaDomin.add(new Domino("Woda", "Woda", 7));
        listaDomin.add(new Domino("Woda", "Woda", 8));
        listaDomin.add(new Domino("Woda", "Woda", 9));
        listaDomin.add(new Domino("Pole", "Pole", 10));
        listaDomin.add(new Domino("Pole", "Pole", 11));
        listaDomin.add(new Domino("Bagno", "Bagno", 12));
        listaDomin.add(new Domino("Pustynia", "Las", 13));
        listaDomin.add(new Domino("Pustynia", "Woda", 14));
        listaDomin.add(new Domino("Pustynia", "Pole", 15));
        listaDomin.add(new Domino("Pustynia", "Bagno", 16));
        listaDomin.add(new Domino("Las", "Woda", 17));
        listaDomin.add(new Domino("Las", "Pole", 18));
        listaDomin.add(new Domino("Pustynia*", "Las", 19));
        listaDomin.add(new Domino("Pustynia*", "Woda", 20));
        listaDomin.add(new Domino("Pustynia*", "Pole", 21));
        listaDomin.add(new Domino("Pustynia*", "Bagno", 22));
        listaDomin.add(new Domino("Pustynia*", "Jaskinia", 23));
        listaDomin.add(new Domino("Las*", "Pustynia", 24));
        listaDomin.add(new Domino("Las*", "Pustynia", 25));
        listaDomin.add(new Domino("Las*", "Pustynia", 26));
        listaDomin.add(new Domino("Las*", "Pustynia", 27));
        listaDomin.add(new Domino("Las*", "Woda", 28));
        listaDomin.add(new Domino("Las*", "Pole", 29));
        listaDomin.add(new Domino("Woda*", "Pustynia", 30));
        listaDomin.add(new Domino("Woda*", "Pustynia", 31));
        listaDomin.add(new Domino("Woda*", "Las", 32));
        listaDomin.add(new Domino("Woda*", "Las", 33));
        listaDomin.add(new Domino("Woda*", "Las", 34));
        listaDomin.add(new Domino("Woda*", "Las", 35));
        listaDomin.add(new Domino("Pustynia", "Pole*", 36));
        listaDomin.add(new Domino("Woda", "Pole*", 37));
        listaDomin.add(new Domino("Pustynia", "Bagno*", 38));
        listaDomin.add(new Domino("Pole", "Bagno*", 39));
        listaDomin.add(new Domino("Jaskinia*", "Pustynia", 40));
        listaDomin.add(new Domino("Pustynia", "Pole**", 41));
        listaDomin.add(new Domino("Woda", "Pole**", 42));
        listaDomin.add(new Domino("Pustynia", "Bagno**", 43));
        listaDomin.add(new Domino("Pole", "Bagno**", 44));
        listaDomin.add(new Domino("Jaskinia**", "Pustynia", 45));
        listaDomin.add(new Domino("Bagno", "Jaskinia**", 46));
        listaDomin.add(new Domino("Bagno", "Jaskinia**", 47));
        listaDomin.add(new Domino("Pustynia", "Jaskinia***", 48));
    }
    public Domino getDomino(int number) {
        return listaDomin.stream()
                .filter(domino -> domino.getNumber() == number)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("There is no car with that registration number!"));
    }
}
