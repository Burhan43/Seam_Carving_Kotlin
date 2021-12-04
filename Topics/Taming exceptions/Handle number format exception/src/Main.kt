fun parseCardNumber(cardNumber: String): Long {
    val regex = Regex("""\d{4} \d{4} \d{4} \d{4}""")
    if (!regex.matches(cardNumber)) {

        throw Exception("incorrect card")
    }
    return cardNumber.replace("\\s".toRegex(), "").toLong()
}
