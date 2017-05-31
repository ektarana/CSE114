//Ekta Rana
//111030624
import java.util.Scanner;

public class ScrimishDriver {
	static Card[][] cpuCards = new Card[5][5];
	static Card[][] playerCards = new Card[5][5];
	static Scanner input = new Scanner(System.in);
	static int pile0count = 0, pile1count = 0, pile2count = 0, pile3count = 0, pile4count = 0;
	static int cpuPile0Count = 4, cpuPile1Count = 4, cpuPile2Count = 4, cpuPile3Count = 4, cpuPile4Count = 4;
	static boolean cpuHasCrown = true;
	static boolean playerHasCrown =true; 

	public static void main(String[] args){
	
	System.out.println("Let's play Scrimish!");
	System.out.println("Enter the cards you want in each pile in the order first as the bottom card and last as the top card.");
	System.out.println("To add a number card from 1-6, simply enter that number. The Archer is 7 and Shield is 8.");
	System.out.println(">>>>>>>>>>");
	popCompArray(cpuCards);
	//asks the user for their input
	chooseCards();
	pile0count=4;
	pile1count=4;
	pile2count=4;
	pile3count=4;
	pile4count=4;
	while(true) {
		printArray(playerCards);
		printArray(cpuCards);
		System.out.println(">>>>>>>>>>");
		playerTurn();
		if(!(cpuHasCrown)){
			System.out.println("Good job!");
			break; 
		}
		System.out.println(">>>cpu turn");
		compuTurn();
		if(!(playerHasCrown)){
			System.out.println("Bad job!");
			break; 
		}
	}
	}

