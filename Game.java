import arc.*;
import java.awt.Color;

public class Game {

    static String[] lbPlayers = new String[10];
    static String[] lbThemes = new String[10];
    static int[] lbScores = new int[10]; 
    static int lbCount = 0;

    static void addLeaderboard(String player, String theme, int score) {
        if (lbCount < 10) {
            lbPlayers[lbCount] = player;
            lbThemes[lbCount] = theme;
            lbScores[lbCount] = score;
            lbCount++;
        } else {
            int minIndex = 0;
            for (int i = 1; i < lbCount; i++) {
                if (lbScores[i] < lbScores[minIndex]) minIndex = i;
            }
            if (score > lbScores[minIndex]) {
                lbPlayers[minIndex] = player;
                lbThemes[minIndex] = theme;
                lbScores[minIndex] = score;
            }
        }
    }

    public static void main(String[] args) {
        Console con = new Console("Fun!", 1280, 720);

        while (true) {
            con.setDrawColor(Color.BLACK);
            con.fillRect(0, 0, 1280, 720);

            con.setDrawColor(new Color(200, 30, 30));
            con.drawString("Main Menu", 580, 90);
            con.drawString("(P) Play Game", 100, 160);
            con.drawString("(V) View Leaderboard", 100, 210);
            con.drawString("(A) Add Theme", 100, 260);
            con.drawString("(H) Help", 100, 310);
            con.drawString("(Q) Quit", 100, 360);

            con.setDrawColor(Color.WHITE);
            con.println("\nEnter your choice:");
            String strAnswer = con.readLine().trim();
            if (strAnswer.length() == 0) continue;
            String strInitial = strAnswer.substring(0, 1);
			//secret thing in main menu
            if (strAnswer.equals("69")) {
                con.clear();
                con.setDrawColor(Color.MAGENTA);
                con.fillRect(0, 0, 1280, 720);
                con.setDrawColor(Color.WHITE);
                con.drawString("Secret Menu Activated!", 500, 200);
                con.drawString("Please give me 100 percent for this assignment", 350, 300);

                Color[] rainbow = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, new Color(75,0,130), new Color(143,0,255)};
                int flagHeight = 420;
                int stripeHeight = flagHeight / rainbow.length;
                int flagX = 540, flagY = 340, flagWidth = 200;
                for (int i=0; i<rainbow.length; i++) {
                    con.setDrawColor(rainbow[i]);
                    con.fillRect(flagX, flagY + i*stripeHeight, flagWidth, stripeHeight);
                }

                con.println("\nPress Enter to return to main menu.");
                con.readLine();
                con.clear();
                continue;
            }
			//closing game
            if (strInitial.equalsIgnoreCase("Q")) {
                con.clear();
                con.println("Thanks for playing!");
                break;
            }
			//Main menu
            if (strInitial.equalsIgnoreCase("H")) {
                con.clear();
                con.setDrawColor(Color.BLACK);
                con.fillRect(0,0,1280,720);
                con.setDrawColor(Color.WHITE);
                con.drawString("Help Menu", 600, 100);
                con.drawString("Play the word guessing game.", 400, 160);
                con.drawString("View the leaderboard of top players.", 400, 210);
                con.drawString("Add a new theme.", 400, 260);
                con.drawString("Quit the game.", 400, 310);
                con.drawString("Game Instructions:", 400, 370);
                con.drawString("Guess letters in the word. You have limited tries.", 400, 410);
                con.drawString("Correct letters will be revealed in the word.", 400, 450);
                con.drawString("Special Cheat: If you enter your name as \"statitan\",", 400, 490);
                con.drawString("you get extra tries!", 400, 530);
                con.println("\nPress Enter to return to main menu.");
                con.readLine();
                con.clear();
                continue;
            }
				//if you type play game
            if (strInitial.equalsIgnoreCase("P")) {
                con.clear();
                con.println("What is your name?");
                String strName = con.readLine();

                con.println("Here are available themes:");
                con.println("Food.txt");
                con.println("VideoGames.txt");
                con.println("Teachers.txt");
                con.println("Which one do you wanna play?");
                String strTheme = con.readLine();
                String strInitialTheme = strTheme.length() > 0 ? strTheme.substring(0,1).toUpperCase() : "";

                String[][] strWords = new String[10][2];
                int intRand;
				//3 themes: food, video games, teachers
                if (strInitialTheme.equals("F")) {
                    strWords[0][0] = "Kimchi";
                    strWords[1][0] = "Burger";
                    strWords[2][0] = "Pizza";
                    strWords[3][0] = "Fries";
                    strWords[4][0] = "Cheese";
                    strWords[5][0] = "Tofu";
                    strWords[6][0] = "Curry";
                    strWords[7][0] = "Rice";
                    strWords[8][0] = "Noodle";
                    strWords[9][0] = "Chicken";
                } else if (strInitialTheme.equals("V")) {
                    strWords[0][0] = "Minecraft";
                    strWords[1][0] = "Fortnite";
                    strWords[2][0] = "Zelda";
                    strWords[3][0] = "Mario";
                    strWords[4][0] = "Overwatch";
                    strWords[5][0] = "Roblox";
                    strWords[6][0] = "Valorant";
                    strWords[7][0] = "Halo";
                    strWords[8][0] = "Pokemon";
                    strWords[9][0] = "Tetris";
                } else if (strInitialTheme.equals("T")) {
                    strWords[0][0] = "Statitan";
                    strWords[1][0] = "MrLee";
                    strWords[2][0] = "MsSmith";
                    strWords[3][0] = "Coach";
                    strWords[4][0] = "Principal";
                    strWords[5][0] = "Janitor";
                    strWords[6][0] = "Secretary";
                    strWords[7][0] = "Tutor";
                    strWords[8][0] = "Counselor";
                    strWords[9][0] = "Professor";
                } else {
                    con.println("Invalid theme. Returning to menu.");
                    continue;
                }

                for (int i = 0; i < 10; i++) {
                    intRand = (int)(Math.random()*100+1);
                    strWords[i][1] = intRand + "";
                }
				//bubble sort
                for(int i = 0; i < 9; i++) {
                    for(int j = 0; j < 9 - i - 1; j++) {
                        if(Integer.parseInt(strWords[j][1]) > Integer.parseInt(strWords[j+1][1])) {
                            String tempWord = strWords[j][0];
                            String tempRand = strWords[j][1];
                            strWords[j][0] = strWords[j+1][0];
                            strWords[j][1] = strWords[j+1][1];
                            strWords[j+1][0] = tempWord;
                            strWords[j+1][1] = tempRand;
                        }
                    }
                }

                int intWordIndex = 0;

                while (intWordIndex < strWords.length) {
                    String strTheWord = strWords[intWordIndex][0];
                    int intTries = strTheWord.length();

                    if (strName.equalsIgnoreCase("statitan")) {
                        intTries += 5;
                    }

                    String strProgress = "-".repeat(strTheWord.length());

                    con.clear();
                    con.println("You have " + intTries + " tries to guess the word!");

                    while (intTries > 0 && !strProgress.equalsIgnoreCase(strTheWord)) {
                        con.println("Guess the word (tries left: " + intTries + ")");
                        con.println("Current: " + strProgress);
                        String strTry = con.readLine();

                        String strNewProgress = "";
                        for (int i = 0; i < strTheWord.length(); i++) {
                            if (i < strTry.length() && strTry.substring(i, i+1).equalsIgnoreCase(strTheWord.substring(i, i+1))) {
                                strNewProgress += strTheWord.substring(i, i+1);
                            } else {
                                strNewProgress += strProgress.substring(i, i+1);
                            }
                        }

                        strProgress = strNewProgress;
                        con.println("Your guess result: " + strProgress);

                        if (strProgress.equalsIgnoreCase(strTheWord)) {
                            con.println("You guessed it! The word was: " + strTheWord);
                            addLeaderboard(strName, strTheme, strTheWord.length());
                            break;
                        }

                        intTries--;
                        if (intTries <= 0) {
                            con.println("Out of tries! The word was: " + strTheWord);
                        }
                    }

                    con.println("Do you want to play another word? (y/n)");
                    String strPlayAgain = con.readLine();
                    con.clear();
                    if (!strPlayAgain.equalsIgnoreCase("y")) {
                        break;
                    }
                    intWordIndex++;
                }
            }
            //leaderboard
            else if (strInitial.equalsIgnoreCase("V")) {
                con.clear();
                con.println("=== Leaderboard ===");
                if (lbCount == 0) {
                    con.println("No scores yet.");
                } else {
                    for (int i = 0; i < lbCount; i++) {
                        con.println((i + 1) + ". " + lbPlayers[i] + " - " + lbThemes[i] + " - Score: " + lbScores[i]);
                    }
                }
                con.println("Press Enter to return to main menu.");
                con.readLine();
                con.clear();
            }
            //adding theme
            else if (strInitial.equalsIgnoreCase("A")) {
                con.clear();
                con.println("Add a new theme!");
                con.println("Enter theme name:");
                String newTheme = con.readLine().trim();
                String filename = newTheme + ".txt";

                con.println("Press Enter to return to main menu.");
                con.readLine();
                con.clear();
            }
        }
    }
}



