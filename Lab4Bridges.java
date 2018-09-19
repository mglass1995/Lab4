import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;

public class Lab4Bridges {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "glassme2", "1507847396278");

	    /* Set an assignment title */
	    bridges.setTitle("Matthew Glass");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    arr.getElement(0).setValue (0);
       for (int i = 1; i < arr.getSize(); i++){
       arr.getElement(i).setValue(i*i);
       arr.getElement(i).setLabel(String.valueOf(i*i));
       }
	    /* set the value as a Label */
	    arr.getElement(0).setLabel(String.valueOf(0));
       
       /* colorize array elements*/
      arr.getElement(0).getVisualizer().setColor("red"); 
      arr.getElement(1).getVisualizer().setColor("orange");
      arr.getElement(2).getVisualizer().setColor("yellow");
	   arr.getElement(3).getVisualizer().setColor("green");
      arr.getElement(4).getVisualizer().setColor("cyan");
	   arr.getElement(5).getVisualizer().setColor("blue");
      arr.getElement(6).getVisualizer().setColor("purple");
	   arr.getElement(7).getVisualizer().setColor("red");
      arr.getElement(8).getVisualizer().setColor("orange");
	   arr.getElement(9).getVisualizer().setColor("yellow"); 
	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}
