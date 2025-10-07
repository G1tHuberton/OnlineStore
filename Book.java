public class Book extends ItemForSale
{

    public Book(String name, String price, Author creator, String publishDate) {

        super(name, price, creator, publishDate);

    }

    public String getPublisher() {

        return super.getcreator();
        
    }

    public String getAuthorBirthDate() {

        return super.creator.getBirthdate();

        }



}