	public static void chooseHelper(){
		//card counters
		int numOnes=5, numTwos=5; 
		int numThrees=3, numFours=3; 
		int numFives=2, numSixes=2, numArchers=2, numShields=2; 
		System.out.println("Enter the cards you want in pile 1: ");
		int choice=0; 
		
		while(pile0count<5){
			choice = input.nextInt(); 
				if (choice == 1){
					if(numOnes>0){
						playerCards[0][pile0count] = new Card(choice, "Dagger"); 
						numOnes--;
						pile0count++;
					}else
						System.out.print("Not enough daggers");
				}else if (choice == 2){
					if(numTwos>0){
						playerCards[0][pile0count] = new Card(choice, "Sword"); 
						numTwos--;
						pile0count++;
					}else
						System.out.print("Not enough swords");
				}else if (choice == 3){
					if(numThrees>0){
						playerCards[0][pile0count] = new Card(choice, "Morning Star"); 
						numThrees--;
						pile0count++;
					}else
						System.out.print("Not enough morning stars");
				}else if (choice == 4){
					if(numFours>0){
						playerCards[0][pile0count] = new Card(choice, "War Axe"); 
						numFours--;
						pile0count++;
					}else
						System.out.print("Not enough war axes");
				}else if (choice == 5){
					if(numFives>0){
						playerCards[0][pile0count] = new Card(choice, "Halberd"); 
						numFives--;
						pile0count++;
					}else
						System.out.print("Not enough halberds");
				}else if (choice == 6){
					if(numSixes>0){
						playerCards[0][pile0count] = new Card(choice, "Longswords"); 
						numSixes--;
						pile0count++;
					}else
						System.out.print("Not enough longswords");
				}else if (choice == 7){
					if(numArchers>0){
						playerCards[0][pile0count] = new Card(choice, "A"); 
						numArchers--;
						pile0count++;
					}else
						System.out.print("Not enough archers");
				}else if (choice == 8){
					if(numShields>0){
						playerCards[0][pile0count] = new Card(choice, "S"); 
						numShields--;
						pile0count++;
					}else
						System.out.print("Not enough shields");
				}else{
					System.out.println("Invalid input. try again. ");
				}
		}//closes the while loop for the pile 0 
	
		System.out.println("choose cards for pile 2");
		while(pile1count<5){
			choice = input.nextInt(); 
				if (choice == 1){
					if(numOnes>0){
						playerCards[1][pile1count] = new Card(choice, "Dagger"); 
						numOnes--;
						pile1count++;
					}else
						System.out.print("Not enough daggers");
				}else if (choice == 2){
					if(numTwos>0){
						playerCards[1][pile1count] = new Card(choice, "Sword"); 
						numTwos--;
						pile1count++;
					}else
						System.out.print("Not enough swords");
				}else if (choice == 3){
					if(numThrees>0){
						playerCards[1][pile1count] = new Card(choice, "Morning Star"); 
						numThrees--;
						pile1count++;
					}else
						System.out.print("Not enough morning stars");
				}else if (choice == 4){
					if(numFours>0){
						playerCards[1][pile1count] = new Card(choice, "War Axe"); 
						numFours--;
						pile1count++;
					}else
						System.out.print("Not enough war axes");
				}else if (choice == 5){
					if(numFives>0){
						playerCards[1][pile1count] = new Card(choice, "Halberd"); 
						numFives--;
						pile1count++;
					}else
						System.out.print("Not enough halberds");
				}else if (choice == 6){
					if(numSixes>0){
						playerCards[1][pile1count] = new Card(choice, "Longswords"); 
						numSixes--;
						pile1count++;
					}else
						System.out.print("Not enough longswords");
				}else if (choice == 7){
					if(numArchers>0){
						playerCards[1][pile1count] = new Card(choice, "A"); 
						numArchers--;
						pile1count++;
					}else
						System.out.print("Not enough archers");
				}else if (choice == 8){
					if(numShields>0){
						playerCards[1][pile1count] = new Card(choice, "S"); 
						numShields--;
						pile1count++;
					}else
						System.out.print("Not enough shields");
				}else{
					System.out.println("Invalid input. try again. ");
				}
		}//closes the while loop for the pile 1 (deck 2)
		
		System.out.println("choose cards for pile 3");
		while(pile2count<5){
			choice = input.nextInt(); 
				if (choice == 1){
					if(numOnes>0){
						playerCards[2][pile2count] = new Card(choice, "Dagger"); 
						numOnes--;
						pile2count++;
					}else
						System.out.print("Not enough daggers");
				}else if (choice == 2){
					if(numTwos>0){
						playerCards[2][pile2count] = new Card(choice, "Sword"); 
						numTwos--;
						pile2count++;
					}else
						System.out.print("Not enough swords");
				}else if (choice == 3){
					if(numThrees>0){
						playerCards[2][pile2count] = new Card(choice, "Morning Star"); 
						numThrees--;
						pile2count++;
					}else
						System.out.print("Not enough morning stars");
				}else if (choice == 4){
					if(numFours>0){
						playerCards[2][pile2count] = new Card(choice, "War Axe"); 
						numFours--;
						pile2count++;
					}else
						System.out.print("Not enough war axes");
				}else if (choice == 5){
					if(numFives>0){
						playerCards[2][pile2count] = new Card(choice, "Halberd"); 
						numFives--;
						pile2count++;
					}else
						System.out.print("Not enough halberds");
				}else if (choice == 6){
					if(numSixes>0){
						playerCards[2][pile2count] = new Card(choice, "Longswords"); 
						numSixes--;
						pile2count++;
					}else
						System.out.print("Not enough longswords");
				}else if (choice == 7){
					if(numArchers>0){
						playerCards[2][pile2count] = new Card(choice, "A"); 
						numArchers--;
						pile2count++;
					}else
						System.out.print("Not enough archers");
				}else if (choice == 8){
					if(numShields>0){
						playerCards[2][pile2count] = new Card(choice, "S"); 
						numShields--;
						pile2count++;
					}else
						System.out.print("Not enough shields");
				}else{
					System.out.println("Invalid input. try again. ");
				}
		}//closes while for pile 2 	(deck 3)

		System.out.println("choose cards for pile 4");
		while(pile3count<5){
			choice = input.nextInt(); 
				if (choice == 1){
					if(numOnes>0){
						playerCards[3][pile3count] = new Card(choice, "Dagger"); 
						numOnes--;
						pile3count++;
					}else
						System.out.print("Not enough daggers");
				}else if (choice == 2){
					if(numTwos>0){
						playerCards[3][pile3count] = new Card(choice, "Sword"); 
						numTwos--;
						pile3count++;
					}else
						System.out.print("Not enough swords");
				}else if (choice == 3){
					if(numThrees>0){
						playerCards[3][pile3count] = new Card(choice, "Morning Star"); 
						numThrees--;
						pile3count++;
					}else
						System.out.print("Not enough morning stars");
				}else if (choice == 4){
					if(numFours>0){
						playerCards[3][pile3count] = new Card(choice, "War Axe"); 
						numFours--;
						pile3count++;
					}else
						System.out.print("Not enough war axes");
				}else if (choice == 5){
					if(numFives>0){
						playerCards[3][pile3count] = new Card(choice, "Halberd"); 
						numFives--;
						pile3count++;
					}else
						System.out.print("Not enough halberds");
				}else if (choice == 6){
					if(numSixes>0){
						playerCards[3][pile3count] = new Card(choice, "Longswords"); 
						numSixes--;
						pile3count++;
					}else
						System.out.print("Not enough longswords");
				}else if (choice == 7){
					if(numArchers>0){
						playerCards[3][pile3count] = new Card(choice, "A"); 
						numArchers--;
						pile3count++;
					}else
						System.out.print("Not enough archers");
				}else if (choice == 8){
					if(numShields>0){
						playerCards[3][pile3count] = new Card(choice, "S"); 
						numShields--;
						pile3count++;
					}else
						System.out.print("Not enough shields");
				}else{
					System.out.println("Invalid input. try again. ");
				}
		}//closes while loop for pile 3	(deck 4)

		System.out.println("choose cards for pile 5");
		while(pile4count<5){
			choice = input.nextInt(); 
				if (choice == 1){
					if(numOnes>0){
						playerCards[4][pile4count] = new Card(choice, "Dagger"); 
						numOnes--;
						pile4count++;
					}else
						System.out.print("Not enough daggers");
				}else if (choice == 2){
					if(numTwos>0){
						playerCards[4][pile4count] = new Card(choice, "Sword"); 
						numTwos--;
						pile4count++;
					}else
						System.out.print("Not enough swords");
				}else if (choice == 3){
					if(numThrees>0){
						playerCards[4][pile4count] = new Card(choice, "Morning Star"); 
						numThrees--;
						pile4count++;
					}else
						System.out.print("Not enough morning stars");
				}else if (choice == 4){
					if(numFours>0){
						playerCards[4][pile4count] = new Card(choice, "War Axe"); 
						numFours--;
						pile4count++;
					}else
						System.out.print("Not enough war axes");
				}else if (choice == 5){
					if(numFives>0){
						playerCards[4][pile4count] = new Card(choice, "Halberd"); 
						numFives--;
						pile4count++;
					}else
						System.out.print("Not enough halberds");
				}else if (choice == 6){
					if(numSixes>0){
						playerCards[4][pile4count] = new Card(choice, "Longswords"); 
						numSixes--;
						pile4count++;
					}else
						System.out.print("Not enough longswords");
				}else if (choice == 7){
					if(numArchers>0){
						playerCards[4][pile4count] = new Card(choice, "A"); 
						numArchers--;
						pile4count++;
					}else
						System.out.print("Not enough archers");
				}else if (choice == 8){
					if(numShields>0){
						playerCards[4][pile4count] = new Card(choice, "S"); 
						numShields--;
						pile4count++;
					}else
						System.out.print("Not enough shields");
				}else{
					System.out.println("Invalid input. try again. ");
				}
		}//close the while loop for pile 4	 
	}
	
public static void chooseCards(){
		System.out.println("Choose a pile for your crown card (1-5): ");
		int crownPile = input.nextInt()-1;
		playerCards[crownPile][0] = new Card(9, "C");
		if (crownPile == 0)
			pile0count++;
		else if (crownPile == 1)
			pile1count++;
		else if (crownPile == 2)
			pile2count++;
		else if (crownPile == 3)
			pile3count++;
		else if (crownPile == 4)
			pile4count++;
		else
			System.out.println("no. wrong. bad human.");
		
		chooseHelper();
		
	}//closes chooseCards

public static void popCompArray(Card[][] a){
	a[0][0] = new Card(9, "C");
	a[0][1] = new Card(8, "S");
	a[0][2] = new Card(8, "S");
	a[0][3] = new Card(7, "A");
	a[0][4] = new Card(7, "A");
	
	a[1][0] = new Card(6, "Longsword");
	a[1][1] = new Card(6, "Longsword");
	a[1][2] = new Card(5, "Halberd");
	a[1][3] = new Card(5, "Halberd");	
	a[1][4] = new Card(4, "War Axe");
	
	a[2][0] = new Card(4, "War Axe");
	a[2][1] = new Card(4, "War Axe");	
	a[2][2] = new Card(3, "Morning Star");
	a[2][3] = new Card(3, "Morning Star");
	a[2][4] = new Card(3, "Morning Star");	
	
	a[3][0] = new Card(2, "Sword");
	a[3][1] = new Card(2, "Sword");	
	a[3][2] = new Card(2, "Sword");
	a[3][3] = new Card(2, "Sword");
	a[3][4] = new Card(2, "Sword");
	
	a[4][0] = new Card(1, "Dagger");
	a[4][1] = new Card(1, "Dagger");	
	a[4][2] = new Card(1, "Dagger");
	a[4][3] = new Card(1, "Dagger");
	a[4][4] = new Card(1, "Dagger");						
}

public static void printArray(Card a[][]) {
    for (int row = 0; row < a.length; row++) {
    	System.out.print("Deck " + (row+1) + ": ");
    	for (int column = 0; column < a[row].length; column++) {
    		if(a[row][column] == null)
            	System.out.print(" ");
    		else if(a[row][column].getCardValue()>6)
             	System.out.print(a[row][column].getCardName() + " ");
    		else
            	System.out.print(a[row][column].getCardValue() + " ");	
        }
        System.out.println();
    }
}

public static void playerTurn(){
	int deckChoice = 0;  
	int targetDeck; 
	int playerVal = 0; 
	int cpuVal = 0; 
	System.out.print("Choose a pile to attack with (1-5): ");
	deckChoice = input.nextInt()-1;
	
	if (deckChoice == 0){
		playerVal = playerCards[deckChoice][pile0count].getCardValue();
	}else if (deckChoice == 1){
		playerVal = playerCards[deckChoice][pile1count].getCardValue();
	}else if (deckChoice == 2){
		playerVal = playerCards[deckChoice][pile2count].getCardValue();
	}else if (deckChoice == 3){
		playerVal = playerCards[deckChoice][pile3count].getCardValue();
	}else if (deckChoice == 4){
		playerVal = playerCards[deckChoice][pile4count].getCardValue();
	}else {
		System.out.print("You did wrong.");
	}
//computer pile to attack 	
	System.out.print("Choose a pile to attack: ");
	targetDeck = input.nextInt()-1;
	
	if (targetDeck == 0){
		cpuVal = cpuCards[targetDeck][cpuPile0Count].getCardValue();
	}else if (targetDeck == 1){
		cpuVal = cpuCards[targetDeck][cpuPile1Count].getCardValue();
	}else if (targetDeck == 2){
		cpuVal = cpuCards[targetDeck][cpuPile2Count].getCardValue();
	}else if (targetDeck == 3){
		cpuVal = cpuCards[targetDeck][cpuPile3Count].getCardValue();
	}else if (targetDeck == 4){
		cpuVal = cpuCards[targetDeck][cpuPile4Count].getCardValue();
	}else {
		System.out.print("You did wrong.");
	}
	
	if (playerVal==8){
		System.out.println("You attacked with a shield, lose a turn.");
	}else if(playerVal==7 && cpuVal == 8){
		System.out.println("You attacked a shield with an archer. Nothing happens.");
	}else if (playerVal == 7){
		//cpu card dies
		System.out.println("You attacked with an archer and won.");
		if(targetDeck==0){
			annihilate(cpuCards, targetDeck, cpuPile0Count);
		}else if(targetDeck==1){
			annihilate(cpuCards, targetDeck, cpuPile1Count);
		}else if(targetDeck==2){
			annihilate(cpuCards, targetDeck, cpuPile2Count);
		}else if(targetDeck==3){
			annihilate(cpuCards, targetDeck, cpuPile3Count);
		}else if(targetDeck==4){
			annihilate(cpuCards, targetDeck, cpuPile4Count);
		}
		 
	}else if (cpuVal == 9){
		System.out.println("You attacked the crown and won!!!!!!! ");
		cpuHasCrown = false;
		if(targetDeck==0){
			annihilate(cpuCards, targetDeck, cpuPile0Count);
			cpuPile0Count--;
		}else if(targetDeck==1){
			annihilate(cpuCards, targetDeck, cpuPile1Count);
			cpuPile1Count--;
		}else if(targetDeck==2){
			annihilate(cpuCards, targetDeck, cpuPile2Count);
			cpuPile2Count--;
		}else if(targetDeck==3){
			annihilate(cpuCards, targetDeck, cpuPile3Count);
			cpuPile3Count--;
		}else if(targetDeck==4){
			annihilate(cpuCards, targetDeck, cpuPile4Count);
			cpuPile4Count--;
		}
	}else if (playerVal > cpuVal){
		//then discard the computer card
		System.out.println("You attacked and won.");
		if(targetDeck==0){
			annihilate(cpuCards, targetDeck, cpuPile0Count);
			cpuPile0Count--;
		}else if(targetDeck==1){
			annihilate(cpuCards, targetDeck, cpuPile1Count);
			cpuPile1Count--;
		}else if(targetDeck==2){
			annihilate(cpuCards, targetDeck, cpuPile2Count);
			cpuPile2Count--;
		}else if(targetDeck==3){
			annihilate(cpuCards, targetDeck, cpuPile3Count);
			cpuPile3Count--;
		}else if(targetDeck==4){
			annihilate(cpuCards, targetDeck, cpuPile4Count);
			cpuPile4Count--;
		}
	}else if (playerVal < cpuVal){
		//then discard the player card 
		System.out.println("You attacked and lost.");
		if(deckChoice==0){
			annihilate(playerCards, deckChoice, pile0count);
			pile0count--;
		}else if(deckChoice==1){
			annihilate(playerCards, deckChoice, pile1count);
			pile1count--;
		}else if(deckChoice==2){
			annihilate(playerCards, deckChoice, pile2count);
			pile2count--;
		}else if(deckChoice==3){
			annihilate(playerCards, deckChoice, pile3count);
			pile3count--;
		}else if(deckChoice==4){
			annihilate(playerCards, deckChoice, pile4count);
			pile4count--;
		}
	}else if (playerVal == cpuVal){
		//then discard the computer card and player card
		System.out.println("You destroyed each other in a tie.");
		if(deckChoice==0){ //to dip the player cards
			annihilate(playerCards, deckChoice, pile0count);
			pile0count--;
		}else if(deckChoice==1){
			annihilate(playerCards, deckChoice, pile1count);
			pile1count--;
		}else if(deckChoice==2){
			annihilate(playerCards, deckChoice, pile2count);
			pile2count--;
		}else if(deckChoice==3){
			annihilate(playerCards, deckChoice, pile3count);
			pile3count--;
		}else if(deckChoice==4){
			annihilate(playerCards, deckChoice, pile4count);
			pile4count--;
		}
		if(targetDeck==0){ //to dip the cpu cards
			annihilate(cpuCards, targetDeck, cpuPile0Count);
			cpuPile0Count--;
		}else if(targetDeck==1){
			annihilate(cpuCards, targetDeck, cpuPile1Count);
			cpuPile1Count--;
		}else if(targetDeck==2){
			annihilate(cpuCards, targetDeck, cpuPile2Count);
			cpuPile2Count--;
		}else if(targetDeck==3){
			annihilate(cpuCards, targetDeck, cpuPile3Count);
			cpuPile3Count--;
		}else if(targetDeck==4){
			annihilate(cpuCards, targetDeck, cpuPile4Count);
			cpuPile4Count--;
		}
	}else{}
}

public static void compuTurn(){
	int deckChoice = (int)(Math.random()*5);
	int targetDeck = (int)(Math.random()*5); 
	int cpuVal = 0;
	int playerVal = 0; 
	
	if (deckChoice == 0){
		cpuVal = cpuCards[deckChoice][cpuPile0Count].getCardValue();
	}else if (deckChoice == 1){
		cpuVal = cpuCards[deckChoice][cpuPile1Count].getCardValue();
	}else if (deckChoice == 2){
		cpuVal = cpuCards[deckChoice][cpuPile2Count].getCardValue();
	}else if (deckChoice == 3){
		cpuVal = cpuCards[deckChoice][cpuPile3Count].getCardValue();
	}else if (deckChoice == 4){
		cpuVal = cpuCards[deckChoice][cpuPile4Count].getCardValue();
	}else {
		System.out.print("You did wrong.");
	}
// separadas
	if (targetDeck == 0){
		playerVal = playerCards[targetDeck][pile0count].getCardValue();
	}else if (targetDeck == 1){
		playerVal = playerCards[targetDeck][pile1count].getCardValue();
	}else if (targetDeck == 2){
		playerVal = playerCards[targetDeck][pile2count].getCardValue();
	}else if (targetDeck == 3){
		playerVal = playerCards[targetDeck][pile3count].getCardValue();
	}else if (targetDeck == 4){
		playerVal = playerCards[targetDeck][pile4count].getCardValue();
	}else {
		System.out.print("You did wrong.");
	}
	
	if (cpuVal==8){
		System.out.println("CPU attacked with a shield and lost a turn.");
	}else if(playerVal==7 && cpuVal == 8){
		System.out.println("CPU attacked a shield with an archer. Nothing happens.");
	}else if (cpuVal==8){
		//player card dies
		System.out.println("CPU attacked with an archer and won.");
		if(targetDeck==0){
			annihilate(playerCards, targetDeck, pile0count);
			pile0count--;
		}else if(targetDeck==1){
			annihilate(playerCards, targetDeck, pile1count);
			pile1count--;
		}else if(targetDeck==2){
			annihilate(playerCards, targetDeck, pile2count);
			pile2count--;
		}else if(targetDeck==3){
			annihilate(playerCards, targetDeck, pile3count);
			pile3count--;
		}else if(targetDeck==4){
			annihilate(playerCards, targetDeck, pile4count);
			pile4count--;
		} 
	}else if (cpuVal == 9){
		System.out.println("CPU attacked the crown and you lose!");
		playerHasCrown = false;
		if(targetDeck==0){
			annihilate(playerCards, targetDeck, pile0count);
			pile0count--;
		}else if(targetDeck==1){
			annihilate(playerCards, targetDeck, pile1count);
			pile1count--;
		}else if(targetDeck==2){
			annihilate(playerCards, targetDeck, pile2count);
			pile2count--;
		}else if(targetDeck==3){
			annihilate(playerCards, targetDeck, pile3count);
			pile3count--;
		}else if(targetDeck==4){
			annihilate(playerCards, targetDeck, pile4count);
			pile4count--;
		}
	}else if (playerVal > cpuVal){
		//then discard the computer card
		System.out.println("CPU attacked and lost.");
		if(deckChoice==0){
			annihilate(cpuCards, deckChoice, cpuPile0Count);
			cpuPile0Count--;
		}else if(deckChoice==1){
			annihilate(cpuCards, deckChoice, cpuPile1Count);
			cpuPile1Count--;
		}else if(deckChoice==2){
			annihilate(cpuCards, deckChoice, cpuPile2Count);
			cpuPile2Count--;
		}else if(deckChoice==3){
			annihilate(cpuCards, deckChoice, cpuPile3Count);
			cpuPile3Count--;
		}else if(deckChoice==4){
			annihilate(cpuCards, deckChoice, cpuPile4Count);
			cpuPile4Count--;
		}
	}else if (playerVal < cpuVal){
		//then discard the player card 
		System.out.println("CPU attacked and won.");
		if(targetDeck==0){
			annihilate(playerCards, targetDeck, pile0count);
			pile0count--;
		}else if(targetDeck==1){
			annihilate(playerCards, targetDeck, pile1count);
			pile1count--;
		}else if(targetDeck==2){
			annihilate(playerCards, targetDeck, pile2count);
			pile2count--;
		}else if(targetDeck==3){
			annihilate(playerCards, targetDeck, pile3count);
			pile3count--;
		}else if(targetDeck==4){
			annihilate(playerCards, targetDeck, pile4count);
			pile4count--;
		}
	}else if (playerVal == cpuVal){
		//then discard the computer card and player card
		System.out.println("You destroyed each other in a tie.");
		if(targetDeck==0){ //to dip the player cards
			annihilate(playerCards, targetDeck, pile0count);
			pile0count--;
		}else if(targetDeck==1){
			annihilate(playerCards, targetDeck, pile1count);
			pile1count--;
		}else if(targetDeck==2){
			annihilate(playerCards, targetDeck, pile2count);
			pile2count--;
		}else if(targetDeck==3){
			annihilate(playerCards, targetDeck, pile3count);
			pile3count--;
		}else if(targetDeck==4){
			annihilate(playerCards, targetDeck, pile4count);
			pile4count--;
		}
		if(deckChoice==0){ //to dip the cpu cards
			annihilate(cpuCards, deckChoice, cpuPile0Count);
			cpuPile0Count--;
		}else if(deckChoice==1){
			annihilate(cpuCards, deckChoice, cpuPile1Count);
			cpuPile1Count--;
		}else if(deckChoice==2){
			annihilate(cpuCards, deckChoice, cpuPile2Count);
			cpuPile2Count--;
		}else if(deckChoice==3){
			annihilate(cpuCards, deckChoice, cpuPile3Count);
			cpuPile3Count--;
		}else if(deckChoice==4){
			annihilate(cpuCards, deckChoice, cpuPile4Count);
			cpuPile4Count--;
		}
	}else{}
}

public static void annihilate(Card[][] a, int pile, int pileCounter){
	a[pile][pileCounter] = null;
}
}//closes Driver