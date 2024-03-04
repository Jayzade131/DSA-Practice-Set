package LinearSearchAlogrithm;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {


            String str="jaykumar";
            char taget='k';
           boolean ans= searchInString(str,taget);
        System.out.println(ans);
}

           static boolean searchInString(String str,char target)
           {
               if(str.isEmpty())
               {
                   return false;
               }
               for (char ch : str.toCharArray())
               {
                   if(ch==target)
                   {
                       return true;
                   }
               }
               return false;
           }
}