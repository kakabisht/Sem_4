import java.util.*;
import java.util.Scanner;

class Cardme{
	public static void main(String args[]){
        Card card = new Card();
        //This is used to point towards a specific card
    int k=0;
    do{
	System.out.printf("\n\n\tYo!!\n"+
						"Select one of the following....\n\n"
						+"1.Create a Deck\n"
						+"2.Shuffle the Deck\n"
						+"3.Print a Deck\n"
						+"4.Find a Card\n"
						+"5.Print Current Card\n"
						+"6.Deal a Hand of 5 cards\n"
                        +"7.Compare two cards\n"
                        +"8.Break out of loop");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
            int suit;
        switch(choice){
            case 1://create a Deck
                card.createDeck();
                System.out.println("Deck of 52 unique cards has been made!!!");
                break;
            case 2://Shuffle Deck
                card.ShuffleDeck();
                System.out.println("Deck has been shuffled");
                break;
            case 3://Print Deck
                card.printDeck();
                break;
            case 4://Search Deck
                System.out.println("Enter suit of card to be searched...");
                suit = card.getSuitIntFromString(scan.next());
                //suit>0?1:break;
                System.out.println("Enter Rank of the card");
                Card findCard = card.findCard(suit,scan.nextInt());
                break;
            case 5://print card
                card.printCard();
                break;
            case 6://deal 5 cards
                card.dealCards();
                break;
            case 7://compare
                System.out.println("Enter suit of  card 1 to be Compared...");
                suit = card.getSuitIntFromString(scan.next());
                //suit>0?1:break;
                System.out.println("Enter Rank of the card");
                Card card1 = new Card(suit,scan.nextInt());
                System.out.println("Enter suit of card 2 to be Compared...");
                suit = card.getSuitIntFromString(scan.next());
                //suit>0?1:break;
                System.out.println("Enter Rank of the card");
                Card card2 = new Card(suit,scan.nextInt());
                if(card.compare(card1,card2)==0)
                    System.out.println("Card 2 is greater");
                else System.out.println("Card 1 is Greater");
                
                break;
            case 8://Garbage collector
                k=1;
                break;
            default:
                System.out.println("Enter the correct choice");
                
        }
    }while(k==0);
    System.out.println("Before :"+card); 
    System.out.println("Garbage collector called"); 
    card=null;
    System.gc();	
    System.out.println("After :"+card); 
	}
}


class Card{
	private int suit,rank;
	private String suitInString;
	final String[] suitIntToString = {"","heart","Diamond","Club","Spade"};
	List<Card> deck = new ArrayList<Card>();
	int top;
    Card(){
		this.suit = 0;
		this.rank = 0;
        suitInString = suitIntToString[suit];
    }
    Card(int suit, int rank){
		this.suit = suit;
		this.rank = rank;
		suitInString = suitIntToString[suit];
	}
    
	int getSuitIntFromString(String suitInString){
		for(int i=1;i<5;i++)
			if(suitIntToString[i].equals(suitInString))
				return i;
				
		return 0;
	}
	
	
	String getSuitInString(){
		return suitInString;
	}
	
	void printCard(){
	System.out.print("Card-----\n"+
						"Suit:"+suitInString+"\n"+
						"Rank:"+rank+"\n\n");
	}
	
	List<Card> createDeck(){
		for(int i=1;i<5;i++){
			for(int j=1;j<14;j++){
				deck.add(new Card(i,j));
			}
		}
		top = 52;
		return deck;
	}
	
	void printDeck(){
		for(Card card : deck)
			card.printCard();
		for(int i =0;i<10;i++)
			System.out.printf("*");
		System.out.println("\nNo of Cards:"+deck.size());
	}
	
	void printHand(List<Card> hand){
		for(Card card : hand)
			card.printCard();
		for(int i =0;i<10;i++)
			System.out.printf("*");
		System.out.println("\nNo of Cards:"+hand.size());	
	}
	
	int compareCard(Card otherCard){
		if (suit<otherCard.suit)
			return 1;
		else if (suit == otherCard.suit){
			if(otherCard.rank>rank)
				return 1;
			else return 0;
		}
		else 
			return 0; // returns 1 if otherCard is greater
	}
	int compare(Card otherCard,Card card2){
		if (card2.suit<otherCard.suit)
			return 1;
		else if (card2.suit == otherCard.suit){
			if(otherCard.rank>card2.rank)
				return 1;
			else return 0;
		}
		else 
			return 0; // returns 1 if otherCard is greater
	}
	
	Card findCard(int suit,int rank){
		//sortDeck();
		//int offset = (suit-1)*13;
		System.out.println("rank:"+rank +" suit:"+suit);
		for(int i=0;i<deck.size(); i++){
			if(deck.get(i).rank==rank && deck.get(i).suit == suit){
				System.out.println("Found at Pos:"+i);
				return deck.get(i);
			}
		}
		System.out.println("Not Found in Deck");
		return null;
	}
	
	void sortDeck(){
	    for (int i = 0; i < 13-1; i++) 
			for (int j = 0; j < 13-i-1; j++) 
				if (deck.get(j).rank> deck.get(j+1).rank && deck.get(j).suit ==deck.get(j+1).suit) 
					{ 
						//Card temp = deck.get(j+1);
						//deck[j+1] = deck[j];
						//deck.get(j)= temp;
						Collections.swap(deck,j,j+1);
					}
	}
	
	List<Card> dealCards(){
		List<Card> hand = new ArrayList<Card>();
		for(int i = 0; i<=5;i++)
		{
			Random  rand = new Random();
			hand.add(deck.get(rand.nextInt(deck.size())));
		}
		printHand(hand);
		return hand;
	}
	
	
	void ShuffleDeck(){
		Collections.shuffle(deck,new Random());
	}
	
	
	
}
