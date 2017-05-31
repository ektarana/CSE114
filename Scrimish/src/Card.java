//Ekta Rana
//111030624
public class Card {
	private int cardValue;
	private String cardName;

	// default constructor
	public Card(int value, String name) {
		cardValue = value;
		cardName = name;
	}

	// getters
	public int getCardValue() {
		return cardValue;
	}

	public String getCardName() {
		return cardName;
	}

	// setters
	public void setCardValue(int value) {
		cardValue = value;
	}

	public void setCardName(String name) {
		cardName = name;
	}
}