package subtask1


import java.lang.Exception
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        // throw NotImplementedError("Not implemented")
        val Text = "Такого дня не существует"
           return try {

             val  formatDate = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale.forLanguageTag("Ru"))
             LocalDate.of(year.toInt(),month.toInt(),day.toInt()).format(formatDate)

        } catch (E: Exception){
            Text
        }

    }
}
