package DSA_CODING_2025_20LPA.ARRAY;
/* LC-1
  2 Sum
  arr={5,2,11,7,15}
  target =9;
  then we return index of that to number which is sum of target [1,3]

  NOTE : we can take same element 2 times

  WE HAVE 3 APPROCHE TO RESOLVE IT
  1. Brute force
  2. Better approach
  3. optimize approach

   1. Brute force approch (time complexity o(n2))
  quest : arr[5,2,11,7,15]
         target =9
  we can calculate all the pairs and check which numbers pair which is sum of target
  for(i=0 to n ){
  first= arr[i];
  for(j=j+1 to n){
  second =arr[j];
  sum = firs+second
  if(arr==target){
  ans
   }
   }
  }

  2. Better apprroch(0(nlogn))
  we can sort the array, once we sort the array our element arranged, we get the smaller element intially occured and larger element later , we can calculate the sum our smallest element and larget element
  then we can compare our target if sum is grater than the target the we got that we need to some decrease to meet target means larger value decrase
  called 2 pointer approcah - here first we sort the array then time complexity take 0(nLogn) and 2nd step we run the loop until start value is less than end value and every time calculate sum and then compare target vaue , if sum= target then got the ans, if lar then end--, if decrease then start++

  3. Optimized approch (imp)
    - it uses hashing - means whenever we use set and map inside our programming
    - Basically we have already knew that we hae to find the pair which sum of equal target
    -  first value we pick , second value automaicaly can pick
    pairsum= first + second = traget
    for(i=0 to n){
    first+arr[i]
    }
    we will run a loop in our array then every time we pick our first , once we got the first then we alredy know what will be the 2nd second= target-first
    <value, index> we can use map
    key- we store as array of element
    value - value will be index
    step 1: to search the compliment
    step 2: current element which is also our first value store into map
 */
public class TWO_SUM {
}
