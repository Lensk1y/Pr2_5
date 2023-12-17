fun main(args: Array<String>) {
    var a:Array<String> = arrayOf("");
    var b = "";
    var i = 0;
    while (true)
    {
        print("Input " + (i + 1).toString() + " word: ");
        b = readln();
        if (b == "") {break;} else a += b;
        i++;
    }
    val groupedWords = a.groupBy { it.toCharArray().sorted().joinToString() }
    for ((key, value) in groupedWords) {
        println("Words with the same letters: $value")
    }
}