
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    int capacity=scan.nextInt();
	    int hour=scan.nextInt();
	    
	    int[] newyork_capacity={160,80,40,20,10};
	    int[] newyork_cost={1400,774,450,230,120};
	    String[] newyork_Machine={"8XLarge","4XLarge","2XLarge","XLarge","Large"};
	    
	    int[] indian_capacity={160,40,10};
	    int[] indian_cost={1300,413,140};
	    String[] indian_Machine={"8XLarge","2XLarge","Large"};
	    
	    int[] chine_capacity={160,80,20,10};
	    int[] chine_cost={1180,670,200,110};
	    String[] chine_Machine={"8XLarge","4XLarge","XLarge","Large"};

       optimizer(capacity,hour,newyork_capacity,newyork_cost,"New york",newyork_Machine);
       optimizer(capacity,hour,indian_capacity,indian_cost,"Indian",indian_Machine);
       optimizer(capacity,hour,chine_capacity,chine_cost,"Chine",chine_Machine);
	}
	public static void optimizer(int capacity,int hour,int[] Machine_capacity,int[] Machine_cost,String region,String[] Machine)
    {
        int cost = 0;
        Map<String,String > Process_machine = new HashMap < String,String > ();
        for(int i = 0;i<(Machine_capacity.length);i++)
    {
        if(Machine_capacity[i]<= capacity)
        {
            int no_large=capacity/Machine_capacity[i];
            int new_capacity=capacity%Machine_capacity[i];
            capacity = new_capacity;
            cost=cost+(Machine_cost[i]*no_large);
            Process_machine.put(Machine[i],Integer.toString(no_large));
            
        }
    }
    System.out.println("Region:"+region);
    System.out.println("Total cost:$"+cost*hour);
    System.out.println("Machine:"+Process_machine);
    }
}
    
