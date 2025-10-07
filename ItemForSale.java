public class ItemForSale{
    protected String name;
    protected String price;
    protected Author creator;
    protected String publishDate;

    public ItemForSale(String name, String price, Author creator, String publishDate) {

        this.name = name;
        this.price = price;
        this.creator = creator;
        this.publishDate = publishDate;

    }

    // pre-condition: name is a valid String.
    // post-condition: name is returned.
    public String getName() {

        return name;
        
    }

    // pre-condition: publishDate is a valid String.
    // post-condition: publishDate is returned.
    public String getPublishDate(){

        return publishDate;

    }

    // pre-condition: price is a valid String.
    // post-condition: price is returned.
    public String getPrice() {

        return price;

    }

    // pre-condition: creator is a valid Author object.
    // post-condition: creator's name is returned.
    public String getcreator() {

        return creator.getName();

    }


}
