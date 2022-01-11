//query go to the file
import java.io._


class file1(){
    def file2(s:String):Unit={
    val log = new PrintWriter(new File("query.log"))
    log.write(s)
    log.close()
    }

    //var fil = new file1()
    //file1.file2
  
}
