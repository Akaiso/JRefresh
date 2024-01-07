//Initializing the elements of an array with an array initializer

public class InitArray2 {
    public static void main(String[] args){
//Initializer list specifies the intial value for each element
int[] array = {35, 78, 65, 3, 99, 15, 30, 75, 84, 22, 41};

System.out.printf("%s%8s%n", "Index", "valaue"); //column headings

//output each array element's value
for(int counter = 0; counter < array.length; counter++)
{System.out.printf("%5d%8d%n", counter, array[counter]);}
    }
}
