import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame {
    public void init() {
        setTitle("welcome");
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame mobileFrame = new MainFrame();
        mobileFrame.init();
    }
}