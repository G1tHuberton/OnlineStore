public class Movie extends ItemForSale
{   
    private String length;

    public Movie(String name, String price, Author creator, String publishDate ,String length) {
        super(name, price, creator, publishDate);
        this.length = length;
    }

    public String getlength() {

        return length + " hours";
        
    }



}
