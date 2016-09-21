package data;

/**
 * Created by Tom on 9/21/16.
 */
public class stats
{
   private int str;
   private int dex;
   private int con;
   private int intel;
   private int wis;
   private int cha;
   private long Id;

      //this is an Object 'stat'. while the above declarations of variables are private this public object
      // allows them to be grouped and used elsewhere in the program.
   public stats (int str, int dex, int con, int intel, int wis, int cha, long Id)
   {
      this.str = str;
      this.dex = dex;
      this.con = con;
      this.intel = intel;
      this.wis = wis;
      this.cha = cha;
      this.Id =Id;
   }

      // Here are the getters and setters
      // They can be Generated with a right click --> generate ---> Getters and setters
   public int getStr() {
      return str;
   }

   public void setStr(int str) {
      this.str = str;
   }

   public int getDex() {
      return dex;
   }

   public void setDex(int dex) {
      this.dex = dex;
   }

   public int getCon() {
      return con;
   }

   public void setCon(int con) {
      this.con = con;
   }

   public int getIntel() {
      return intel;
   }

   public void setIntel(int intel) {
      this.intel = intel;
   }

   public int getWis() {
      return wis;
   }

   public void setWis(int wis) {
      this.wis = wis;
   }

   public int getCha() {
      return cha;
   }

   public void setCha(int cha) {
      this.cha = cha;
   }

   public long getId() {
      return Id;
   }

   public void setId(long id) {
      this.Id = id;
   }
}
