/*
Rules: 
Email addresses must contain only one (@)  and one (.), which must come after the @
At least one character in the email address must be present before the (@), between the @ and the (.), and after the period

 */

class EmailValidation
{
   public static void main(String args[])
   {
      String email ="something@somewhere.com"; // change to test out all scenarios
      boolean result = false;      
      int index1 =0; // for index of @
      int index2 =0; // for index of .
      int difference=0;
      
      result =  occurence(email,'@');      
      
      if (result)  // if contains @ then proceed to validate further
      {
         result =  occurence(email,'.');      
         if(result) // if contans .
         {
            index1=email.indexOf('@'); 
            index2=email.indexOf('.');  
            if(index1 < index2) // if . after the @ then proceed to validate further
            {
               difference =index2 -index1;
               if(index1==0) // if starts with @ 
               {
                  System.out.println("Email cannot start with @");                  
               }
               else if(difference==1)// if . after @
               {
                  System.out.println("There must be at least one character between the @ and .");                                 
               }
               else if (index2 == (email.length()-1)) // if ends with . 
               {
                  System.out.println("Email cannot end with a . msut have at least one character after .");                                    
               }
               else // if correct ! 
               {
                  System.out.println("Email Validated");                                    
               }
            }
            else
            {
               System.out.println(". must be after the @");
            }        
         }
         else
         {
            System.out.println("One . must be present");
         }
      }
      else
      {
         System.out.println("One @ must be present");
      }
      

     
   }
   
   public static boolean occurence(String email,char ch)
   {
      int ctr=0;
      int loopCounter=0;
      int index=0;
      for (int i=0;i<email.length();i++)   // loop through the entire string and count the number of times the characters match.     
      {
         if(email.charAt(i) == ch)
         {
            ctr++;
         }
      }
      if (ctr == 1) // if one match return true
      {
         return true;
      }
      else // if anything but 1, return false.
      {
         return false;
      }
   }
}
