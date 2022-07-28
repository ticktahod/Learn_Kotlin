class Account(val rightUsername:String, val rightPassword:String) {
	fun login(username:	String,	password: String) : Boolean{
    	if(username == rightUsername && password == rightPassword){
        	return true
        }else{
        	return false
        }
    }    
}
/*args: Array<String> */
fun main() {
	val acc = Account("admin", "1234") //custom constructor
   	if(acc.login("admin","1234") == true){
        println("success\nWelcome Admin")
    }else{
        println("failed\nPlease login again")
    }
}