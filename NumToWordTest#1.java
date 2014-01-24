public class NumToWord
    {
        public static void main (String [] args)
        {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integar between 0 and 9999 : ");
        int num =scan.nextInt();
        TransforToText(num);
        System.out.println (TransformToText());
        }
      
            public static String TransformToText(int num)
            {
            static String[] units = { "Zero", "One", "Two", "Three",
                    "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                    "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                    "Seventeen", "Eighteen", "Nineteen"};

             static String[] tens = { "", "", "Twenty", "Thirty", "Forty",
                    "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

               if (num < 20)
               {
               return units[num];
               }

               if (num < 100)
               {
               return tens[num / 10] + ((num % 10 > 0) ? " " + TransformToText(num % 10) : ""); // Testing use of Ternary
               }                                                                                // Operator

               if (num < 1000)
               {
               return units[num / 100] + " Hundred"
                       + ((num % 100 > 0) ? " and " + TransformToText(num % 100) : "");
               }

               if (num < 1000000)
               {
               return TransformToText(num / 1000) + " Thousand "
                       + ((num % 1000 > 0) ? " " + TransformToText(num % 1000) : "");
               }
             }

         return TransformToText(num/ 1000000) + " Million "+ ((num % 1000000 > 0) ? " " + TransformToText(num % 1000000) : "");
     }
}
    



