import java.util.List;

public class Assessments {
    private double results;
    private String studentName;
    private String studentType;

    public Assessments(double results, String studentName){
        this.results=results;
        this.studentName=studentName;
    }
    public abstract double calcMark();
    public abstract double calcMarkAI();
    public abstract double calcMarkSDV();
    public abstract String getExamName();

    public List<String> getCid(){
        return AssessmentFeed.getCIDs();
    }

    public boolean diffPerf(){
        return calcMark()-calcMarkAI()>=20;
    }

    public String getStudentType(String cid){
        return studentType= AssessmentFeed.getStudentType(cid);
    }

    public String getStudentName(String cid) {
        return studentName = AssessmentFeed.getStudentName(cid);
    }

    public double recordResults(String cid, String studentName, String explanation){
        return AssessmentFeed.getResult(cid, studentName, explanation);
    }

    public double overallMark(){
        if (studentType.equals("UG")){
            return calcMark()*0.3 + calcMarkAI()*0.7;
        }
        else{
            return calcMark()*0.25 + calcMarkAI()*0.45 + calcMarkSDV()*0.3;
        }
    }

    public String describe(String cid) {
        return getStudentName(cid) + " : " + getCid() + " (" + getStudentType(cid) + ") "
                + getExamName() + ": " + calcMark() + ". Overall: " + overallMark() +
                " " + (diffPerf() ? "AI condition met": "AI condition not met");
    }
}
