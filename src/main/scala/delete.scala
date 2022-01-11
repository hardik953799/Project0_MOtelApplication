//delete record in data/account
import java.util.Scanner
import java.sql.DriverManager
import java.sql.Connection

class delete{
  var us = 234
  var sc = new Scanner(System.in)
  var fil = new file1()


  
  



// var af = new afterLogin(us)
//     def delet():Unit={

//         var ch ='a'
//         do{
//         println("Are you sure delete the account (y/n)")
//          ch = 'y';
//         }while(ch!='y'&&ch != 'Y'&& ch!='n'&&ch != 'N')


//         if(ch == 'y'|| ch =='Y'){
//             dele(us)
//         }
//         else{
//             af.after()
//         }
           


    //}




def dele(use:Int):Unit={
      // connect to the database named "mysql" on port 8889 of localhost
    val url = "jdbc:mysql://localhost:3306/sqlexamples"
    val driver = "com.mysql.cj.jdbc.Driver"
    val username = "root"
    val password = "H@rdik480"
    var connection:Connection = null
    try {
        Class.forName(driver)
        connection = DriverManager.getConnection(url, username, password)
        val statement = connection.createStatement()
        var query="DELETE FROM persons WHERE UserId="+ use +";"
        //println(query)
        fil.file2(query)
        val rs = statement.execute(query)
        println("Sucessfuly delete your account!!")
    } catch {
        case e: Exception => e.printStackTrace
    }
    connection.close()
    
}


}




    
