// import java.util.Scanner;
// import java.util.Arrays;

/** The lines of codes are commented to prevent error or bug indication */



//public class RecursiveMethods{

//public static void main(String[] args){
//String s;
//int bottles = 100;
//int lowest = Integer.MAX_VALUE;
//System.out.print(lowest);
//recursiveMethod(3);
//fibonacci(5);
//recursiveCountUp(3);
//oreverRecursive(s);
//oddSum(10);
//songLyhrics(bottles);

// int max = Integer.MIN_VALUE;
// value = Integer.parseInt(arg);
// for(String arg: args){
// if(value > max){
// max = value;
// }
// }System.out.print(max);

// }



// //LYRICS TO SONG, "99 BOTTLES OF BEER ON THE WALL"
// public static void songLyrics(int n){
// System.out.printf("%d bottles of beer on the wall \n", n);
// if(n == 0){
// System.out.print("There are no bottles of beer, \n ya' can't take one down, ya' can't pass it around");
// }else{
// System.out.printf(" %d bottles of beer,\n ya' take one down, ya' pass it around \n", n);
// songLyrics(n-1);
// }
// }


// //RECURSIVE METHOD : A METHOD THAT CALLS ITSELF
// public static void recursiveMethod(int n){
// if(n == 0){
// System.out.print("Blast off!");
// }else{
// System.out.println(n);
// recursiveMethod(n -1);
// }
// }

// //RECURSIVE PROGRAM WITH NO "BASE CASE" HENCE RUNS FOREVER
// public static void foreverRecursive(String s){
// System.out.println(s);
// foreverRecursive(s);
// }

// //RECURSIVE COUNTING UPWARD INSTEAD OF DOWNWARD
// public static void recursiveCountUp(int n) {
// if (n == 0) {
// System.out.println("Blastoff!");
// } else {
// recursiveCountUp(n - 1);
// System.out.println(n);
// }
// }


// //THE FIBONACCI SHIT
// public static int fibonacci(int n) {
// if (n == 1 || n == 2) {
// return 1;
// }
// return fibonacci(n - 1) + fibonacci(n - 2);
// }

// //FIND THE SUM OF ODD NUMBERS BELOW A GIVEN NUMBER ...still working on this
// public static void  oddSum(int n){
// int sum = 0;
// for(int x = 1; x < n; x ++){
// if(x%2 == 0  ){
// continue;
// }if(x%2 == 1){
// sum = sum + x;
// continue;
// }
// }
// System.out.print(sum);
// }





// }