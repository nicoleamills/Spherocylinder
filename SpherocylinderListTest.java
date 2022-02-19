import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
* Comparable Interface Tests.
* Module 3 - Project 3 Test
* @author Nicole Mills - CSPC 1220
* @version 10.31.21
*/ 

public class SpherocylinderListTest {

/** Initialization
* for all tests.
**/
   @Before public void setUp() {
   }
   
/** A test for getting name. 
*/
   @Test public void getNameTest() {
      Spherocylinder[] s = new Spherocylinder[50];
      s[0] = new Spherocylinder("test", 1.0, 2.0);
      s[1] = new Spherocylinder("test2", 1.0, 2.0);
      s[2] = new Spherocylinder("test3", 1.0, 2.0);
         
      SpherocylinderList list = new SpherocylinderList("Test list", s, 3);
      
      Assert.assertEquals("Test list", list.getName());
   }
   
   /**
   *Test for number of spheros.
   */
   @Test public void getNumberOfSpherocylindersTest() {
      Spherocylinder[] s = new Spherocylinder[50];
      s[0] = new Spherocylinder("test", 1.0, 2.0);
      s[1] = new Spherocylinder("test2", 1.0, 2.0);
      s[2] = new Spherocylinder("test3", 1.0, 2.0);
      
      SpherocylinderList list = new SpherocylinderList("Test list", s, 2);
      
      Assert.assertEquals(2, list.numberOfSpherocylinders());
   
   }
   
   /**
   *Test for total surface area.
   */
   @Test public void getTotalSurfaceAreaTest() {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 1, 2);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 1, 2);
      
      SpherocylinderList list = new SpherocylinderList("test list", s, 3);
      
      Assert.assertEquals("totalSurfaceArea Test",
                           75.3982, list.totalSurfaceArea(), .0001);
   }
   
   /**
   *Test for totalVolume.
   */
   @Test public void totalVolume()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 1, 2);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 1, 2);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
      
      Assert.assertEquals("totalVolume Test",
                           31.4159, sList.totalVolume(), .0001);
   }
   
   /**
   *Test for average surface area.
   */
   @Test public void averageSurfaceArea()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 1, 2);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 1, 2);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
      Assert.assertEquals("averageSurfaceArea Test", 25.1327, 
         sList.averageSurfaceArea(), .0001);
                           
   }
   
   /**
   *Test for averageVolume.
   */
   @Test public void averageVolume()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 1, 2);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 1, 2);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
      Assert.assertEquals("averageVolume Test",
                           10.4719, sList.averageVolume(), .0001);
   }
   
   /**
   *Test for toString.
   */
   @Test public void toStringTest()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 1, 2);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 1, 2);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
   
      Assert.assertEquals("toString test", 
                           true, 
                           sList.toString().contains("----- Summary for "));
   }
   

   /**
   *Test for getList.
   */
   @Test public void getList()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 1, 2);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 1, 2);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
      
      Assert.assertArrayEquals("getList Test",
                           s, sList.getList());
   }
   
   /**
   *Test for addSpherocylinder.
   */
   @Test public void addSpherocylinder()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 8, 3);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 7, 4);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
      
      Spherocylinder s2 = new Spherocylinder("test4", 1, 2);
      sList.addSpherocylinder("test4", 1, 2);
      Spherocylinder[] sA = sList.getList();
      
      Assert.assertEquals("addSpherocylinder Test",
                           s2, sA[3]);
   }
   
   /**
   *Test for findSpherocylinder.
   */
   @Test public void findSpherocylinder()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 8, 3);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 7, 4);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
      Spherocylinder s2 = new Spherocylinder("test", 8, 3);
      
      Assert.assertEquals("findSpherocylinder true Test",
                           s2, sList.findSpherocylinder("test"));
                           
      Assert.assertEquals("findSpherocylinder false Test",
                           null, sList.findSpherocylinder("false"));
   
   }
   
   /**
   *Test for deleteSpherocylinder.
   */
   @Test public void deleteSpherocylinder()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 8, 3);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 7, 4);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
      
      Spherocylinder s2 = new Spherocylinder("test4", 1, 2);
      Spherocylinder s3 = new Spherocylinder("test", 8, 3);
      sList.addSpherocylinder("test4", 1, 2);
      Spherocylinder[] sA = sList.getList();
      
      Assert.assertEquals("pre deleteSpherocylinder Test",
                           s2, sA[3]);         
   
      Assert.assertEquals("deleteSpherocylinder true Test",
                           s3, sList.deleteSpherocylinder("test"));
   
      Assert.assertEquals("deleteSpherocylinder true Test",
                           s2, sA[2]);
   
      Assert.assertEquals("deleteSpherocylinder false Test",
                           null, sList.deleteSpherocylinder("false"));
   }
   
   
   /**
   *Test for editSpherocylinder.
   */
   @Test public void editSpherocylinder()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 8, 3);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 7, 4);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
      Spherocylinder s2 = new Spherocylinder("test", 8, 3);
      Spherocylinder s3 = new Spherocylinder("test", 9, 7);
      Spherocylinder[] sA = sList.getList();
      
      Assert.assertEquals("pre editSpherocylinder Test",
                           s2, sA[0]);
      Assert.assertEquals("editSpherocylinder true Test",
                           true, sList.editSpherocylinder("test", 9, 7));
      Assert.assertEquals("editSpherocylinder true Test",
                           s3, sA[0]);
      Assert.assertEquals("findSpherocylinder false Test",
                           false, sList.editSpherocylinder("false", 9, 7));
   }
   
   
   /**
   *Test for findSpherocylinderWithLargestVolume.
   */
   @Test public void findSpherocylinderWithLargestVolume()
   {
      Spherocylinder[] s = new Spherocylinder[20];
      s[0] = new Spherocylinder("test", 7, 4);
      s[1] = new Spherocylinder("test2", 1, 2);
      s[2] = new Spherocylinder("test3", 8, 3);
      
      Spherocylinder s2 = new Spherocylinder("test", 7, 4);
      Spherocylinder s3 = new Spherocylinder("test2", 1, 2);
      Spherocylinder s4 = new Spherocylinder("test3", 8, 3);
      
      SpherocylinderList sList = new SpherocylinderList("test list", s, 3);
      Assert.assertEquals("findSpherocylinderWithLargestVolumeTrueTest",
                           s4, 
                           sList.findSpherocylinderWithLargestVolume());
                           
      SpherocylinderList sList2 = new 
         SpherocylinderList("test list", null, 0);
      Assert.assertEquals("findSpherocylinderWithLargestVolumeFalseTest",
                           null, 
                           sList2.findSpherocylinderWithLargestVolume());
   }

}