package subtask2

import java.util.*

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val A = a.toUpperCase()
        val B = b.toCharArray()
        var count = 0
       // println(B.size)
        while (count<B.size){
            if (A.indexOf(B.get(count).toString(),count,false) >= 0){
                count++
                if (count == B.size) return "YES"
               }else return "NO"
            }

 return "NO"      }

 }






