import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Font;

public class Game{
	public static void main(String[] args){
		Console con = new Console("Fun!", 700,700);
		double dblX = 400;
		double dblY = 400;
		double dblZ = -1;
		String strAnswer;
		String strName;
		String strInitial;
		String strtheme;
		String strInitial2;
		String strWords[][];
		

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
			
			
			if(strInitial.equals("P")){
			con.setDrawColor(Color.BLACK);
			con.fillRect(0,0,700,700);
			con.println("What is your name?");
			strName = con.readLine();
			con.println("Here are available themes");
			con.println("\n\nVideoGames.txt");
			con.println("\n\nFood.txt");
			con.println("Which one do you wanna play?");
			strtheme = con.readLine();
			strInitial2 = strtheme.substring(0,1);
			}else if(strInitial.equals("p")){
			con.setDrawColor(Color.BLACK);
			con.fillRect(0,0,700,700);
			con.println("What is your name?");
			strName = con.readLine();
			con.println("Here are available themes");
			con.println("\n\nVideoGames.txt");
			con.println("\n\nFood.txt");
			con.println("Which one do you wanna play?");
			strtheme = con.readLine();
			strInitial2 = strtheme.substring(0,1);

			if(strInitial2.equals("F")){
			strWords = new String[10][2];
		int intRand;
		
		strWords[0][0] = "Kimchi";
		intRand = (int)(Math.random()*100+1);
		strWords[0][1] = intRand + ""; 
		strWords[1][0] = "Burger";
		intRand = (int)(Math.random()*100+1);
		strWords[1][1] = intRand + "";
		strWords[2][0] = "Pizza";
		intRand = (int)(Math.random()*100+1);
		strWords[2][1] = intRand + ""; 
		strWords[3][0] = "Fries";
		intRand = (int)(Math.random()*100+1);
		strWords[3][1] = intRand + ""; 
		strWords[4][0] = "Cheese";
		intRand = (int)(Math.random()*100+1);
		strWords[4][1] = intRand + ""; 
		strWords[5][0] = "Tofu";
		intRand = (int)(Math.random()*100+1);
		strWords[5][1] = intRand + ""; 
		strWords[6][0] = "Curry";
		intRand = (int)(Math.random()*100+1);
		strWords[6][1] = intRand + "";
		strWords[7][0] = "Rice";
		intRand = (int)(Math.random()*100+1);
		strWords[7][1] = intRand + ""; 
		strWords[8][0] = "Noodle";
		intRand = (int)(Math.random()*100+1);
		strWords[8][1] = intRand + ""; 
		strWords[9][0] = "Chicken";
		intRand = (int)(Math.random()*100+1);
		strWords[9][1] = intRand + ""; 
		
		int intCount;
		

		int intCount2;
		String strNameTemp;
		String strCriticsTemp;

		
				for(intCount2 = 0; intCount2 < 9-1; intCount2++){
		for(intCount =0; intCount < 9-1; intCount++){
			if(Integer.parseInt(strWords[intCount][1]) > Integer.parseInt(strWords[intCount+1][1])){
				strNameTemp = strWords[intCount][0];
				strWords[intCount][0] = strWords[intCount+1][0];
				strWords[intCount+1][0] = strNameTemp;
				strCriticsTemp = strWords[intCount][1];
				strWords[intCount][1] = strWords[intCount+1][1];
				strWords[intCount+1][1] = strCriticsTemp;
				

			}
		}
	}
	
		for(intCount = 0; intCount < 9; intCount++){
		con.println(strWords[intCount][0] + " - " + strWords[intCount][1] );
		}
		con.println(strWords[0][0]);
	

			
			
		}
		}
	}
	}
}
