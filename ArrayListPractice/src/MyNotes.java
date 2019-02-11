import java.util.ArrayList;

public class MyNotes {

	public static void main(String[] args) {
		/*
        int[] grades = new int[2];
        
        grades[0] = 100;
        grades[1] = 99;
        
        for (int i = 0; i<grades.length; i++)
        System.out.println(grades[i]);
        
        an example of the array we learned before
        
        */
		
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		grades.add(100);
		grades.add(99);
		grades.add(100);
		grades.add(99);
		//System.out.println(grades);
		//System.out.println("I removed the " + grades.remove(0));
		//grades.remove(0);   (this will remove the remove from the remove before)
		//grades.add(1,98);
		//System.out.println(grades);
		
		//grades.set(2,57);
		System.out.println(grades);
		
		for (int i = 0; i<grades.size(); i++)
			System.out.println(grades.get(i));
		
        //never work arraylist with []
		
		for (Integer num : grades)
		{
			System.out.println(num);
			//grades.remove(grades.get(0));    *  wrong thing
		}
	}

}
