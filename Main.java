
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args){

      Store store = new Store();
      
    //Creating a book and a movie object to test the classes
      Book b1 = new Book("The Great Gatsby", "10.50", new Author("F. Scott Fitzgerald", "September 24, 1896"), "April 10, 1925");
      Movie m1 = new Movie("Inception", "15.50", new Author("Christopher Nolan", "July 30, 1970"), "July 13, 2010","2.5");
     System.out.println( m1.getName());
      System.out.println(m1.getPrice());
      System.out.println(m1.getcreator());
      System.out.println(m1.getlength());
      System.out.println(m1.getPublishDate());
      System.out.println(b1.getName());
      System.out.println(b1.getPrice());
      System.out.println(b1.getcreator());
      System.out.println(b1.getPublisher());
      System.out.println(b1.getAuthorBirthDate());
      System.out.println(b1.getPublishDate());
      store.addItem(m1);
      store.addItem(b1);
      store.ShowItems();
      store.creator(m1);
      store.creator(b1);
      store.sellItem(b1);
      store.sellItem(m1);


          }
        }  
