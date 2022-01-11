import java.util.Scanner
import scala.collection.mutable.ListBuffer

//dashboard page , after login 
class afterLogin(user:Int){
    

var sc =new Scanner(System.in)




var up =new update(user)
var de =new delete()
var res = new reservation(user)
var lo =new login()




def after():Unit={
println("****************************************")
println("****************************************")
println()
println("Welcome to the Home Page! ")
println("****************************************")
println("****************************************")
println()

println("Plase select the option:")
println("****************************************")
println()

var a=0
do{
println("(1) Create a new reservation")
println("(2) Update you Infromation ")
println("(3) Delete your account ")
println("(4) Exit(log out)")
println()
println("Enter the options: ")
println()
a =sc.nextInt()
 sc.nextLine()

if(a!=1 && a !=2 && a!=3 && a!=4){
    println()
    println("Plesae select the correct option(1,2,3,4) ")
    println()

}



}while(a!=1 && a !=2 && a!=3 && a!=4)

if(a==1){
res.zip()
}
else if(a==2){
     var r =user
     up.upda(user)
    
}
else if(a==3){

var ch ='a'
        do{
        println("Are you sure delete the account (y/n)")
         ch = sc.next().charAt(0);

         if(ch!='y'&&ch != 'Y'&& ch!='n'&&ch != 'N')
         {
             println("Please select 'Y' and 'N' ")
         }
        }while(ch!='y'&&ch != 'Y'&& ch!='n'&&ch != 'N')


        if(ch == 'y'|| ch =='Y'){
            var zzz=user
            de.dele(zzz)
            
        }
        else{
            after()
        }











}else{
    println("")
    println("*******************") 
    lo.log()
}

   
}

}


