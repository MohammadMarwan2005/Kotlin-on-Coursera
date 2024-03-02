import java.io.Reader

data class Student(val name: String, val id: Int, val grade: Double)

val list = listOf(
    Student("Mohammad", 4343, 86.0),
    Student("Ahmed", 2222, 75.0),
    Student("Mostafa", 8989, 80.0),
    Student("Hamdan", 9090, 100.0)
)

fun main() {
}

fun findStudentById(id: Int): Student? {
    return list.find { it.id == id }
//    list.forEach {
//        if (it.id == id)
//            return it
//    }
//    throw NullPointerException()
}
fun findStudentByName(name: String): Student? {
    return list.find { it.name.lowercase() == name.lowercase() }
}
//fun findStudentByName()