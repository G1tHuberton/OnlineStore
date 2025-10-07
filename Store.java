/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale x
    addItem: adds an item for sale x
    sellItem(itemName): removes the item from the store and adds its price to profit x
    creator(itemName): displays who created the item in question x

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold x
      price for things that are on sale x
      names of creators of movies and books x
      date of birth of book authors x
      date that things are placed on sale x
      duration of movies x
      publisher of books x

    Where these variables are stored and how to name them is up to you!
*/

import java.util.ArrayList;

public class Store
{
// public double test(){
//   String one = "10.50";
//   String two = "15.5";

//   System.out.println(Float.parseFloat(one) + Float.parseFloat(two));
//  return Float.parseFloat(one) + Float.parseFloat(two);
// }

  
  ArrayList<ItemForSale> Items = new ArrayList<>();
  private float profit = 0.0f;


  // pre-condition: Items list is not empty.
  // post-condition: All items in the Items list are printed to the console.
  public void ShowItems(){

    for(int i = 0; i <= Items.size()-1; i++)
      System.out.println(Items.get(i).getName() + " ");

  }

  // pre-condition: newItem is a valid ItemForSale object.
  // post-condition: newItem is added to the Items list.
  public void addItem(ItemForSale newItem){

    Items.add(newItem);

  }

  // pre-condition: item is a valid ItemForSale object that exists in the Items list.
  // post-condition: item is removed from the Items list and its price is added to profit
  public void sellItem(ItemForSale item){

    float counter;

    Items.remove(item);
    counter = Float.parseFloat(item.getPrice());
    profit = profit + counter;
    System.out.println("$" + profit);

  }

  // pre-condition: item is a valid ItemForSale object that exists in the Items list.
  // post-condition: the creator of item is printed to the console.
  public void creator(ItemForSale item){

    System.out.println(item.getcreator());

  }


}
