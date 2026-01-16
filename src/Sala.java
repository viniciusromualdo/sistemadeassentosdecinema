import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int id;
    private List<Assento> assentos = new ArrayList<>();

    public Sala(int id){
        this.id = id;
     for (int i = 1; i <= 50; i++){
         Assento assento = new Assento(i);
         assentos.add(assento);
     }
    }
}
