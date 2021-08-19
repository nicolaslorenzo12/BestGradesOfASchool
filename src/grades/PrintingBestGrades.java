package grades;
import java.util.ArrayList;

public class PrintingBestGrades {

    GetBoyAndGirl gradesDirector = new GetBoyAndGirl();
    Boy boy;
    Girl girl;

    public PrintingBestGrades(){
        boy = gradesDirector.getBestGradeBoys();
        girl = gradesDirector.getBestGradeGirls();
    }

    public void printingBoy(){
        System.out.println(boy.getName() + " " + boy.getGrade());
    }

    public void printingGirl(){
        System.out.println(girl.getName() + " " + girl.getGrade());
    }
}
