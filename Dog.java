class shape{
public double getArea(){
return 0.0;
}
}
class rectangle extends shape{
double length;
double breadth;
public rectangle(double length,double breadth){
this.length = length;
this.breadth = breadth;
}

@Override
public double getArea(){
return length*breadth;
}
}
public class Dog{
public static void main(String args[]){
rectangle obj=new rectangle(2.0,2.0);
shape s = new shape();
System.out.println(s.getArea());
System.out.println(obj.getArea());
}
}



