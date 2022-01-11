//user input data check for singup time
import java.util.Scanner
import java.sql.DriverManager
import java.sql.Connection
class name123{
var sc =new Scanner(System.in)
var fil = new file1()


    //check tha input in signUp in valid data
    def name12(s:String):String={
        
        try{
                println()
                println(s)
                var firstname =sc.nextLine()
                sc.nextLine()
                validate(firstname)
                return firstname 
                
            }
        catch{
                    case e: MyException => {println(e)
                    name12(s)}; 
                    
            }
            
    }

    //check the datavalid data in string
    def validate(s:String):Unit=
    {
        var asd =s.toUpperCase()
        for(i <- 0 to asd.length-1 by 1)
        {
            if(!(asd(i)>='A'&&asd(i)<='Z')){
            throw new MyException("Invalid data Enter(Please enter the Alphabet) ")
            }
        }
    }


    def User(s:String):String={
        
        try{
                println()
                println(s)
                var firstname =sc.next()
                sc.nextLine()
                vali(firstname)
                var ggg= check(firstname)
                
                IT(ggg)

                
                return firstname
                
            }
        catch{
                    case e: MyException => {println(e)
                    User(s)}; 
                    
            }
             
    }

    def zip(s:String):String={
        
        try{ 
                println()
                println(s)
                var firstname =sc.nextLine()
                sc.nextLine()
                vali(firstname)
                return firstname
                
            }
        catch{
                    case e: MyException => {println(e)
                   zip(s)}; 
                    
            }
    }

    //check the datavalid data in string
    def vali(s:String):Unit=
    {
        var asd =s.toUpperCase()
        for(i <- 0 to asd.length-1 by 1)
        {
            if(!(asd(i)>='0'&&asd(i)<='9')){
            throw new MyException("Invalid data Enter(Please enter the Digit) ")
            }
        }

     
   
    }
    def check(s:String):Int={
        val url = "jdbc:mysql://localhost:3306/sqlexamples"
    val driver = "com.mysql.cj.jdbc.Driver"
    val username = "root"
    val password = "H@rdik480"
    var connection:Connection = null
    var sp=0
    try {
        Class.forName(driver)
        connection = DriverManager.getConnection(url, username, password)
        val statement = connection.createStatement()
        var ss=s.toInt
        var query = "select id from Persons where Userid= "+ss+" ;"
        fil.file2(query)
          
           
        
        // var query = "INSERT INTO persons (UserId,FirstName,LastName,PhoneNumber,Address,City,state,zip,Password) VALUES ('123', 'Hiren' ,'Testing', '123456789' ,'123 Main St.', 'Mesa', 'AZ',  '23456' ,'2345')"
        
        println(query)
        
        val rs = statement.executeQuery(query)
        
        while(rs.next){
           sp = rs.getInt(1)
           
        }
       
        
    } catch {
        case e: Exception => e.printStackTrace
    }
    connection.close()
   var k=0
  if(sp==0){
   k=1}
 
    return k

    }

    def IT(sp:Int):Unit={
        if(sp ==0){
             throw new MyException("Already Using this User Id please Enter other USer Id")
        }
    }
}