class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
       if(s1.length>s2.length) return false
       val freq1 = IntArray(26)
       val freq2 = IntArray(26)

       //frequency of f1
       for(c in s1){
        freq1[c - 'a']++
       }

       val windowSize = s1.length

       for(i in s2.indices){

        freq2[s2[i] - 'a'] ++

        //removing chara going out of window.
        if(i>=windowSize){
            var left = i-windowSize
         freq2[s2[left] - 'a'] -- 
        }

        if(freq1.contentEquals(freq2)){
            return true 
            }
       }

       return false

    }


   
}
