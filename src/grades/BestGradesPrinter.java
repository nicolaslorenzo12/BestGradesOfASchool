package grades;

public class BestGradesPrinter {

    BestGradeCalculator bestGradeCalculator = new BestGradeCalculator();
    private Boy boy;
    private Girl girl;
    
    public void printingBoy(){
        boy = bestGradeCalculator.getBestGradeBoys();
        System.out.println(boy.getName() + " " + boy.getGrade());
    }

    public void printingGirl(){
        girl = bestGradeCalculator.getBestGradeGirls();
        System.out.println(girl.getName() + " " + girl.getGrade());
    }
}
