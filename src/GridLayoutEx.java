import javax.swing.*;
import java.awt.*;
public class GridLayoutEx extends JFrame{
    public GridLayoutEx(){
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(1,10));

        for(int i=0; i<10; i++){
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            contentPane.add(button);
        }
        JButton button = new JButton("*");
        contentPane.add(button);
        JButton button1 = new JButton("*");
        contentPane.add(button);
    }
}
