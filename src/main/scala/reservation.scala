//book a reservation
import java.util.Scanner
import java.sql.DriverManager
import java.sql.Connection

class reservation(usId:Int){
    
var sc = new Scanner(System.in)
var me=new mesa(usId)
//var pr =new price()
def zip():Unit={
     var a=detials()
     println(a)
     if(a==1){
      me.mesa1(a)
      
     }
     else if(a==2){
      me.mesa1(a)
      
     }
     else{
        me.mesa1(a)
        

     }


      



}




def detials():Int={
    

    var zi =0
    
       println("****************************************")
        println("Enter the zip code : ")
        zi = sc.nextInt()
        sc.nextLine()

        while(zi!=85203 && zi !=23456 && zi != 98765){
            
            println()
            println("****************************************")
            println("Sorry data invalid !!!")
            println("plase enter the right zip code (85203,23456,98765)")
            println("****************************************")
            println()
            println("Enter the zip code : ")
            zi = sc.nextInt()
            sc.nextLine()
        }
        if(zi ==85203){return 1}
        else if(zi==23456){return 2}
        else{return 3}
    



   }
}