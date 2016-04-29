import java.util.ArrayList;
public class Introtoarrays
	{

		public static void main(String[] args)
			{
				double sum=0;
				double average=0;
		
				ArrayList<Double>numbers=new ArrayList<Double>();
				numbers.add(5.1);
				numbers.add(3.6);
				numbers.add(10.0);
				numbers.add(0.1);
				numbers.add(5.5);
				
				for (int i=0; i<numbers.size(); i++)
					{
						sum=(double) (sum + (numbers.get(i)));
						
					}
					
				System.out.println("The sum of these numbers is "+sum);
				
				numbers.remove(0);
				numbers.add(1.2);
				numbers.add(3.8);
				for (int i=0; i<numbers.size(); i++)
					{
						sum=(double) (sum + (numbers.get(i)));
						average= sum/ (numbers.size());
					}
				System.out.println("The average of these numbers is "+ average);
			}

	}
