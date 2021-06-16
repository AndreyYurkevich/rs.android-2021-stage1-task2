package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val A = arrayOf(a.toUpperCase())
        val B  = arrayOf(b)
        return if (A.intersect(B.toList()) == B) {
             "YES"
        } else "NO"
    }
}
