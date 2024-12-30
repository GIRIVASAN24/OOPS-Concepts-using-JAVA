class Parameterized{
int number;
String name;
public Parameterized(int number,String name){
this.number=number;
this.name=name;
}
public void display(){
System.out.println("Number : "+number+" "+"Name : "+name);
}
}
class Mains
{
public static void main(String args[]){
Parameterized obj=new Parameterized(067,"Harirajan");
obj.display();
}
}

