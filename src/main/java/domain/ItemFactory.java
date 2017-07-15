package domain;

public class ItemFactory implements ItemAdmin{

   public Item getItem(String itemType){
      if(itemType == null){
         return null;
      }		
      if(itemType.equalsIgnoreCase("beans")){
         return new BeansItem();
      } else if(itemType.equalsIgnoreCase("coke")){
         return new CokeItem();
      } else if(itemType.equalsIgnoreCase("oranges")){
         return new OrangesItem();
      }
      
      return null;
   }
}
