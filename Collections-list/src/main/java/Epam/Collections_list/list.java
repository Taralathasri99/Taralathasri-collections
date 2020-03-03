package Epam.Collections_list;
import java.util.*;

 class list {
	 public void Add(List<Integer> l,int element)
	 {
		 l.add(element);
	 }
	 public void Add_Atindex(List<Integer> l,int element,int position)
	 {
		 l.add(position,element);
	 }
	 public void Print(List<Integer> l)
	 {
		 System.out.println("List is: "+l);
	 }
	 public void Delete(List<Integer> l,int element)
	 {
		 if(l.isEmpty())
		 {
			 System.out.println("List is Empty so deletions can't be done");
		 }
		 else
		 {
			 if(l.contains(element))
				 l.remove(l.indexOf(element));
			 else
				 System.out.println("Element is not present in the List");
		 }
			 
	 }
	 public void Delete_Atindex(List<Integer> l,int position)
	 {
		 l.remove(position);
	 }
	 public int Fetch(List<Integer> l,int position)
	 {
		 return l.get(position);
	 }

}
