import arc.*;

public class VideoGames{
	public static void main(String[] args){
		Console con = new Console();
		String strWords[][];
		strWords = new String[10][2];
		int intRand;
		strWords[0][0] = "Diablo";
		intRand = (int)(Math.random()*100+1);
		strWords[0][1] = intRand + ""; 
		strWords[1][0] = "Elden Ring";
		intRand = (int)(Math.random()*100+1);
		strWords[1][1] = intRand + "";
		strWords[2][0] = "Roblox";
		intRand = (int)(Math.random()*100+1);
		strWords[2][1] = intRand + ""; 
		strWords[3][0] = "Fortnite";
		intRand = (int)(Math.random()*100+1);
		strWords[3][1] = intRand + ""; 
		strWords[4][0] = "Brawl Stars";
		intRand = (int)(Math.random()*100+1);
		strWords[4][1] = intRand + ""; 
		strWords[5][0] = "Fifa";
		intRand = (int)(Math.random()*100+1);
		strWords[5][1] = intRand + ""; 
		strWords[6][0] = "Terraria";
		intRand = (int)(Math.random()*100+1);
		strWords[6][1] = intRand + "";
		strWords[7][0] = "Pokemon Go";
		intRand = (int)(Math.random()*100+1);
		strWords[7][1] = intRand + ""; 
		strWords[8][0] = "Dream League Soccer";
		intRand = (int)(Math.random()*100+1);
		strWords[8][1] = intRand + ""; 
		strWords[9][0] = "Minecraft";
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
	}
}
