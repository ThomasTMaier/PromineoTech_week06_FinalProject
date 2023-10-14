package week06FinalCodingProject;

public class Card {
	private String CardName;
	private int CardValue;
	String Great = "";
// creates the card object
	public Card(String Name, int Value) {
		CardName = Name;
		CardValue = Value;
	}
//sets the card
	public void SetCard(String TopCard) {
		CardName = TopCard;

	}
//sets the value from a string
	public void SetCardValue(String TopCardValue) {
//This is done so that there is one less variable in the mix
		StringBuilder TopValue = new StringBuilder();
		TopValue.append(TopCardValue.charAt(0));
		Great = TopValue.toString();
		switch (Great) {
		case "1":
			CardValue = 10;
			break;
		case "J":
			CardValue = 11;
			break;

		case "Q":
			CardValue = 12;
			break;

		case "K":
			CardValue = 13;
			break;

		case "A":
			CardValue = 14;
			break;

		default:

			CardValue = Integer.parseInt(Great);
			

		}
	

	}
//Getters
	public String GetCard() {
		return CardName;

	}

	public int GetValue() {
		return CardValue;
	}
//describes the cards
	public  String describe() {
	return	(CardName + " which has a value of: " + CardValue);
	}

}
