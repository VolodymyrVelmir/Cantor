/**
 *
 *  @author Chyrka Volodymyr S13596
 *
 */

package zad1;


import java.util.*;
 

public class Main {

  static List<String> getPricesInPLN(List<String> destinations, double xrate) {
    return ListCreator.collectFrom(destinations)
    		.when(
    			(isWaW) -> (isWaW.startsWith("WAW"))
             ).mapEvery(
            		 (Line) ->{
            		    	String Hh="";
            		    	int  Price=0;
            		    	int indexElement=0;
            	    	    for(String element: Line.split(" ")){  
            	               if( indexElement==1){Hh=element;} 
            	               if(  indexElement==2){Price=(int)(Integer.valueOf(element).intValue()*xrate);}
            	               indexElement++;
            	               if (indexElement>=3){indexElement=0;}
            	    	    }
            	 	   	return "to "+ Hh+" - price in PLN: " +Price; 
                  	   } 
    		);
  }

  

public static void main(String[] args) {
    // Lista destynacji: port_wylotu port_przylotu cena_EUR 
    List<String> dest = Arrays.asList(
      "bleble bleble 2000",
      "WAW HAV 1200",
      "xxx yyy 789",
      "WAW DPS 2000",
      "WAW HKT 1000"
    );
    double ratePLNvsEUR = 4.30;
    List<String> result = getPricesInPLN(dest, ratePLNvsEUR);
    for (String r : result) System.out.println(r);
  }
 
  
 

 
}
