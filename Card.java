
//CHAPTER 12 OF "how to think like a computer scientist - java";
//ARRAY OF OBJECTS

//Mapping each card suit and rank to integers
//Club = 0;
//Diamond = 1;
//Heart = 2;
//Spade = 3;

//mapping the ranks
//Ace = 1
 //2  = 2
 //3  = 3...
 //10 = 10
//Jack = 11
//Queen = 12
//King = 13


// public class Card{

// //This is where the class variables called static variables are declared i.e before the instance variables and methods
// //e.g public static final String[] RANKS = new RANKS[13];

// public static final String[] RANKS = {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen", "King"};
// public static final String[] SUITS = {"Club", "Diamond", "Heart", "Spade"};
// String s = RANKS[this.rank] + "of" + SUITS[this.suit];

// //THE toString method when working with the class variables
// public String toString(){
// String s = RANKS[this.rank] + "of" + SUITS[this.suit];
// return s;
// }

// //Instance variables
// private int rank; //better written private final int rank; to avoid both being tampered with by a hacker, fool etc.//mutators are not adviced for both//accessors can be allowed for both
// private int suit;  //better written private final int suit;

// //Constructor
// public Card(int rank, int suit){
// this.rank = rank;
// this.suit = suit;
// }

// //After mapping each rank and suit with integers as thus club - 0 ...check the book
// //This will reference a space in memory for card 3 of clubs
// Card threeOfClub = new Card(3, 0);

// //toString method...representing a card in string format for human readability
// String[] rank = new String[13];
// String[] rank = {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen", "King"};
// String[] suit = new String[4];
// String[] suit = {"Club", "Diamond", "Heart", "Spade"};

// //toString method when working with instance variables;
// public String toString(){
// String s = rank[this.rank] + "of" + suit[this.suit]; //the "this" keyword says , use the instance variable rank of this particular object as an  index into the array ranks
// }

// //equals to test wether two objects are equivalent and
// public boolean equals(Card that){
// return this.rank == that.rank
// && this.suit == that.suit;
// }

// //compareTo method to compare cards to tell which one is higher or lower than the other;
// //In this case, its difficult to compare which card is higher 3 clubs or 2 Diamonds? hence since this is arbitrary, we find a common ground and decide which is more important , suits or ranks
// //then we compare . Cards is partially ordered cos some times you can compare other times you can't. Let suit be more important then check suits first, if equal, then check ranks, if equal then return 0;
// public String compareTo(Card that){
// if(this.suit > that.suit){
// return 1;
// } if(this.suit < that.suit){
// return -1;
// }if(this.ran > that.rank){
// return 1;
// }if(this.rank < that.rank){
// return -1;
// }return 0;
// }


// //THE instance variables are private.To allow other classes access them, let's write some accessors and mutators
// public int getRank(){
// return this.rank;
// }
// public int getSuit(){
// return this.suit;
// }

// //Whether or not to provide setters is a design decision. If we did, cards would be mutable, so you could transform one card into another. That is
// //probably not a feature we want, and in general, mutable objects are more error-prone. So it might be better to make cards immutable. To do that, all
// //we have to do is not provide any modifier methods (including setters). That’s easy enough, but it is not foolproof, because a fool might come along
// //later and add a modifier. We can prevent that possibility by declaring the instance variables final:

// private final int rank;
// private final int suit;

// //Creating Array of Cards
// Card[] cards = new Card[52];
// int index = 0;
// for(int x = 0; x < suit.length ; x ++){  // for (suit = 0; suit <= 3; suit ++)
// suit = x;							//erase
// for(int y = 1; y < rank.length; y++){		//for(rank = 1; rank <= 13; rank ++)
// rank = y;							//erase
// }								//
// cards[index] = new Card(rank, suit); 		//cards[index] = new Card(rank, suit);
// index ++;							//index ++;
// }

// //It is nice to have a method that displays all the content when you are working with an array
// public static void printDeck(Card[] cards){
// for(Card card: cards){
// System.out.println(card);  //System.out.print(Arrays.toString(card));
// }
// }

// //SEQUENTIAL SEARCH
// public static int search(Card[] cards, Card subject){
// for(int x = 0; x < cards.length; x ++){
// if (cards[x] == Card(suits, rank)){    //if(cards[x].equals(subject)
// System.out.print(x);
// return x;
// }
// } return -1;
// }
// //Sequential search is relatively inefficient, especially for large arrays. If you pay the price to keep the array sorted, finding elements becomes much easier.

// //ALGORITHM FOR A BINARY SEARCH(Faster than sequential only when the elements are in order). So take the pain to make it in order before using the binary search
// public static int binarySearch(Card[] cards, Card target){
// int low = 0;
// int high = cards.length -1;
// while(low <= high){
// int mid = (low + high) /2
// int comp = cards[mid].compareTo(target);
// if(comp == 0){
// return mid;
// }else if(comp < 0){
// low = mid + 1;
// }else{
// high = mid -1;
// }
// }return -1;
// }


// //DECK OF CARDS and POPULATING THE DECK OF CARDS
// public class Deck{
// private Card[] cards;

// public Deck(int n){
// this.cards = new Card[n];
// }

// public Card[] getCards(){
// return this.cards;
// }

// }
// //POPULATING ...
// public Deck(){
// this.cards = new Card[52];

// int index = 0;
// for(int suit= 0; x < suit.length ; suit++){
// for(int rank= 1; y < rank.length; rank++){
// cards[index] = new Card(rank, suit);
// index ++;

// }
// }

// }








// }