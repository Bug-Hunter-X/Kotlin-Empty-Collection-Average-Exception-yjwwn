```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val result = list.map { it * 2 }.filter { it > 5 } 
    println(result) //Output: [6, 8, 10] 
    
    val sum = list.sum() 
    println(sum) // Output: 15
    
    val average = list.average() 
    println(average) //Output: 3.0
    
    val emptyList = emptyList<Int>()
    println(emptyList.average()) // throws java.lang.IllegalArgumentException: Mean of empty collection
}
```