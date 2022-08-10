fun main(){
    print("Enter Number : ")
    var n:Int = readLine()!!.toInt()

    if(n%2==0)
        println("$n is Even")
    else
        println("$n is Odd")
}