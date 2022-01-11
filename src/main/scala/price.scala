//display last statment in program 
import java.util.Scanner
import java.sql.DriverManager
import java.sql.Connection

class price(usId:Int){
     
   var dis = new display1()
   var sc = new Scanner(System.in)
   var ot= new out()
  
var loe =new login()
   
   


    def date(bed:Int,code:Int,cs:String):Unit={
         var mm=0
         var dd=0
         var yy=0

     println("please enter check in date(mm:dd:yyyy): ")
         var dateIn = sc.next()
         sc.nextLine()
         val finalresult = dateIn.split(":")
         mm= finalresult(0).toInt
         dd = finalresult(1).toInt
         yy=finalresult(2).toInt
         

      while(mm>=13 || (dd>=32 || yy<=2021)){
          
            println()
              println("****************")
              println("please enter the correct date!! ")
              println("****************")
              println()
         println("please enter check in date(mm:dd:yyyy): ")
         var dateIn = sc.next()
         sc.nextLine()
         val finalresult = dateIn.split(":")
         mm= finalresult(0).toInt
        dd = finalresult(1).toInt
         yy=finalresult(2).toInt
        }
        var zz=1
        var peo=0
        do{
        println()
         println("****************")
              println("How many people stay there: ")
              println("****************")
              peo=sc.nextInt()
              sc.nextLine
            if(code==1){
                  if(peo>3){
                  zz=0
                  println()
                  println("****************")
                  println("Maximum allowed three people!! ")
                  println("****************")
                }
                else{zz=1}
            }else{
              if(peo>5){
                  zz=0
                  println()
                  println("****************")
                  println("Maximum allowed fivepeople!! ")
                  println("****************")
                }
                else{zz=1}

            }



        }while(zz==0)

        
          println()
          println("************************************")
          println("How many night your stay there : ")
          var ou= sc.nextInt()
          sc.nextLine()
          println()
          println("************************************")
           println("Check Out date: " +(mm+ou)+"/"+(dd)+"/" +(yy) )
           println("************************************")
           println("************************************")
        
// println("1"+bed)
// println("2"+code)
// println("3"+cs)
      
         var f = ot.Har(bed,code,cs)
         //dis.data3(bed,cs)
          last(bed,cs)
          println("************************************")
          println("************************************")
          println("Checking Dtae: "+mm+"/"+dd+"/"+yy)
          println()
          println("Check Out date:"+(mm+ou)+"/"+(dd)+"/" +(yy))
          println()
          println("Your total Night: "+ou)
          println()
          println("1 nigth price:"+f)
          println()
          println("Total "+ ou +" Nigth price: "+ (ou*f)+".00")
          println()

          println("************************************")
          println("************************************")
          println("Congratulation your successfully booking your room !!!")
          println("please Enter the: ")
          sc.nextLine()
          loe.log()
          
        
       

      


}



def last(pp:Int,ppp:String):Unit={
var ax =dis.data2(usId)

var az=dis.data3(pp,ppp) 
//println(az)
//println(az(1))

     println("////////////////////////////////////////////////////")
      println("////////////////////////////////////////////////////")
      println("////////////////////////////////////////////////////")
      println("Your Infomation:")
      println()
      println("Your name = " + ax(2)+" "+ax(3))
      println()
      println("Your Phone-Number = " + ax(4))
      println()
      println()
      println("Your Address = " + ax(5)+"  "+ax(6)+" "+ax(7))
      println("////////////////////////////////////////////////////")
      println("////////////////////////////////////////////////////")
      println("////////////////////////////////////////////////////")
      println("////////////////////////////////////////////////////")
      println("////////////////////////////////////////////////////")
      println("////////////////////////////////////////////////////")
      println("Motel Infomation:")
      println()
      println("Motel name = " + az(1))
      println()
      println("Motel Phone-Number = " + az(2))
      println()
      println("Motel Address = " + az(3))
      println("////////////////////////////////////////////////////")
      println("////////////////////////////////////////////////////")
      println("////////////////////////////////////////////////////")

 

}




    
}