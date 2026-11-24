import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class School {
    private ArrayList<School> students = new ArrayList<>();
    private final List<JLabel> labels = new ArrayList<>();
    private final List<JPanel> panels = new ArrayList<>();


    public School() {
        students.add("10021", "Amira Shah", "UG");
        students.add("10022", "Ben Carter", "MSc");
        students.add("10023", "Chloe Evans", "MSc");
        students.add("10024", "Daniel Wu", "UG");
    }

    public JPanel buildGrid() {
        JPanel grid = new JPanel(new GridLayout(4, 8));
        for (School s : students) {
            JLabel label = new JLabel("", SwingConstants.CENTER);
            JPanel panel = new JPanel(new BorderLayout());
            panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            panel.add(label, BorderLayout.CENTER);
            labels.add(label);
            panels.add(panel);
            grid.add(panel);
        }
        return grid;

        if(diffPerf()){
            panel.setbackground(Color.RED);
        }
    }

    public void printReport(String cid) {
        System.out.println("====== Report ======");
        for (School s : students) {
            System.out.println(s.describe(cid));
        }
    }
}
