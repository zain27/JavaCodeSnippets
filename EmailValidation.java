class EmailValidation
{
   public static void main(String args[])
   {
      String email ="something@somewhere.com"; // change to test out all scenarios
      boolean result = false;      
      int index1 =0; // for @
      int index2 =0; // for .
      int difference=0;
      
      result =  occurence(email,'@');      
      
      if (result)  // if contains @
      {
         result =  occurence(email,'.');      
         if(result) // if contans .
         {
            index1=email.indexOf('@'); 
            index2=email.indexOf('.');  
            if(index1 < index2) // if . after the @
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
      for (int i=0;i<email.length();i++)        
      {
         if(email.charAt(i) == ch)
         {
            ctr++;
         }
      }
      if (ctr == 1)
      {
         return true;
      }
      else 
      {
         return false;
      }
   }
}