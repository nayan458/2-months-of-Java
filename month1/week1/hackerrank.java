public class hackerrank{

    // Introduction (10/06/24)
    
    public static void main(String arg[])
     {
    // //     System.out.println("Hello, World.");
    // //     System.out.println("Hello, Java.");

    // /***************************************************************************************************************************************** */
    //  Scanner scan = new Scanner(System.in);      // To read inputs
    //     int i = scan.nextInt();      
    //     double d = scan.nextDouble();
    //     scan.nextLine();                     // Have to used afteer scan.nextInt() to consume next line
    //     String s = scan.nextLine();
    //     // Write your code here.

    //     System.out.println("String: " + s);
    //     System.out.println("Double: " + d);
    //     System.out.println("Int: " + i);

    /***************************************************************************************************************************************** */
            
            // for(int i=0;i<3;i++){
            //     String s1=sc.next();
            //     int x=sc.nextInt();
            //     //Complete this line
            //     if(x>99)
            //         System.out.printf("%-15s%3d%n",s1,x);      
            //     else if(x>9)
            //         System.out.printf("%-15s0%2d%n",s1,x);
            //     else 
            //         System.out.printf("%-15s00%1d%n",s1,x);
            // }
            //output-
            // java           100 
            // cpp            065 
            // python         050 

/********************************************************************************************************************************* */
   //To find the day of the week if a date is given using 'Zellers Congruence'
    // public static String findDay(int month, int day, int year) {
    //     int k,j,h,a,b,c;
    //     String d;
    //     if(month < 3){           //(for leap year) count jan & feb as month 13 & 14 of prev year
    //         month += 12;
    //         year -= 1;
    //     } 
    //     k=year%100;              //year of that century  eg 2024%100=24th year 
    //     j=year/100;              //which century it is  eg 2024/100=20th century
    //     double m = month;
    //     a= (int)Math.floor((13*(m+1))/5);
    //     b= (int) Math.floor(k/4);
    //     c= (int) Math.floor(j/4);
    //     h=(day+ a + k + b + c - 2*j)% 7;     //formula
    //        if (h < 0) {                      //if h is -ve  eg. h=-1+7=6 which is friday
    //         h += 7;
    //     }
    //     //System.out.println(day +"+"+a +"+"+k+"+"+ b+ "+"+ c+ "-"+ 2*j);
    //     switch(h){
    //         case 0: d="SATURDAY";
    //                 break;
    //         case 1: d="SUNDAY";
    //                 break;
    //         case 2: d="MONDAY";
    //                 break;
    //         case 3: d="TUESDAY";
    //                 break;
    //         case 4: d="WEDNESDAY";
    //                 break;
    //         case 5: d="THURSDAY";
    //                 break;
    //         case 6: d="FRIDAY";
    //                 break;
    //         default: d="Invalid";
    //     } 
    //     return d;
    // }

/********************************************************************************************************************************* */

//converts a number into a country's currency format
      /*   Scanner scanner = new Scanner(System.in);
         double payment = scanner.nextDouble();
         scanner.close(); 
         // Write your code here.
         String us,india, china, france;
         Locale INDIA= new Locale("en","IN");   //creates new currency since india is not default, uses english 'en'
         final NumberFormat usf= NumberFormat.getCurrencyInstance(Locale.US);  //to format a number
         us= usf.format(payment);
         final NumberFormat inf= NumberFormat.getCurrencyInstance(INDIA);
         india= inf.format(payment);
         final NumberFormat chf= NumberFormat.getCurrencyInstance(Locale.CHINA);
         china= chf.format(payment);  
         final NumberFormat frf= NumberFormat.getCurrencyInstance(Locale.FRANCE);
         france= frf.format(payment);
         System.out.println("US: " + us);
         System.out.println("India: " + india);
         System.out.println("China: " + china);
         System.out.println("France: " + france);*/

      //OUtput - 
     /* US: $12,324.13
      India: Rs.12,324.13
      China: ￥12,324.13
      France: 12 324,13 € /

 /********************************************************************************************************************************** */
                          //TO CONVERT FROM INT TO STRING// 
//    Scanner in = new Scanner(System.in);
//    int n = in .nextInt();
//    in.close();
//    //String s=???; Complete this line below
//    String s = "";
//    int a=n,b=10;
//    if(a==100)
//         s=s.concat("100");
//     else if(a==-100)
//         s=s.concat("-100");
//     else{
//         if(a<0){   
//             s=s.concat("-"); 
//             a*=-1;
//         } 
        
//             while(a>0)
//             {
//                 if(a<10)
//                     b=1;
//             int dig=a/b;
//             switch(dig){
//                 case 1: s=s.concat("1");
//                             break;
//                 case 2: s=s.concat("2");
//                             break;
//                 case 3: s=s.concat("3");
//                             break;
//                 case 4: s=s.concat("4");
//                             break;
//                 case 5: s=s.concat("5");
//                             break;
//                 case 6: s=s.concat("6");
//                             break;    
//                 case 7: s=s.concat("7");
//                             break;
//                 case 8: s=s.concat("8");
//                             break;
//                 case 9: s=s.concat("9");
//                             break;
//                     default : s=s.concat("0");
//                 }    
//                 a=a%b;
                
//             } 
//     }   
//     System.out.println(s);
   
//    if (n == Integer.parseInt(s)) {
//     System.out.println("Good job");
//    } else {
//     System.out.println("Wrong answer.");
//    }
 /********************************************************************************************************************************** */
 













}
}