package grades;

public class BestGradesPrinter {

    BestGradeCalculator bestGradeCalculator = new BestGradeCalculator();
    private Boy boy;
    private Girl girl;

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
