import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    
    var max1: Int? = scanner.nextInt()
    var max2: Int? = scanner.nextInt()
    
    if (max1 != null && max2 != null) {
        repeat(n - 2) {
        val num1 = scanner.nextInt()
        if (num1 > max1) {
            max1 = num1
        } else if (num1 > max2){
            max2 = num1
        }
        }print(max1 * max2)
        
    } else if (max1 != null xor max2 != null){
        print(max1)
    } else if (max1 != null && max2 != null xor n != null) {
        print(n)
    }
}
