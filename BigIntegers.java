import java.util.*;
import java.math.BigInteger;
//The BigInteger class in Java is used to represent arbitrarily big integers . Integers greater than Long.MAX_VALUE;
//Integer and Long offer variety of methods , if you are wondering why we will ever use them
//BigInteger is not a primitive type and it is immutable. returns a new version of the BigInteger rather than modify an existing one.
import java.time.LocalTime;


public class BigIntegers{

public static void main(String[] args){


//CONVERTING AN INTEGER AND STRING TO BIGINTEGER
//int a = 20;
//String s = "23561";

//BigInteger biggerRep = BigInteger.valueOf(a);
//BigInteger biggerString = new BigInteger(s); //NOTICE THE DIFFERENCE ? string not valueOf and the new in string


LocalTime time1 =  LocalTime.of(18,50,0);
LocalTime time2 =  LocalTime.of(2,16, 0);
LocalTime time3 = LocalTime.of(0,0,0);

timeCheck(time1, time2);
System.out.print(time3);
}


public static void timeCheck(LocalTime time1, LocalTime time2){
LocalTime sum = LocalTime.of(0,0,0);
//sum = time1.add(time2);
sum = time1.plusHours(time2.getHour()).plusMinutes(time2.getMinute	());
//sum = time1.plusMinutes(15); 
//sum = time1.plusSeconds(1);
 System.out.print(sum);
}



}