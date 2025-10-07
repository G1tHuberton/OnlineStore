public class Book extends ItemForSale
{

    public Book(String name, String price, Author creator, String publishDate) {

        super(name, price, creator, publishDate);

    }

    // pre-condition: publisher is a valid String.
	// post-condition: publisher is returned.
    public String getPublisher() {

        return super.getcreator();
        
    }

    // pre-condition: AuthorBirthDate is a valid String.
	// post-condition: AuthorBirthDate is returned.
    public String getAuthorBirthDate() {

        return super.creator.getBirthdate();

        }



}
