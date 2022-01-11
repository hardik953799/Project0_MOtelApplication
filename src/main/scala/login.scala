//Login pages
import java.util.Scanner
import java.sql.DriverManager
import java.sql.Connection
class login{
   var sc =new Scanner(System.in)
   var fil = new file1()

   
   

    

    def log():Unit={
        println("************************************")
        println("************************************")
        println("Welcome to the Login pages! ")
        println()
        println("Enter the user id ")
        var Userid = sc.nextInt()
        sc.nextLine()
        println()
        println("Enter the Password ")
        var password1 = sc.nextLine()
        sc.nextLine()


        val url = "jdbc:mysql://localhost:3306/sqlexamples"
        val driver = "com.mysql.cj.jdbc.Driver"
        val username = "root"
        val password = "H@rdik480"
        var connection:Connection = null
        try {
            Class.forName(driver)
            connection = DriverManager.getConnection(url, username, password)
            val statement = connection.createStatement()
            var query = "SELECT Password FROM persons Where UserId = " + Userid  +"; "
            //println(query)
            fil.file2(query)
            val rs = statement.executeQuery(query)
            var d =""
            while (rs.next()) {
            
               d=rs.getString(1)
                //println(d)
            }

            next1(password1,d,Userid)
            
        } catch {
            case e: Exception => e.printStackTrace
        }
        connection.close()
    }

def next1(p1:String,p2:String,u:Int):Unit={
    
    var f = p1.equals(p2)
 var af = new afterLogin(u)
 
 
 
    if(f==true){
       af.after()
     
      
      
    }
    else{
        println()
        println("Please Enter again password and userid....")
        println()
        log()
    }

    


}




}







