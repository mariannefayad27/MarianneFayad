public class AIassisted extends Assessments {
    private double newResults;
    private double functionality;

    public Independent(double results, String studentName, double newResults) {
        super(results, studentName);
        this.newResults=newResults;
    }

    @Override
    public double recordResults(String cid, String studentName, String verification){
        return newResults=AssessmentFeed.getResult(cid, studentName, verification);
    }

    @Override
    public double calcMark(String cid, String studentName, String verification){
        newResults= functionality*40 +
    }

    @Override
    public String getExamName(){
        return "AI assissted";
    }
}

