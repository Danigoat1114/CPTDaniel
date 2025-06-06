import arc.*;

public class food{
	public static void main(String[] args){
		Console con = new Console();
		String strWords[][];
		strWords = new String[10][2];
		int intRand;
		TextInputFile todo = new TextInputFile("food.txt");
		strWords = foods.readLine;
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


	


		
	

