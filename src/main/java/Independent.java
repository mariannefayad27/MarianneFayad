public class Independent extends Assessments {
    private double newResults;
    private double maxMark=100.0;

    public Independent(double results, String studentName, double newResults) {
        super(results, studentName);
        this.newResults=newResults;
    }

    @Override
    public double recordResults(String cid, String studentName, String explanation){
        return newResults=AssessmentFeed.getResult(cid, studentName, explanation);
    }

    @Override
    public double calcMark(String cid, String studentName, String functionality){
        if (newResults!=1.0)
            if (recordResults(cid, studentName, functionality)>40) {
                return maxMark= 40.0;
            }
        else {
            return AssessmentFeed.getResult(cid, studentName, functionality);
            }
    }

    @Override
    public String getExamName(){
        return "Independent";
    }
}
