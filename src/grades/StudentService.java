package grades;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Boy> boys = new ArrayList();
    private ArrayList<Girl> girls = new ArrayList();

    Boy antonio = new Boy("Antonio", 3, 4);
    Boy miguel = new Boy("Miguel", 10, 0);
    Boy angel = new Boy("Angel", 2, 10);
    Boy carlos = new Boy("Carlos", 9, 9);
    Boy julian = new Boy("Julian", 5,4);
    Boy sergio = new Boy("Sergio",10,9);

    Girl alejandra = new Girl("Alejandra", 10,9);
    Girl ana = new Girl("Ana", 0,10);
    Girl maria = new Girl("Maria", 8, 10);
    Girl gabriela = new Girl("Gabriela", 10, 10);
    Girl valeria = new Girl("Valeria", 5,6);
    Girl carol = new Girl("Carol", 4,10);
    Girl blanca = new Girl("Blanca", 3,2);

    public StudentService(){
        boys.add(antonio);
        boys.add(miguel);
        boys.add(angel);
        boys.add(carlos);
        boys.add(julian);
        boys.add(sergio);

        girls.add(alejandra);
        girls.add(ana);
        girls.add(maria);
        girls.add(gabriela);
        girls.add(valeria);
        girls.add(carol);
        girls.add(blanca);
    }

    public ArrayList<Boy> getBoys(){
        return boys;
    }

    public ArrayList<Girl> getGirls(){
        return girls;
    }
}
