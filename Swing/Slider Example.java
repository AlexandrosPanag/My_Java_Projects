import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame {

    JSlider horizontalSlider;
    JLabel horizontalLabel;
    

    public Slider(String title) {
        super(title);
        setSize(150, 150);
        horizontalSlider = new JSlider(JSlider.HORIZONTAL);
        add(horizontalSlider);
        horizontalLabel = new JLabel("Horizontal: " + horizontalSlider.getValue());

        add(horizontalLabel);
        horizontalSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                moveslider();
            }
        });

        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void moveslider() {
        horizontalLabel.setText("Value: " +  horizontalSlider.getValue());
        this.setSize(500 + horizontalSlider.getValue(), 500 + horizontalSlider.getValue());
    }

    public static void main(String[] args) {
        Slider f = new Slider("Slider");
    }
}