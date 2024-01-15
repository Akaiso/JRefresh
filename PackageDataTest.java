//Package-access members of a class are accessible by other classes
//in the same package


public class PackageDataTest {
    public static void main(String[] args){
        PackageData packageData = new PackageData();

        // output String representation of packageData
        System.out.printf("After instantiation: %n%s%n", packageData);

        //change package access data in packageData object
        packageData.number = 77;
        packageData.string = "Goodbye";

        //output String representation of packageData
        System.out.printf("%nAfter chanbging values:%n%s%n", packageData);
    }
    
}  // end class PackageDateTest

//class with package access instance variables
class PackageData{
    int number; // package-access instance variable
    String string; // package-access instance variable

    //constructor
    public PackageData(){
        number = 0;
        string = "Hello";
    }

    // return PackageData object String representation
    public String toString(){
        return String.format("number: %d; striing: %s", number, string);
    }
}

