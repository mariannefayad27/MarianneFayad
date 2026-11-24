import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        AssessmentFeed assessment= new AssessmentFeed();
        School school= new School(assessment);

        JFrame frame = new JFrame("University");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(school.buildGrid());
        frame.setSize(900, 400);
        frame.setVisible(true);
    }
}
