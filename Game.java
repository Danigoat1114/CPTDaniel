import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Font;

public class Game{
	public static void main(String[] args){
		Console con = new Console("Fun!", 700,700);
		double dblX = 400;
		double dblY = 400;
		double dblZ = 401;
		String strAnswer;
		String strName;
		String strInitial;

		while(dblX > 0){
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
			
			if(strInitial.equals("P")){
			dblX = dblX - dblZ;
			con.println("What is your name?");
			strName = con.readLine();
			con.println("Here are available themes");
			con.println("\n\nVideoGames.txt");
			con.println("Food.txt");
			}else if(strInitial.equals("p")){
			dblX = dblZ;
			con.println("What is your name?");
			strName = con.readLine();
			con.println("Here are available themes");
			con.println("\n\nVideoGames.txt");
			con.println("Food.txt");

			
			
		}
		}
	}
}
