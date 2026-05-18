import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel{
  static final long serialVersionUID = 1;

  public MyPanel(){
    setPreferredSize(new Dimension(250,200));
    setBackground(Color.WHITE);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.drawRect(80,20,100,20);
    g.drawString("Hello World!",100,35);
    g.setColor(Color.YELLOW);
    g.fillOval(75,75,100,100);
    g.setColor(Color.WHITE);
    g.fillOval(100,100,25,25);
    g.fillOval(130,100,25,25);
    g.setColor(Color.BLACK);
    g.drawArc(75,50,100,100,-100,50);
    g.drawArc(115,95,50,50,50,50);
    g.drawArc(90,95,50,50,-270,50);
    g.setColor(Color.BLACK);
    g.fillOval(110,110,10,10);
    g.fillOval(135,110,10,10);
    g.setColor(Color.GRAY);
    g.fillOval(175,75,75,50);
    g.setColor(Color.BLACK);
    g.drawString("Ok Bud",190,100);
    g.fillRect(100,175,50,25);
  }
}
