package grades;

public class BestGradesPrinter {

    private BestGradeCalculator bestGradeCalculator;
    
    public BestGradesPrinter(){
         bestGradeCalculator = new BestGradeCalculator();
    }

    public void printingBoy(){
        Boy boy = bestGradeCalculator.getBestGradeBoys();
        System.out.println(boy.getName() + " " + boy.getGrade());
    }

    public void printingGirl(){
        Girl girl = bestGradeCalculator.getBestGradeGirls();
        System.out.println(girl.getName() + " " + girl.getGrade());
    }
}
