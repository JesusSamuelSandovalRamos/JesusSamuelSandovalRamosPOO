public class Tv {
 private int channel;
 private int volumelevel;
 private int boolean on; 

 public void getchannel(){
     return channel;
 }

 public void getvolumelevel(){
     return volumelevel;
 }

 public boolean geton(){
     return on;
 }

 public void turnOn(){
     on =true;
 } 
 public void turnOff(){
     on =false;
 } 
 public void setchannel(int newchannel){ 
     if(on && newchannel>=1 && newchannel <=120)
     channel = newchannel;
 } 

 public void setvolume(int newvolumelevel){ 
     if(on && newvolumelevel>=1 && newvolumelevel <=7)
     volumelevel = newvolumelevel;
 } 
 public void volumeUp(){
     //volumelevel = volumelevel + 1; 
     if(on && volumelevel< 7){
     volumelevel++;
 } 
 public void volumeDown(){ 
     if(on && volumelevel > 1) {
     volumeDown--;
 }
 public void channelUp (){ 
     if(on && channel < 120){
     channel++;
 }
 public void channelDown(){ 
     if(on && channel > 1){
     channel--;
 } 
  public static void main(String[]args){
      Tv sony = new Tv;
      sony.turnOn();
      sony.setchannel(212);
      sony.setvolume(7); 

      System.out.println("the tv is"+ sony.geton() + 
                         "the tv is" + sony.getchannel() +
                         "the tv is"+sony.getvolumelevel());
    sony.volumeDown(); 
    System.out.println(sony.getvolumelevel());
    sony.volumeDown();
    System.out.println(sony.getvolumelevel()); 

    sony.turnOff();

  }
}