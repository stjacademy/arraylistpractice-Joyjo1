import java.util.ArrayList;

public class MiniLab
{
   
	public static void main(String[] args) {
		ArrayList<Integer> num = getListOfFactors(36);
	    System.out.println(num);
	    keepOnlyCompositeNumbers(num);
	    System.out.println(num);
	}
	
	
  public static ArrayList<Integer> getListOfFactors(int number)
  {
	  ArrayList<Integer>  num = new ArrayList<Integer>();
	  for (int i = 2; i<number; i++) {
		  if (number%i==0) {
			  num.add(i);
		  }
	  }
      return num;
  }
 
  public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
  {
  	  
	  for (int i = 0; i < nums.size();i++) {
		  if (getListOfFactors(nums.get(i)).size()==0) {
			  nums.remove(i);
			  i--;
		  }
	  }
	  
	  
	  
  }
}
