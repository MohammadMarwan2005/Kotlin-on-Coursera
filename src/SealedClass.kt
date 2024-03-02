/**
 * Created by Ahmed Al-Aishat on Mar/01/2024.
 * Kotlin on Courseara Project.
 */
// Simple Definition
sealed class SResult(val notes: String) {
    class Success(notes: String) : SResult(notes)
    class Failure(val reason: String, notes: String) : SResult(notes)
}

fun main() {
    val f = SResult.Failure(
        reason = "Because you're a woman",
        notes = " This is a Note 💡💡"
    )
    val s = SResult.Success(
        notes = "This is a Note of a success status 💡"
    )
    describe(f)
    describe(s)
}

/**
 * @author Mohammad
 * */


@Deprecated("This is a message", ReplaceWith("kdfjska", "djfkd"), DeprecationLevel.WARNING)
fun describe(sResult: SResult) {
    when (sResult) {
        is SResult.Failure ->
            println("Failed Notes: ${sResult.notes} Reason: ${sResult.reason}")

        is SResult.Success -> println("Success Notes: ${sResult.notes}")
    }
}


/**
 * @throws ArithmeticException if you pass b == b
 * */
@Throws(ArithmeticException::class)
fun divide(a: Double, b: Double): Double = a / b