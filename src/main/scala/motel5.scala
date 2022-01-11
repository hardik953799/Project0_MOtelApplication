//its main pages and option login and signup
import java.util.Scanner
class motel5{
    var sc =new Scanner(System.in)
    def welcome():Unit={
        println()
        println("************************************")
        println("Welcome MotelBooking Application ")
        println("************************************")
        println()

       
       
    }

    def option():Int={
        println("************************************")
        println("(1) Sing Up( Create the account)")
        println("(2) Login ")
        println("************************************")
        var a = sc.nextInt()
        sc.nextLine()
        while(a !=1 && a !=2){
            println("************************************")
            println("Please chooise correct Option (1 and 2)")
            println("************************************")
            println()
             println("(1) Sing Up( Create the account)")
            println("(2) Login ")
            a=sc.nextInt()

        }


        sc.nextLine()
        return a
        
    }
}