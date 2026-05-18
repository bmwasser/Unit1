import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class CurrencyPanel extends JPanel{
    static final long serialVersionUID = 1;
    double userInput;

  
  public CurrencyPanel(){
    setPreferredSize(new Dimension(400,400));
    setBackground(Color.WHITE);
    Scanner in = new Scanner(System.in);
    System.out.print("Type any amount of money in USD: $");
    userInput = in.nextDouble();

    in.close();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g); 

    String input = String.format("%s %.2f","$",userInput);
   
    final double EURO_PER_USD = 0.84;
    double euro = userInput * EURO_PER_USD;
    String euroOutput = String.format("%s %.2f\n","Euro Exchange Rate: €",euro);
    
    final double GBP_PER_USD = 0.78;
    double GBP = userInput * GBP_PER_USD;
    String GBPOutput = String.format("%s %.2f","Great British Pound Exchange Rate: £",GBP);
    
    double knuts = 100 * userInput;
    double galleon = (int)knuts / 493;
    double leftoverGalleon = (int)knuts % 493;
    double sickle = (int)leftoverGalleon / 29;
    double leftoverSickle = (int)leftoverGalleon % 29;
    double hpmknuts = leftoverSickle;
    String hpmMoney = String.format("%s %.0fg %.0fs %.0fk","Harry Potter Money Exchange Rate: ",galleon,sickle,hpmknuts);
   
    g.setColor(Color.GRAY);
    g.fillRect(215,5,213,35);
    g.fillRect(190,200,260,125);
    g.setColor(Color.YELLOW);
    g.fillRoundRect(275,75,100,100,200,200);
    g.setColor(Color.BLACK);
    g.drawString("Braeden's Amazing Currency Converter",217,20);
    g.drawString(input,303,130);
    g.drawString(euroOutput,235,220);
    g.drawString(GBPOutput,200,260);
    g.drawString(hpmMoney,195,300);
    g.drawArc(225,0,125,90,180,90);
    g.drawArc(305,160,125,90,5,90);
    
  

  }
}


