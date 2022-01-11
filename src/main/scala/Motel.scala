//this one a main method
import java.sql.DriverManager
import java.sql.Connection
object Motel{
    

def main(args:Array[String]):Unit={

    
   main1()

   



   
}


def con():Unit={
     // connect to the database named "mysql" on port 8889 of localhost
    val url = "jdbc:mysql://localhost:3306/sqlexamples"
    val driver = "com.mysql.jdbc.Driver"
    val username = "root"
    val password = "H@rdik480"
    var connection:Connection = null
    try {
        Class.forName(driver)
        connection = DriverManager.getConnection(url, username, password)
        val statement = connection.createStatement()
        val rs = statement.executeQuery("select City from persons")
        while (rs.next()) {
           
            println(rs.getString(1))
            println()
        }
    } catch {
        case e: Exception => e.printStackTrace
    }
    connection.close()
}

def main1():Unit={
    var ff =new  motel5()
    
    
    


    ff.welcome()
    var a = ff.option()

    if(a==1){
        var si = new signUp()
        si.data()
    }
    else{
        var s3 = new login()
        s3.log()
    }

    //con()

    // var up =new update()
    // up.upda()


}

}



