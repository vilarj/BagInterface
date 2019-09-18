package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 
 * @author jimenezc1
 *
 */
public class Lab1test {

	public static void main(String[] args) {
		ResizableArrayBag <String> bag1 = new ResizableArrayBag <> ();
		ResizableArrayBag <String> bag2 = new ResizableArrayBag <> ();
//		ResizableArrayBag <String> bag3 = new ResizableArrayBag <> ();
		
		try {
		File tigers = new File ("tigers.txt");
		
		Scanner sc = new Scanner (tigers);
		
		ResizableArrayBag <String> u, i;
		
		while  (sc.hasNext())
			bag1.add(sc.nextLine());
		sc.close();
		File lions = new File ("lions.txt");
		sc = new Scanner (lions);
		
		while  (sc.hasNext())
			bag2.add(sc.nextLine());
		
		sc.close();
		
		u = bag1.union (bag2);
		i = bag2.intersection (bag1);
		//System.out.println(bag3.intersection(bag2));
		
		Object [] s_u = u.toArray();
		Object [] s_i = i.toArray();
		
		System.out.print("====Union====\n");
		for (Object w : s_u)
			System.out.println (w);
		System.out.println ("====Intersection====");
		for (Object w : s_i)
			System.out.println (w);
//		System.out.println("====Lioness Intersection====");
//		for(Object w : s_l)
//			System.out.println(w);
		
		// check whether the bags were intact.
		Object [] tigerlist = bag1.toArray();
		Object [] lionlist = bag2.toArray();
//		Object [] lionesslist = bag3.toArray();
		
		System.out.println ("=== testing consistency ======Tigers====");
		
		for (Object o: tigerlist)
			System.out.println (o);
	
		System.out.println ("=== testing consistency ======Lions====");
		for (Object o: lionlist)
			System.out.println (o);
				
//		System.out.println ("=== testing consistency ======Lioness====");
//		for (Object o: lionesslist)
//			System.out.println (o);
		}
		
		catch (FileNotFoundException ex) {
			System.out.println ("tigers.txt not found");
		}
	}

}
