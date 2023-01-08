import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JComponent implements ActionListener {
    int x = 0;
    int y = 0;
    int w = 200;
    int h = 200;
    static int winW = 510;
    static int winH = 530;
    Image horse = new ImageIcon("src/horse.png").getImage();
    Timer timer = new Timer(10, this);


    public static void main(String[] args) {
        Main t = new Main();
        JFrame frame = new JFrame("Движение картинки по квадрату");
        frame.setSize(winW, winH);
        frame.setLocation(434, 134);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.add(t);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(horse, x,y, w,h,null);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (x<300 && y ==0)
            x++;
        else if (x>=300 && y <300)
            y++;
        else if (x!=0 && y >=300)
            x--;
        else if (x==0 && y !=0)
            y--;
        repaint();
    }
}