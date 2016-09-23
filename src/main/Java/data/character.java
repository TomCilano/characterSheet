package data;

/**
 * Created by Tom on 9/21/16.
 */
public class character {
   //declare strings
   private String name;
   private String race;
   private String type;
   private long id;


   public character(String name, String race, String type, long id)
   {

      this.name = name;
      this.race = race;
      this.type = type;
      this.id = id;
   }


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getRace() {
      return race;
   }

   public void setRace(String race) {
      this.race = race;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public void setId(long id) {
      this.id = id;
   }
   public long getId() {
      return id;
   }
}
