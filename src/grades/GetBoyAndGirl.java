package grades;
import java.util.ArrayList;

public class GetBoyAndGirl {
    StudentService studentSecretary = new StudentService();
    ArrayList<Boy> boys = new ArrayList();
    ArrayList<Girl> girls = new ArrayList();

    public GetBoyAndGirl(){
        boys = studentSecretary.getBoys();
        girls = studentSecretary.getGirls();
    }

    public Boy getBestGradeBoys(){

        double bestGrade = boys.get(0).getGrade();

        for(int b = 1; b < boys.size(); b++){

            if(boys.get(b).getGrade() > bestGrade){
                bestGrade = boys.get(b).getGrade();
                boys.add(0,boys.get(b));
            }
        }
        return boys.get(0);
    }

    public Girl getBestGradeGirls(){

        double bestGrade = girls.get(0).getGrade();

        for(int g = 1; g < girls.size(); g++){

            if(girls.get(g).getGrade() > bestGrade){
                bestGrade = girls.get(g).getGrade();
                girls.add(0,girls.get(g));
            }
        }
        return girls.get(0);
    }
}
