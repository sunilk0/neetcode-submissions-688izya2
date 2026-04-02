class Solution {
    fun mergeTriplets(triplets: Array<IntArray>, target: IntArray): Boolean {
      var found0 = false
      var found1 = false
      var found2 = false

      for(triplet in triplets){
        if(triplet[0] <= target[0] && triplet[1] <= target[1] && triplet[2]<=target[2]){
            if(triplet[0] == target[0] && triplet[1] <= target[1] && triplet[2] <= target[2]){
          found0 = true
            }
            //index1
             if(triplet[1] == target[1] && triplet[0] <= target[0] && triplet[2] <= target[2]){
          found1 = true
            }
              if(triplet[2] == target[2] && triplet[0] <= target[0] && triplet[1] <= target[1]){
          found2 = true
            }
        }
      }
      return found0 && found1 && found2
    }
}
