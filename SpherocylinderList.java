import java.text.DecimalFormat;
   
/**
* Project Description.
* Module 3 - Project 3
* @author Nicole Mills - CSPC 1220 - Fall
* @version 10.29.21
*/  

public class SpherocylinderList {

// instance fields
   private String name;
   private Spherocylinder[] sArray;
   private int numOfObjects;


   // constructor
   /**
   * Constructor.
   * @param nameIn for name.
   * @param sArrayIn for sphero array.
   * @param numOfObjectsIn for num.
   */
   public SpherocylinderList(String nameIn, Spherocylinder[] sArrayIn,
      int numOfObjectsIn) {
      this.name = nameIn;
      this.sArray = sArrayIn;
      this.numOfObjects = numOfObjectsIn;
   }

// methods
/**
    * Description.
    * @return name.
   */
   public String getName() {
      return name;
   }
   
   /**
    * Description.
    * @return num of spheros.
   */
   public int numberOfSpherocylinders() {
      int num = numOfObjects;
      return num;
   
   }
   
   /**
    * Description.
    * @return total.
   */
   public double totalSurfaceArea() {
      double total = 0;
      int i = 0;
      while (i < numOfObjects) {
         total += sArray[i].surfaceArea();
         i++;
      }
      return total;
      
   }
   
   /**
    * Description.
    * @return total.
   */
   public double totalVolume() {
      double total = 0;
      for (int i = 0; i < this.numOfObjects; i++) {
         total += this.sArray[i].volume();
      }
      return total;
   }
   
   /**
    * Description.
    * @return avg surface ares.
   */
   public double averageSurfaceArea() {
      return (totalSurfaceArea() / this.numOfObjects);
   }
   
   /**
    * Description.
    * @return avg volume.
   */
   public double averageVolume() {
      return (totalVolume() / this.numOfObjects);
   }
   
   /**
    * Description.
    * @return string.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      return "----- Summary for " + this.name + " -----\n"
         + "Number of Spherocylinders: " 
         + numberOfSpherocylinders() + "\n"
         + "Total Surface Area: " 
         + df.format(totalSurfaceArea()) + "\n"
         + "Total Volume: " 
         + df.format(totalVolume()) + "\n"
         + "Average Surface Area: " 
         + df.format(averageSurfaceArea()) + "\n"
         + "Average Volume: " 
         + df.format(averageVolume());
   }
   
   /**
    * Description.
    * @return list.
   */
   public Spherocylinder[] getList() {
      return sArray;
   }
   
   /**
    * Description.
    * @param labelIn for label.
    * @param radiusIn for radius.
    * @param cylinderHeightIn for cyl height.
   */
   public void addSpherocylinder(String labelIn, double radiusIn, 
      double cylinderHeightIn) {
      Spherocylinder s = new Spherocylinder(labelIn, radiusIn,
         cylinderHeightIn);
      sArray[numOfObjects] = s;
      numOfObjects++;
   }
   
   /**
    * Description.
    * @param labelIn for label.
    * @return sphero.
   */
   public Spherocylinder findSpherocylinder(String labelIn) {
      Spherocylinder random = new Spherocylinder("", 0, 0);
      boolean find = false;
      for (int i = 0; i < numOfObjects; i++) {
         if (sArray[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            random = sArray[i];
            find = true;
         }
      }
      if (find) {
         return random;
      }
      else {
         return null;
      }
   }
   
   /**
    * Description.
    * @param labelIn for label.
    * @return sphero.
   */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder random = findSpherocylinder(labelIn);
      for (int i = 0; i < numOfObjects; i++) {
         if (sArray[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            random = sArray[i];
            for (int n = i; n < numOfObjects - 1; n++) {
               sArray[n] = sArray[n + 1];
            }
            sArray[numOfObjects - 1] = null;
            numOfObjects--;
            break;
         }
      
      }
      return random;
   }
   
   /**
    * Description.
    * @param labelIn for label.
    * @param radiusIn for radius.
    * @param cylinderHeightIn for cyl height.
    * @return sphero.
   */
   public boolean editSpherocylinder(String labelIn, double radiusIn,
      double cylinderHeightIn) {
      boolean edit = false;
      for (int i = 0; i < numOfObjects; i++) {
         if (sArray[i].getLabel().toUpperCase()
               .equals(labelIn.toUpperCase())) {
            sArray[i].setRadius(radiusIn);
            sArray[i].setCylinderHeight(cylinderHeightIn);
            edit = true;
         }
      }
      return edit;
   }
   
   /**
    * Description.
    * @return sphero.
   */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      if (numOfObjects > 0) {
         Spherocylinder largest = sArray[0];
         for (int i = 0; i < numOfObjects; i++) {
            if (sArray[i].volume() > largest.volume()) {
               largest = sArray[i];
            }
         }
         return largest;
      }
      
      else {
         return null;
      }
   }

}