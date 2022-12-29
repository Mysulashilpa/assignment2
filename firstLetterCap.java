// To convert all words first letter into capital for given string

public class firstLetterCap
{
     public static void main(String[] args)
      {
	    String str = "java standard edition";
	    String words[]=str.split("\\s");
                String newString ="";
        
              for(String w: words)
          {
             String first = w.substring(0,1);     
             String rest = w.substring(1);        
             newString+=first.toUpperCase()+ rest+ " ";  
           }  
           System.out.println(newString.trim()); 
       }
}