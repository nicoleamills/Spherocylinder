import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Project Description.
* Module 1 - Project 1 Test
* @author Nicole Mills - CSPC 1220 - Fall
* @version 08.22.21
*/   
public class SpherocylinderTest {


/** Initialization
* for all tests.
**/
   @Before public void setUp() {
   }


/** A test that test setLabel() and getLabel(). 
**/
   @Test public void setLabelTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertTrue(" ", example1.setLabel(" Medium Example"));
      Assert.assertTrue(" ", example1.getLabel().contains("Medium Example"));
      Assert.assertFalse(" ", example1.setLabel(null));   
   }

/** A test that test setRadius() and getRadius. 
**/
   @Test public void setRadiusTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertTrue(" ", example1.setRadius(0.1));
      Assert.assertTrue(" ", example1.setRadius(0));
      Assert.assertFalse(" ", example1.setRadius(-0.1));
      Assert.assertEquals(" ", 0, example1.getRadius(), .000001);
   }

/** A test that test setCylinderHeight() and
* getCylinderHeight(). **/
   @Test public void setCylinderHeightTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertTrue(" ", example1.setCylinderHeight(0.1));
      Assert.assertTrue(" ", example1.setCylinderHeight(0));
      Assert.assertFalse(" ", example1.setCylinderHeight(-0.1));
      Assert.assertEquals(" ", 0, example1.getCylinderHeight(), .000001);
   }

/** A test that test circumference(). **/
   @Test public void circumferenceTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(" ", 3.141592654, example1.circumference(), .000001);
   }
/** A test that test surfaceArea(). **/
   @Test public void surfaceAreaTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(" ", 3.926990817, example1.surfaceArea(), .000001);
   }

/** A test that test volume(). **/
   @Test public void volumeTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(" ", 0.719948316, example1.volume(), .000001);
   }

/** A test that test toString(). **/
   @Test public void toStringTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertTrue(" ", example1.toString().contains("Small Example"));
   }


/** A test that test getCount(). **/
   @Test public void getCountTest() {
      Spherocylinder.resetCount();
      Spherocylinder example1
         = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2
         = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Assert.assertEquals(" ", 2, example1.getCount());
   }

/** A test that test resetCount(). **/
   @Test public void resetCountTest() {
      Spherocylinder.resetCount();
      Spherocylinder example1
         = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2
         = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      example1.resetCount();
      Assert.assertEquals(" ", 0, example1.getCount());
   }

/** A test that test equals(). **/
   @Test public void equalsTest() {
   
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      String example2 = "hello";   
      Spherocylinder example3 = new Spherocylinder("Medium Example", 0.5, 0.25);
      Spherocylinder example4 = new Spherocylinder("Small Example", 0.2, 0.25);
      Spherocylinder example5 = new Spherocylinder("Small Example", 0.5, 0.22);
      Spherocylinder example6 = new Spherocylinder("Small Example", 0.5, 0.25);
   
      Assert.assertFalse(" ", example1.equals(example2));
      Assert.assertFalse(" ", example1.equals(example3));
      Assert.assertFalse(" ", example1.equals(example4));
      Assert.assertFalse(" ", example1.equals(example5));
      Assert.assertTrue(" ", example1.equals(example6));
   }


/** A test that test hashCode(). **/
   @Test public void hashCodeTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
   
      Assert.assertEquals(" ", 0, example1.hashCode());
   }   

/** A test that test compareTo(). **/
   @Test public void compareToTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2
         = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Spherocylinder example3 = new Spherocylinder("Small Example", 0.5, 0.25);
   
      Assert.assertEquals(" ", 0, example1.compareTo(example3));
      Assert.assertEquals(" ", -1, example1.compareTo(example2));
      Assert.assertEquals(" ", 1, example2.compareTo(example1));
   }

}