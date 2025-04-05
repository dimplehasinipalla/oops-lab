class animal{
String sound;
animal(String sound){
this.sound=sound;
}
void makesound(){
System.out.println("animal makes sound;"+sound);
}
}
class dog extends animal{
String breed;
dog(String sound,String breed){
super(sound);
this.breed=breed;
}
void displayinfo(){
System.out.println("dog breed"+breed);
}
}
class mm{
public static void main(String[] args){
dog obj=new dog("woof","Labrador");
obj.makesound();
Obj.displayinfo();
}
}