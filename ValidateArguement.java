import java.util.*;

public class ValidateArguement{

public static void main(String[] args){

}

//e.g if(array.lenth == 0){...blah,blah}
//TO CHECK IF THE FIRST LETTER OF A WORD IS CAPITALISED
public static boolean isCapitalised(String string){
if(string == null || string.isEmpty()){       //notice we checked for null value first so as to prevent the nullPointerException.page183 . This will prevent the second condition which is isEmpty() to not be called
return false;
}
return Character.isUpperCase(string.charAt(0));
}



}