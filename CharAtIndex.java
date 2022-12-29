//To get character at the given index within the string  


public class CharAtIndex
{
 public static void main(String[] args)
  {
    String str="Java Exercise!";
   System.out.println ("Original String=" +str);
    int index1=str.charAt(0);
    int index2=str.charAt (10);
   System.out.println("the character at position  0 is " +(char)index1);
   System.out.println(" the character at portion 10 is "+(char)index2);
  }
}