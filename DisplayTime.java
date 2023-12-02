public class DisplayTime{

public static void main(String[] args){

timeString(1,0,"");

}

public static int timeString(int hr , int mins, String ampm){
for(hr = 1; hr <= 24; hr ++){
for(int y = hr; y <= hr; y++){
if (y < 12){
ampm = "AM";
}if(y == 12){
ampm = "NOON";
}
if(y>12){
ampm = "PM";
}
System.out.printf("%2d:%02d %s", hr, mins, ampm);

System.out.println();
}
}
return hr;
}



}