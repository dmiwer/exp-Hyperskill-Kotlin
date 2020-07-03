package signature

import java.util.*

fun main() {
//    val name = Scanner(System.`in`).nextLine()
//    println("*".repeat(name.length + 4))
//    println("* $name *")
//    println("*".repeat(name.length + 4))
    val scan = Scanner(System.`in`)
    print("Enter name and surname: ")
    val name = scan.nextLine().toLowerCase()
    print("Enter person's status: ")
    val status = scan.nextLine()
    println()
    val arr = arrayOf(
            arrayOf("____", "|__|", "|  |"),
            arrayOf("___ ", "|__]", "|__]"),
            arrayOf("____", "|   ", "|___"),
            arrayOf("___ ", "|  \\", "|__/"),
            arrayOf("____", "|___", "|___"),
            arrayOf("____", "|___", "|   "),
            arrayOf("____", "| __", "|__]"),
            arrayOf("_  _", "|__|", "|  |"),
            arrayOf("_", "|", "|"),
            arrayOf(" _", " |", "_|"),
            arrayOf("_  _", "|_/ ", "| \\_"),
            arrayOf("_   ", "|   ", "|___"),
            arrayOf("_  _", "|\\/|", "|  |"),
            arrayOf("_  _", "|\\ |", "| \\|"),
            arrayOf("____", "|  |", "|__|"),
            arrayOf("___ ", "|__]", "|   "),
            arrayOf("____", "|  |", "|_\\|"),
            arrayOf("____", "|__/", "|  \\"),
            arrayOf("____", "[__ ", "___]"),
            arrayOf("___", " | ", " | "),
            arrayOf("_  _", "|  |", "|__|"),
            arrayOf("_  _", "|  |", " \\/ "),
            arrayOf("_ _ _", "| | |", "|_|_|"),
            arrayOf("_  _", " \\/ ", "_/\\_"),
            arrayOf("_   _", " \\_/ ", "  |  "),
            arrayOf("___ ", "  / ", " /__")
    )
    var name_len = 0
    for (c in name)
        name_len += if (c == ' ') 5 else arr[c - 'a'][0].length + 1
    name_len--
    val status_len = status.length
    val max_len = Math.max(name_len, status_len)
    val name_offset = (max_len - name_len) / 2
    println("*".repeat(max_len + 6))
    for (i in 0..2) {
        print("*  " + " ".repeat(name_offset))
        for (c in name)
            print((if (c == ' ') "    " else arr[c - 'a'][i]) + " ")
        print(" ".repeat((max_len - name_len + 1) / 2) + " *\n")
    }
    println("*  " + " ".repeat((max_len - status_len) / 2) + status + " ".repeat((max_len - status_len + 1) / 2) + "  *")
    println("*".repeat(max_len + 6))
}
