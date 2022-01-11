import scala.collection.mutable.ListBuffer
import java.sql.DriverManager
import java.sql.Connection
//display username and motel list find in database
import java.util.Scanner



class display1()  {
var ux=23
var fil = new file1()




def data2(ux:Int):ListBuffer[Any]={
    println(ux)
   
 var name = new ListBuffer[Any]() 
  val url = "jdbc:mysql://localhost:3306/sqlexamples"
    val driver = "com.mysql.cj.jdbc.Driver"
    val username = "root"
    val password = "H@rdik480"
    var connection:Connection = null
    try {
        Class.forName(driver)
        connection = DriverManager.getConnection(url, username, password)
        val statement = connection.createStatement()
        var query="select * from Persons where Userid= '"+ ux +"' ;"
        fil.file2(query)
        val rs = statement.executeQuery(query)

        while (rs.next()) {
        name += rs.getInt(1)
        name += rs.getInt(2) 
        name += rs.getString(3)  
        name +=  rs.getString(4)
        name += rs.getLong(5) 
        name +=  rs.getString(6) 
        name += rs.getString(7) 
        name += rs.getString(8) 
        name += rs.getString(9)
        println() 

            
        }
    } catch {
        case e: Exception => e.printStackTrace
    }
    
    connection.close()
    
return name 

    }
    
    def data3(pp:Int,ppp:String):ListBuffer[Any]={
     
        var name1 = new ListBuffer[Any]() 
        val url = "jdbc:mysql://localhost:3306/sqlexamples"
            val driver = "com.mysql.cj.jdbc.Driver"
            val username = "root"
            val password = "H@rdik480"
    var connection:Connection = null
    try {
        Class.forName(driver)
        connection = DriverManager.getConnection(url, username, password)
        val statement = connection.createStatement()
        var query="select * from " +ppp+" Where MotelId="+ pp +" ;"
  
        val rs = statement.executeQuery(query)

        while (rs.next()) {
           
       name1 += rs.getInt(1) 
        name1 +=rs.getString(2)
        name1 +=rs.getLong(3)  
        name1 +=rs.getString(4)  
        name1 +=rs.getInt(5) 

        // name1 += rs.getString(2)  
        // name1 += rs.getLong(3) 
        // name1 +=  rs.getString(4) 
        // name1 += rs.getInt(5) 
        
        println() 

            
        }
    } catch {
        case e: Exception => e.printStackTrace
    }
    
    connection.close()
    
return name1

    }
}
