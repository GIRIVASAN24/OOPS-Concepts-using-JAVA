public class Book{
    String title;
    String author;
    boolean isAvailable;
    public void displayDetails(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Available : "+((isAvailable)?"YES":"NO"));
    }
    public void boorowbook(){
        if(isAvailable){
            isAvailable=false;
            System.out.println(title+" has been borrowed.");
        }
        else{
            System.out.println(title+" is currently unavailable.");
        }
    }
    public void returnbook(){
        isAvailable=true;
        System.out.println(title+" has been returned.");
    }
}


public class object {
    public static void main(String[] args)
    {
        Book book2=new Book();
        book2.title="java";
        book2.author="deepan";
        Book book3=new Book();
        book3.title="c++";
        book3.author="deepan s";
        book2.displayDetails();
        book3.displayDetails();
    }
}
