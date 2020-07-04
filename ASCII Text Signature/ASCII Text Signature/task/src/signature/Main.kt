package signature

import java.io.File
import java.nio.file.Files
import java.util.*
import java.nio.file.Path

fun main() {
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
    val list = File("C:\\Dm\\Teach\\Hyperskill\\Kotlin\\ASCII Text Signature\\ASCII Text Signature\\task\\src\\signature\\roman.txt").readLines()

    val scan = Scanner(System.`in`)
    print("Enter name and surname: ")
    val name = scan.nextLine()
    print("Enter person's status: ")
    val status = scan.nextLine().toLowerCase()
    var nameLen = -1
    name.forEach { nameLen += if (it == ' ') 10 else list[getOffset(it)].length }
    var statusLen = -1
    status.forEach { statusLen += if (it == ' ') 5 else arr[it - 'a'][0].length + 1 }
    val maxLen = Math.max(nameLen, statusLen)
    println("8".repeat(maxLen + 9))
    for (i in 0 until 10) {
        print("88  " + " ".repeat((maxLen - nameLen) / 2))
        name.forEach { print((if (it == ' ') "          " else list[getOffset(it) + i])) }
        print(" ".repeat((maxLen - nameLen + 1) / 2) + "  88\n")
    }
    for (i in 0..2) {
        print("88  " + " ".repeat((maxLen - statusLen) / 2))
        for (c in status)
            print((if (c == ' ') "    " else arr[c - 'a'][i]) + " ")
        print(" ".repeat((maxLen - statusLen + 1) / 2) + "  88\n")
    }
    println("8".repeat(maxLen + 9))
}

fun getOffset(char: Char): Int {
    return when(char) {
        in 'a'..'z' -> 2 + 11 * (char - 'a')
        in 'A'..'Z' -> 288 + 11 * (char - 'A')
        else -> 0
    }
}
