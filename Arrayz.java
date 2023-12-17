import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;
//Arrays with two common traversal( search and reduce);


public class Arrayz{

public static void main(String[] args){
int[] hail = {2,7,9,45,125,1,980};
//effingAround();
//sortOut();	
//searchElement();
//copyElements1();
//copyElements2();
//fillArray();
//fillElements2();
//reduceArray();
//randomFills();
//enhancedForLoop();
//isDoubloon();
//indexOfMax(hail);
//seiveOfEratosthenes(20);
//recursiveMethod(3);
//fibonacci(5);
//recursiveCountUp(3);
songLyrics(100);

}


//Sorts out the array elements and returns the elements in ascending order
public static void sortOut(){
int[] a = {12,34,62,70,18};
Arrays.sort(a);
System.out.print(Arrays.toString(a));
}

//search for an element in an array
public static void searchElement(){
int[] a = {12,34,62,70,18};
int ind = Arrays.binarySearch(a,70); //for strings. the indexOf() is used either lastIndexOf or ...
System.out.print(ind);
}


//COPY ELEMENTS OF AN ARRAY INTO ANOTHER ARRAY
public static void copyElements1(){
int[] a = {12,34,62,70,18};
int[] b = new int[a.length];
for(int x = 0; x < a.length; x ++){
b[x] = a[x];
}
System.out.print(Arrays.toString(b));
}

//REDUCE OPERATIONON AN ARRAY INT HIS CASE, SUM UP ARRAY VALUES
public static void reduceArray(){
int[] a = {12,34,62,70,18};
int sum = 0;     //this variable "sum" can also be called an accumulator;
for(int x = 0; x < a.length; x ++){
sum = sum + a[x];
}
System.out.print(sum);
}

//ANOTHER WAY TO COPY ELEMENTS OF AN ARRAY INTO ANOTHER ARRAY WITH THE copyOf()
public static void copyElements2(){
int[] a = {12,34,62,70,18};
int[] b = Arrays.copyOf(a,a.length); //copys all elements
int[] c = Arrays.copyOf(a,4); //copys elements before the indexed element and includes the indexed element
System.out.print(Arrays.toString(b));
System.out.print(Arrays.toString(c));
}

//FILL AN EMPTY ARRAY WITH ELEMENT(S)
public static void fillArray(){
int[] a = new int[10];
Arrays.fill(a,5);
System.out.print(Arrays.toString(a));
}

//FILL METHOD EXPLORATION
public static void fillElements2(){
int[] a = new int[5];
for(int x = 0; x < a.length; x ++){
Arrays.fill(a, x);
System.out.print(Arrays.toString(a));
}
}


//FILL AN ARRAY WITH RANDOM NUMBERS
public static void randomFills(){
SecureRandom randomNumber = new SecureRandom();
int[] a = new int[5];
for(int x = 0; x < a.length; x ++){
a[x] = randomNumber.nextInt(20);
}
System.out.print(Arrays.toString(a));
}

//ENHANCED FOR LOOP FOR THE RANDOM NUMBERS EXAMPLE
public static void enhancedForLoop(){
SecureRandom random = new SecureRandom();
int[] values = new int[5]; //{2,6,8,5 };
for(int element: values){
element += 5;
System.out.println(element);
}

}

//CHECK IF A CHARACTER APPEARS TWICE IN A WORD (DOUBLOON)
public static void isDoubloon(){
Scanner input = new Scanner(System.in);
String userInput;
int  checker = 0;
int countsIndex = 0;

System.out.print("Input a word to check if its a doubloon:  ");
userInput = input.nextLine();  //.toCharArray();
int userInputLength = userInput.length();

int[] counts = new int[26] ;
int x ;

for(x = 0 ; x < userInputLength ; x ++){
countsIndex = userInput.charAt(x) - 'a';
System.out.println(countsIndex);	
counts[countsIndex]++;
System.out.println(counts[countsIndex]);
}
for(int i = 0; i < counts.length; i++){
if(counts[i] == 2){
checker = 1;
//System.out.print("This is a doubloon");
break;
}else {checker = 2;}
}


if (checker == 1){
System.out.print("This is a doubloon");
}else if(checker ==2){
System.out.print("This is NOT a doubloon");
}



//return checker;
}



//FIND THE INDEX OF THE HIGHEST NUMBER IN THE ARRAY
public static void indexOfMax(int[] num){
//int[] num = new int[6];

int maxNum = num[0] ;
int x;

for(x = 0; x < num.length ; x ++){
maxNum = Math.max(maxNum, num[x] );
}
System.out.print(maxNum);
}


//FIND PRIME NUMBERS SMALLER THAN A GIVEN NUMBER
public static void seiveOfEratosthenes(int n){
boolean prime[] = new boolean[n+1];
for(int i = 0; i < n ; i ++){
}
for(int p = 2; p*p < n; p ++){
if (prime[p] == true){
for(int i = p*p; i < n; i += p){
prime[i] = false;
}
}
for(int i = 2; i < n; i ++){
if (prime[i] == true){
System.out.print(i + " ");
}
}
}



}


//RECURSIVE METHOD : A METHOD THAT CALLS ITSELF
public static void recursiveMethod(int n){
if(n == 0){
System.out.print("Blast off!");
}else{
System.out.println(n);
recursiveMethod(n -1);
}
}

//RECURSIVE PROGRAM WITH NO "BASE CASE" HENCE RUNS FOREVER
public static void foreverRecursive(String s){
System.out.println(s);
foreverRecursive(s);
}

//RECURSIVE COUNTING UPWARD INSTEAD OF DOWNWARD
public static void recursiveCountUp(int n) {
if (n == 0) {
System.out.println("Blastoff!");
} else {
recursiveCountUp(n - 1);
System.out.println(n);
}
}

//EXERCISE ON RECURSIVE METHOD
public static void songLyrics(int n){
System.out.printf("%d bottles of beer on the wall \n", n);
if(n == 0){
System.out.print("There are no bottles of beer, \n ya' can't take one down, ya' can't pass it around");
}else{
System.out.printf(" %d bottles of beer,\n ya' take one down, ya' pass it around \n", n);
songLyrics(n-1);

}
}


//THE FIBONACCI SHIT
public static int fibonacci(int n) {
if (n == 1 || n == 2) {
return 1;
}
return fibonacci(n - 1) + fibonacci(n - 2);
}




//JUST EFFING AROUND...
public static void effingAround(){
int[] numbers = new int[6];

//This will print the address in memory of the array and its elements
System.out.print(numbers);

//This will print the actual elements within square brackets to actuallyh confirm it's an array 
//with the help of the Arrays.toStrihng() method available in java.util.Arrays;
System.out.print(Arrays.toString(numbers));

int[] a = {12,34,62,70,18};
System.out.print(a.length);
int[] b = new int[a.length];

for(int x = 0 ; x < a.length; x ++){
b[x] = a[x];
}

System.out.print(Arrays.toString(b));
b = Arrays.copyOf(a, a.length);
System.out.print(Arrays.toString(b));

}



}