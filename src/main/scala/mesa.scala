//generate the motel list
//select option bed and motel
import java.sql.DriverManager
import java.sql.Connection
import java.util.Scanner

class mesa(usId:Int){
    
var pr = new price(usId)
var sc = new Scanner(System.in)
var fil = new file1()


    def mesa1(a:Int):Unit={

        if(a==1){
            var cc="mesa"
            
       con1(cc)
        var xx=  data1()
        pr.date(xx(0),xx(1),cc)
       
        
    }
    else if(a==2)
    {
    var cc="gilbert"
    con1(cc)
    var xx=  data1()
        pr.date(xx(0),xx(1),cc)
    
    
    }
    else
    {
        var cc="california"
    con1(cc)
         var xx=  data1()
         pr.date(xx(0),xx(1),cc)

    }

        
       

    }

    def con1(ccc:String):Unit={
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
        var query="select * from "+ccc+";"
        println("************************************")
        println("************************************")
        println("Motel list")
        println("************************************")
        println()
       fil.file2(query)
        val rs = statement.executeQuery(query)
        while (rs.next()) {
           
            println(" Motel code: "+rs.getInt(1) + "\n Motel Name: " + rs.getString(2) + "\n Motel Phone Number: " 
                    + rs.getLong(3)+"\n Motel Address: "+rs.getString(4) + "\n 1 king bed prices: " + rs.getInt(5) +".00"+ "\n 2 king bed prices: " 
                    + rs.getInt(6)+".00")
                    println("************************************")
            println()
        }
    } catch {
        case e: Exception => e.printStackTrace
    }
    connection.close()
}



def data1():Array[Int]={

    var a = new Array[Int](2)
    println("****************************************")
     println("Please select the Motel (Enter the motel code):")
    var code=sc.nextInt()
    sc.nextLine()
    a(0)=code

        var bed =0
        do{
        println()
        println("****************************************")
        println("Please select room types(1) 1 bed or (2)2 bed :")
        bed=sc.nextInt()
        sc.nextLine()
        }while(bed !=1 && bed!=2)
       println()
       println("****************************************")
        a(1)=bed

        return a
         
}


}