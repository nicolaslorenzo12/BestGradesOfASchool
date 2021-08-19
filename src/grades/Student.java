package grades;

public class Student {
    private String name;
    private double academicPoints;
    private double behavioralPoints;

    public Student(String name, double academicPoints, double behavioralPoints){
        this.name = name;
        this.academicPoints = academicPoints;
        this.behavioralPoints = behavioralPoints;
    }

    public String getName(){
        return name;
    }

    public double getAcademicPoints(){
        double academicPercentage = 0.8;
        double finalAcademicPoints;
        finalAcademicPoints = academicPoints * academicPercentage;
        return finalAcademicPoints;
    }

    public double getBehavioralPoints(){
        double behavioralPercentage = 0.2;
        double finalBehavioralPoints;
        finalBehavioralPoints = behavioralPoints * behavioralPercentage;
        return finalBehavioralPoints;
    }

    public double getGrade(){
        double finalGrade;
        finalGrade = getAcademicPoints() + getBehavioralPoints();
        return finalGrade;
    }
}
