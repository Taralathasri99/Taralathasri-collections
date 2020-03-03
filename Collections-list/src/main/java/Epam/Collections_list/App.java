package Epam.Collections_list;
import java.util.*;

public class App extends list
{
    public static void main( String[] args )
    {
      List<Integer> l=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,91,10));
      list arrayList=new list();
      Scanner sc=new Scanner(System.in);
      while(true)
      {
    	  System.out.println("Enter the option you want to perform");
    	  System.out.println("1.Add 2.Add at Specific index 3.Display 4.Delete 5.Delete at specific index 6.Fetch 7.Exit");
    	  int choice=sc.nextInt();
    	  if(choice==1 || choice==2 || choice==4)
    	  {
    		 System.out.println("Enter the element");
    		  int element=sc.nextInt();
    		 if(choice==1)
    			 arrayList.Add(l,element);
    		 else if(choice==2)
    		 {
    			 System.out.println("Enter the Position to insert element in list");
    			 int position=sc.nextInt();
    		     arrayList.Add_Atindex(l, element, position);
    		 }
    		 else
    			 arrayList.Delete(l, element); 
    	  }
    	  else if(choice==3)
    		  arrayList.Print(l);
    	  else if(choice==5)
    	  {
    		  System.out.println("Enter the position where you to delete");
    		  int Position =sc.nextInt();
    		  arrayList.Delete_Atindex(l,Position);
    	  }
    	  else if(choice==6)
    	  {
    		  System.out.println("Enter the Position to fetch");
    		  int pos=sc.nextInt();
    		  System.out.println("Element at Given position is : "+arrayList.Fetch(l,pos));
    	  }
    	  else if(choice==7)
    		  break;
      }
      System.out.println("Program completed Sucessfully");
      
    }
}
