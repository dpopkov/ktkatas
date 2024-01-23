package learn.ktkatas.challenges.c02math.p0202exercises

interface IEx2NumberAsText {
    /**
     * Конвертирует заданное положительное число [number] в текст,
     * где каждая цифра соответствует текстовому эквиваленту in capital letters,
     * например 12 - "ONE TWO".
     */
    fun numberAsText(number: Int): String
}
