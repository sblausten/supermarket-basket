package domain;

public class ItemFactory {

   public Item getItem(String itemType){
      if(itemType == null){
         return null;
      }		
      if(itemType.equalsIgnoreCase("beans")){
         return new Beans();
      } else if(itemType.equalsIgnoreCase("coke")){
         return new Coke();
      } else if(itemType.equalsIgnoreCase("oranges")){
         return new Oranges();
      }
      
      return null;
   }
}
