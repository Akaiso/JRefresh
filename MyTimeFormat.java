import java.util.Scanner;


public class MyTimeFormat{

public static void printAmerican(String d, String mth, int d2,  int yr){
System.out.printf("AMERICAN TIME FORMAT: %s, %s %d, %d \n", d, mth, d2, yr);

}

public static void printEuropean(String d, int d2, String mth, int yr){
System.out.printf("EUROPEAN TIME FORMAT: %s, %d %s, %d \n", d, d2, mth, yr);
}

public static void newLine(){
System.out.println();
}


public static void main(String[] args){

Scanner input1 = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);
Scanner input3 = new Scanner(System.in);
Scanner input4 = new Scanner(System.in);
String day;
int date;
String month;
int year;

System.out.println("DISPLAY AMERICAN AND EUROPEAN TIME FORMATS RESPECTIVELY: ");
System.out.print("Type a day e.g Monday:  ");
day = input1.nextLine();

System.out.print("Type a date e.g 04:  ");
date = input2.nextInt();

System.out.print("Type a month e.g January:  ");
month = input3.nextLine();

System.out.print("Type a year e.g 2023:  ");
year = input4.nextInt();

newLine();

printAmerican(day, month, date, year);
printEuropean(day, date, month, year);

}

}