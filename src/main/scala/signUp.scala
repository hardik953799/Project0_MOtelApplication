import java.util.Scanner
import java.sql.DriverManager
import java.sql.Connection
import java.util.regex._
class signUp{
var sc =new Scanner(System.in)

var l=new login()
var nn = new name123()
var fil = new file1()


def data():Unit={
    //First Name
    var n1="Enter the First Name: "
    var  firstname =nn.name12(n1)
    

    //last Name
    var n2="Enter the last name: "
    var lastname=nn.name12(n2)
   
    //Phonenumber
    println("Enter the Phone Number:")
    var phoneNumber1 = sc.next()
    var x =parseMobile(phoneNumber1)
    sc.nextLine()
    println()
    while(x==false){
    println("************************************")
    println("Please Enter the correct phone Number ")
    println("************************************")
    println()
    println("Enter the Phone Number:")
    
    phoneNumber1 = sc.next()
    //sc.nextLine()
    x = parseMobile(phoneNumber1)
    println()
    }
    var phoneNumber = phoneNumber1.toLong

    println("Enter the address : ")
    var address = sc.nextLine()
    sc.nextLine()

    var n89="Enter the city : "
    var city = nn.name12(n89)


    var n91="Enter the State : "
    var state = nn.name12(n91)

    var n21 = "Enter the Zip Code : "
    var zip1 = nn.zip(n21)
    var zip=zip1.toInt
   

 
    var n99="Create the User Id  : "
    var usId = nn.User(n99)
    
    var userId=usId
    
    sc.nextLine()
   
    

    println("Enter the password : ")
    var password1 = sc.nextLine()
    sc.nextLine()

    var result =true
    var matchPassword=""
 do{

    println("Enter the again password : ")
    matchPassword = sc.nextLine()
    sc.nextLine()
     
    result = password1.equals(matchPassword)

     if(result == false){
         println("Password Not match ")}
        

        
    
    }while(result  == false)


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
        var query = "INSERT INTO persons (UserId,FirstName,LastName,PhoneNumber,Address,City,state,zip,Password) VALUES ('" + userId +
           "','" + firstname +"','"+ lastname + "','"+ phoneNumber + "','"+ address +"','"+ city + "','"+ state +"','"+ zip +"','"+ matchPassword + "')"
          
           
        
        // var query = "INSERT INTO persons (UserId,FirstName,LastName,PhoneNumber,Address,City,state,zip,Password) VALUES ('123', 'Hiren' ,'Testing', '123456789' ,'123 Main St.', 'Mesa', 'AZ',  '23456' ,'2345')"
        
        fil.file2(query)
        val rs = statement.executeUpdate(query)
        
    } catch {
        case e: Exception => e.printStackTrace
    }
    connection.close()

     println()
     println(" Thank you")
     println()
     println("Congratulation !! Yor Successfully create your account !!!")
     println()
     
    l.log()


    }




    def parseMobile(number:String):Boolean={

    val phoneRx = """[+\d() ]{6,12}"""          // absolutely wrong regex
        
        //println( number.matches(phoneRx))
        return number.matches(phoneRx)


  }
   

    


}