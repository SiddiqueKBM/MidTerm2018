package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {

		Queue<String> students=new LinkedList<String>();
		students.add("Pamela Anderson");
		students.add("Shahruk Khan");
		students.add("Hasan Raja");
		students.add("Mafi Bhai");
		students.remove();
		students.peek();
		students.poll();

		Iterator it=students.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(String ami: students){
			System.out.println("Remove names  :"+students.remove()+" Peek Names :"+students.peek()+" Poll Names :"+students.poll());

		}

		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

	}

}
