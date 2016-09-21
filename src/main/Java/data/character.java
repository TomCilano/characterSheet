package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 9/21/16.
 */
public class character {
   //declare strings
   private String name;
   private String race;
   private String type;

   // declare object... method
   public character(String name, String race, String type)
   {

       this.name = name;
       this.race = race;
       this.type = type;
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
}
