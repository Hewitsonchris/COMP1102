public class NumToWord
{
        public static String numToWord(Integer num)
        {
            final  String[] units = { "Zero", "One", "Two", "Three",
               "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
               "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
               "Seventeen", "Eighteen", "Nineteen"};

            final   String[] tens = { "", "", "Twenty", "Thirty", "Forty",
               "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

                   if (num < 20)
                   {
                   return units[num];
                   }

                   if (num < 100)
                   {
                   return tens[num / 10] + ((num % 10 > 0) ? " " + numToWord(num % 10) : "");
                   }

                   if (num < 1000)
                   {
                   return units[num / 100] + " Hundred"
                           + ((num % 100 > 0) ? " and " + numToWord(num % 100) : "");
                   }

                   if (num < 1000000)
                   {
                   return numToWord(num / 1000) + " Thousand "
                           + ((num % 1000 > 0) ? " " + numToWord(num % 1000) : "");
                   }

           return numToWord(num/ 1000000) + " Million "+ ((num % 1000000 > 0) ? " " + numToWord(num % 1000000) : "");
        }  
    
}
