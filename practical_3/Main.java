/*
name : Reuel Bodhak
PRN NO : 32658010086
DIV : C
*/

class Book {
    String title,author;
    double price;

    public Book(String t,String a,double p){
        this.title = t;
        this.author = a;
        this.price = p;
    }

    void display(){
        System.out.println("=========== Book Details ====================");
        System.out.println("Book Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("===============================================");
    }
}

public class Main{
    public static void main(String []args){
        Book b1 = new Book("Let Us Java", " Yashavant Kanetkar ", 399.00);
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 299.50);
        b1.display();
        b2.display();
    }
}