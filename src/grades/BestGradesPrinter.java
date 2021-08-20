package grades;

public class BestGradesPrinter {

    BestGradeCalculator bestGradeCalculator = new BestGradeCalculator();
    Boy boy;
    Girl girl;

    public BestGradesPrinter(){
        boy = bestGradeCalculator.getBestGradeBoys();
        girl = bestGradeCalculator.getBestGradeGirls();
    }

    public void printingBoy(){
        System.out.println(boy.getName() + " " + boy.getGrade());
    }

    public void printingGirl(){
        System.out.println(girl.getName() + " " + girl.getGrade());
    }
}
