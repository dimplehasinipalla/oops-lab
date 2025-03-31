import java.util.Scanner;
class area{
int len;
int bre;
int area;
void  displayarea(int len,int bre){
area=len*bre;
System.out.println("area is "+area);
}
}
class volume extends area{
int height;
int volume;
public int displayvolume(int height){
volume=len*bre*height;
return volume;
}
}
class had{
public static void main(String args[]){
volume obj=new volume();
Scanner sc=new Scanner(System.in);
System.out.println("enter the length");
int len=sc.nextInt();
System.out.println("enter the breadth");
int bre=sc.nextInt();
System.out.println("enter the height");
int height=sc.nextInt();
obj.len=len;
obj.bre=bre;
obj.displayarea(len,bre);
}
}

