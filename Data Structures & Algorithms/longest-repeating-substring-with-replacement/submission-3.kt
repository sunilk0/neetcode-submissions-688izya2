class Solution {
    fun characterReplacement(s: String, k: Int): Int {
 
                 val freq = IntArray(26){0}

                 var left = 0
                 var maxCount = 0
                 var maxLen = 0

                 for(right in s.indices){
                    val index = s[right]-'A'
                    freq[index] += 1

                    if(freq[index]>maxCount){
                        maxCount = freq[index]
                    }

                    while((right-left+1)-maxCount > k){
                        freq[s[left] -'A'] -= 1
                        left += 1
                    }

                    val windowLen = right-left+1
                    if(windowLen>maxLen)
                    maxLen = windowLen
                 }
                 return maxLen
                 }


}
