import java.text.DecimalFormat;

 /**
* Project Description.
* Module 2 - Project 2
* @author Nicole Mills - CSPC 1220 - Fall
* @version 11.04.21
*/   

public class Spherocylinder
   implements Comparable<Spherocylinder> {

//instance variables
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;
   private static int count = 0;

//constructor
/**
* Constructor.
* @param labelIn for label input.
* @param radiusIn for radius input.
* @param cylinderHeightIn for cylinder input.
*/
   public Spherocylinder(String labelIn, double radiusIn,
      double cylinderHeightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
      count++;
   }

//methods
/**
* Description.
* @return label
*/
   public String getLabel() {
      return label;
   }
/**
* Description.
* @param labelIn for label input.
* @return true if input.
*/
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }

/**
* Description.
* @return radius.
*/
   public double getRadius() {
      return radius;
   }
/**
* Description.
* @param radiusIn for radius input.
* @return true if input.
*/
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn >= 0) {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }   


/**
* Description.
* @return cylinderHeight.
*/
   public double getCylinderHeight() {
      return cylinderHeight;
   }
/**
* Description.
* @param cylinderHeightIn for cylinder height.
* @return true if input.
*/
   public boolean setCylinderHeight(double cylinderHeightIn) {
      boolean isSet = false;
      if (cylinderHeightIn >= 0) {
         cylinderHeight = cylinderHeightIn;
         isSet = true;
      }
      return isSet;
   }


/**
* Description.
* @return circumference of the cylinder.
*/
   public double circumference() {
   
      double result = 2 * Math.PI * radius;
      return result;
   }

/**
* Description.
* @return finalResult of surface area.
*/
   public double surfaceArea() {
      double result1 = 2 * Math.PI * radius;
      double result2 = 2 * radius + cylinderHeight;
      double finalResult = result2 * result1;
      return finalResult;
   }


/**
* Description.
* @return finalResult of volume.
*/
   public double volume() {
      double result1 = 4.0 / 3 * radius + cylinderHeight;
      double result2 = Math.PI * Math.pow(radius, 2);
      double finalResult = result2 * result1;
      return finalResult;
   }

/**
* Description.
* @return String for UserInfo.
*/
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
   
      String output = "Spherocylinder " + "\"" + label + "\""
         + " with radius "
         + radius + " and cylinder height "
         + cylinderHeight
         + " has:\n\t";
      output += "circumference = " + df.format(circumference())
         + " units\n";
      output += "\tsurface area = " + df.format(surfaceArea())
         + " square units\n";
      output += "\tvolume = " + df.format(volume())
         + " cubic units";
      return output;
   }

/**
* Description.
* @return count for instantiated amount.
*/
   public static int getCount() {
      return count;
   }

/**
* Description.
* reset loans created to 0.
*/
   public static void resetCount() {
      count = 0;
   }

/**
* Description.
* @param obj to replace old cylinderHeight.
* @return true if input.
*/
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(radius - d.getRadius()) < .000001
            && Math.abs(cylinderHeight - d.getCylinderHeight())
            < .000001);
      }
   }
/**
* Description.
* Checkstyle requires it.
* @return 0
*/
   public int hashCode() {
      return 0;
   }

/**
* Description.
* Compare volume of Spherocylinder.
* @param other representing other Spherocylinder
* @return 0 if this Spherocylinder is less than the other
*/
   public int compareTo(Spherocylinder other) {
   //if the two volumes are essentially equal
      if (Math.abs(this.volume() - other.volume()) < 0.00001) {
         return 0;
      }
      //this.volume() is less than the parameter’s volume
      else if (this.volume() < other.volume()) {
         return -1;
      }
      //if this.volume() is greater than the parameter’s volume
      else {
         return 1;
      }
   
   }
}