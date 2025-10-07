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

    public String getName() {

        return name;
        
    }

    public String getPublishDate(){

        return publishDate;

    }

    public String getPrice() {

        return price;

    }

    public String getcreator() {

        return creator.getName();

    }


}
