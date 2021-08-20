package grades;

public class BestGradesPrinting {

    GradeBestBoyAndGirl gradeBestBoyAndGirl = new GradeBestBoyAndGirl();
    Boy boy;
    Girl girl;

    public BestGradesPrinting(){
        boy = gradeBestBoyAndGirl.getBestGradeBoys();
        girl = gradeBestBoyAndGirl.getBestGradeGirls();
    }

    public void printingBoy(){
        System.out.println(boy.getName() + " " + boy.getGrade());
    }

    public void printingGirl(){
        System.out.println(girl.getName() + " " + girl.getGrade());
    }
}
