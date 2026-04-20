class Solution {
    fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()

    val matching  = mapOf(')' to '(', ']' to '[', '}' to '{')

    for(c in s){
        if(c == '(' || c == '[' || c == '{'){
            stack.add(c)
        }else{
            if(stack.isEmpty()) return false

            val top = stack.removeAt(stack.lastIndex) //pop top

            if(top!=matching[c]) return false
        }
    }
    return stack.isEmpty()
    }
}
