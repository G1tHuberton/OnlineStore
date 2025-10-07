import java.util.ArrayList;

public class Author
{

    private String name;
    private String BirthDate;
   

  public Author(String name, String BirthDate) {

        this.name = name;
        this.BirthDate = BirthDate;

    }

    // pre-condition: name is a valid String.
	// post-condition: name is returned.
    public String getName() {

        return name;

    }

    // pre-condition: Birthdate is a valid String.
	// post-condition: Birthdate is returned.
    public String getBirthdate() {

        return BirthDate;

    }

}
