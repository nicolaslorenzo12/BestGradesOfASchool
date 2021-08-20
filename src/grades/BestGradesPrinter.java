package grades;

public class BestGradesPrinter {

    BestGradeCalculator bestGradeCalculator = new BestGradeCalculator();

    public void printingBestBoyAndGirl(){
        Boy boy;
        boy = bestGradeCalculator.getBestGradeBoys();
        System.out.println(boy.getName() + " " + boy.getGrade());

        Girl girl;
        girl = bestGradeCalculator.getBestGradeGirls();
        System.out.println(girl.getName() + " " + girl.getGrade());
    }

}
