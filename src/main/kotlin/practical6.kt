fun main(){
    add(111,2222,-222)
    sub(111,2222,-222)
    mul(111,2222,-222)
    division(2222,111)
    mod(2222,111)
}
fun add(a:Int, b: Int, c:Int)
{
    println("Addition of $a, $b and $c is ${a + b + c}")
}
fun sub(a:Int, b: Int, c:Int)
{
    println("Subtraction of $a, $b and $c is ${a - b - c}")
}
fun mul(a:Int, b: Int, c:Int)
{
    println("Multiplication of $a, $b and $c is ${a * b * c}")
}
fun division(a:Int, b: Int)
{
    println("Division of $a and $b  is ${a / b}")
}
fun mod(a:Int, b: Int)
{
    println("Modulo of $a and $b  is ${a % b}")
}