

//FROM THE BOOK "THINK LIKE A COMPUTER SCIENTIST - JAVA" EXERCISE 6
//DRAW A COLUMN FOR "i" AND "n" THEN WRITE THE VALUES AND TELL IF THE CONDITION WILL FOREVER BE TRUE


public class Exercise6{

public static void main(String[] args){
loop(10);
}

public static void loop(int n){
int i = n;
while(i > 1){
System.out.println(i);
if(i % 2 == 0){
i = i/2;
}else{
i = i + 1;
}
}




}

}