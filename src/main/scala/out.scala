//generate motel prices 
import java.util.Scanner
import java.sql.DriverManager
import java.sql.Connection


class out{
    var fil = new file1()

    var a=1 
    var b=1
    def Har(bed:Int,code:Int,cs:String):Int={
    // connect to the database named "mysql" on port 8889 of localhost
    val url = "jdbc:mysql://localhost:3306/sqlexamples"
    val driver = "com.mysql.cj.jdbc.Driver"
    val username = "root"
    val password = "H@rdik480"
    var connection:Connection = null
    
     var ff=0
    try {
        Class.forName(driver)
        connection = DriverManager.getConnection(url, username, password)
        val statement = connection.createStatement()
        var query=""
        if(code==1){query="select P1kn from " + cs+ " where MotelId="+bed +""}
        else{query="select P2kn from " + cs+ " where MotelId="+bed +""}
       fil.file2(query)
        val rs = statement.executeQuery(query)
       
        while (rs.next()) {
           
            ff=rs.getInt(1) 
           
             
        }

    } catch {
        case e: Exception => e.printStackTrace
        
    }
    connection.close()
    var a =ff
    return a

    
    }

    
}