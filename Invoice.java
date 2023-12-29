public class Invoice {
private String itemNumber ;
private String description ;
private int quantPurchased ;
private double pricePerItem ;

 Invoice(String itemNumber , String description, int quantPurchased, double pricePerItem ){
    this.itemNumber = itemNumber;
    this.description = description;
    this.quantPurchased = quantPurchased;
    this.pricePerItem = pricePerItem;
 }

 public void  setItemNumber(String itemNumber){
    this.itemNumber = itemNumber;
 }

 public String getItemNumber(){
    return itemNumber;
 }

 public void setDescription(String description){
    this.description = description;
 }

 public String getDescription(){
   return description;
 }

 public void setQuantPurchased(int quantPurchased){
    this.quantPurchased = quantPurchased;
 }

 public int getQuantPurchased(){
    return quantPurchased;
 }

 public void setPricePerItem(double pricePerItem){
    this.pricePerItem = pricePerItem;
 }

 public double getPricePurchased(){
    return pricePerItem;
 }

 public double getInvoiceAmount(){
    double TotalAmount = 0;
   
    if(pricePerItem > 0.0 && quantPurchased > 0){
     TotalAmount = quantPurchased * pricePerItem;
    
    } return TotalAmount;
 }

}
