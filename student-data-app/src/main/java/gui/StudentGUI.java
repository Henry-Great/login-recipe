import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGUI {
    private JFrame frame;
    private JTextField nameField;
    private JTextField ageField;
    private JTextArea displayArea;

    public StudentGUI() {
        frame = new JFrame("Student Data Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        inputPanel.add(ageField);

        JButton addButton = new JButton("Add Student");
        inputPanel.add(addButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        frame.setVisible(true);
    }

    private void addStudent() {
        String name = nameField.getText();
        String age = ageField.getText();
        if (!name.isEmpty() && !age.isEmpty()) {
            displayArea.append("Student Name: " + name + ", Age: " + age + "\n");
            nameField.setText("");
            ageField.setText("");
        } else {
            JOptionPane.showMessageDialog(frame, "Please enter both name and age.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentGUI());
    }
}