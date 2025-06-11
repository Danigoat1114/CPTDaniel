import arc.*;
import java.awt.Color;

public class CPTtools{
    public static void main(String[] args) {
        Console con = new Console("Fun!", 700,700);
        double dblX = 400;
        double dblY = 400;
        double dblZ = -1;
        String strAnswer;
        String strName;
        String strInitial;
        String strtheme;
        String strInitial2;
        int intLength;
        String strGuessWord;

        if(dblX > 0){
            con.setDrawColor(new Color(200, 30, 30));
            con.drawString("Main Menu", 300,200);
            con.setDrawColor(new Color(200, 30, 30));
            con.drawString("Play Game", 150,250);
            con.setDrawColor(new Color(200, 30, 30));
            con.drawString("Leaderboard", 150,300);
            con.setDrawColor(new Color(200, 30, 30));
            con.drawString("Add theme", 150,350);
            con.setDrawColor(new Color(200, 30, 30));
            con.drawString("Quit", 150,400);
            strAnswer = con.readLine();
            strInitial = strAnswer.substring(0,1);

            con.repaint();
            con.sleep(33);
           }
      }
   }
