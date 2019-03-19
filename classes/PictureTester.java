/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test testKeepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  /** Method to test testKeepOnlyRed */
  public static void testKeepOnlyRed()
  {

  }

  /** Method to test testKeepOnlyGreen */
  public static void testKeepOnlyGreen()
  {

  }

  /** Method to test testNegate */
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.Negate();
    beach.explore();
  }

  /** Method to test testGrayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.Grayscale();
    beach.explore();
  }

  /** Method to test testFixUnderwater */
  public static void testFixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test testMirrorArms */
  public static void testMirrorArms()
  {

  }
  
  /** Method to test testMirrorGull */
  public static void testMirrorGull()
  {

  }

  /** Method to test testMirrorDiagonal */
  public static void testMirrorDiagonal()
  {

  }

  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test testCopy */
  public static void testCopy()
  {

  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  /** Method to test testEdgeDetection2 */
  public static void testEdgeDetection2()
  {

  }

  /** Method to test testChromakey */
  public static void testChromakey()
  {

  }

  /** Method to test testEncodeAndDecode */
  public static void testEncodeAndDecode()
  {

  }

  /** Method to test testGetCountRedOverValue */
  public static void testGetCountRedOverValue(int red)
  {

  }

  /** Method to test testSetRedToHalfValueInTopHalf */
  public static void testSetRedToHalfValueInTopHalf()
  {

  }

  /** Method to test testClearBlueOverValue */
  public static void testClearBlueOverValue(int blue)
  {

  }

  /** Method to test testGetAverageForColumn */
  public static void testGetAverageForColumn(int column)
  {

  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}