fun main() {
     details()
    name()
    number(7)
    number(9)
    largest(arrayOf(7,6,3,9,5,2))




}
fun details(){
    var info = "Masian"
    println(info[2])
    for (i in info){
        println(i)
    }
    println(info.length)
}
fun name(){
    var deet = "its possible"
    println(deet.length)
    println(deet.capitalize())

}
fun number(num: Int){
    if (num == 7) {
        println("neutral")
    }
    else if (num!=7){
        println("base")
    }
    else {
        println("acidic")
    }

}
fun largest(num:Array<Int>){
    println(num.max())
}
fun names(){

}