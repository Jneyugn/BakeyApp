import javax.swing.JFrame;

public class BakeryOrderGUI extends JFrame {
    
    public BakeryOrderGUI() {
        setTitle("Bakery Order System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window
        
        // add components here
        initializeComponents();
        
        setVisible(true);
    }
    
    private void initializeComponents() {
    }
}