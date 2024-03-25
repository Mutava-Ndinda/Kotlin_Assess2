fun main() {
sentence("Barnie bakes brown bagels and buns")
    numbers(arrayOf(10,20,30,40,50))
    sphereVolume(10,3.14159)
    isPalindrome("kayak")
}

fun sentence(words:String){
    var newSent = arrayOf(words)
    println(newSent.contentToString())

}
fun numbers(nums:Array<Int>):Double{
    var sum = nums.sum().toDouble()
    var size = nums.count().toDouble()
    var avg = nums.average()
    println(sum)
    println(size)
    println(avg)
    return sum
    return size
    return avg
}
fun sphereVolume(r:Int,pie:Double){
    var radius = r*r*r
    var volume = 4/3 * pie*radius
    println(volume)

}
fun isPalindrome(word:String):Boolean{
   if (word.reversed()==word) {
       println("True")
       return true
   }
    else{
        println("False")
       return false
   }
}