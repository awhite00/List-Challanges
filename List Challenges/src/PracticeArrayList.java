import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;
public class PracticeArrayList
	{

		public static void main(String[] args)
			{
				ArrayList<Double>temps=new ArrayList<Double>();
				temps.add(97.6);
				temps.add(97.9);
				temps.add(98.1);
				temps.add(98.3);
				temps.add(98.7);
				temps.add(99.2);
				temps.add(99.8);
				temps.add(100.5);
				temps.add(101.4);
				temps.add(102.3);
				
				for (int i=0; i<temps.size(); i++)
					{
					System.out.println(temps.get(i)+ " degrees Fahrenheit");
					}
				int counter=0;
					
				for (int i=0; i<temps.size(); i++)
					if (temps.get(i)>=98.6)
						    {
						    	System.out.println(temps.get(i));
						    	counter++;
						    }
					System.out.println(counter + " People have fevers!");
					for (int i=0; i<temps.size(); i++)
						{
							System.out.println((temps.get(i)-32)/(1.8) + " degrees Celsius");
						}
				
						   temps.remove((98.7));
						   temps.remove(99.2);
						   temps.remove(99.8);
						   temps.remove(100.5);
						   temps.remove(101.4);
						   temps.remove(102.3);
			
					for (int i=0; i<temps.size(); i++)	
						{
							System.out.println(temps.get(i));
							
						}
						System.out.println(temps.get(0)+ " Is the lowest temperature of the healthy people!");
						System.out.println(temps.get(3)+ " Is the highest temperature of the healthy people!");
					}
					
			
			}

	




















