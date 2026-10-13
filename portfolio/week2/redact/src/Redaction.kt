// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(inputDoc: String, redactText: String, redactChar: Char = 'X'): String {
    return inputDoc.replace(redactText, redactChar.toString().repeat(redactText.length))
    
    
}