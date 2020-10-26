import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val aX = scanner.nextInt()
    val aY = scanner.nextInt()
    val aZ = scanner.nextInt()
    
    val bX = scanner.nextInt()
    val bY = scanner.nextInt()
    val bZ = scanner.nextInt()
    
    if (aX + aY + aZ > bX + bY + bZ) { 
        println("Box 1 > Box 2")
    } else if (aX + aY + aZ < bX + bY + bZ) {
        println("Box 1 < Box 2")
    } else if (aX + aY + aZ == bX + bY + bZ) {
        if(aX in listOf(bX, bY, bZ) && aY in listOf(bX, bY, bZ) && aZ in listOf(bX, bY, bZ)) {
            println("Box 1 = Box 2")
        } else println("Incomparable")
    }
}
