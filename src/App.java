import java.awt.*;
import javax.swing.*;

public class App {

    private static int currentIndex = 0;

    public static void main(String[] args) throws Exception {
        String[] top5 = {
            "1. Sleep",
            "2. Eat",
            "3. Workout",
            "4. Run",
            "5. Sleep"
        };

        JFrame frame = new JFrame("My Top 5 List");
        frame.setSize(500, 500);
        frame.setLayout(null);

        JButton nextButton = new JButton("Next");
        JButton backButton = new JButton("Back"); // Create the Back button
        JLabel outputLabel = new JLabel();

        nextButton.setBounds(100, 200, 100, 50);
        backButton.setBounds(250, 200, 100, 50); // Position the Back button
        outputLabel.setBounds(100, 100, 300, 50);
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 32));
        outputLabel.setForeground(Color.BLUE);

        outputLabel.setText(top5[currentIndex]);

        frame.add(outputLabel);
        frame.add(nextButton);
        frame.add(backButton); // Add the Back button to the frame

        nextButton.addActionListener(e -> {
            currentIndex = getNextIndex(currentIndex, top5.length);
            outputLabel.setText(top5[currentIndex]);
        });

        backButton.addActionListener(e -> { // Add event listener for Back button
            currentIndex = getPreviousIndex(currentIndex, top5.length);
            outputLabel.setText(top5[currentIndex]);
        });

        frame.setVisible(true);
    }

    public static int getNextIndex(int currentIndex, int listLength) {
        if (currentIndex == listLength - 1) {
            return 0; // Wrap around to the start
        } else {
            return currentIndex + 1; // Move to the next index
        }
    }

    public static int getPreviousIndex(int currentIndex, int listLength) {
        if (currentIndex == 0) {
            return listLength - 1; // Wrap around to the end
        } else {
            return currentIndex - 1; // Move to the previous index
        }
    }
}
