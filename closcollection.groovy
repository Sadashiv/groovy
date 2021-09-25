List nums = [1,2,3,4,5,6,7,8,9,3,4]

for (num in nums) {
    println num
}

println("**")
nums.each { println it }

for ( int i=0; i<nums.size(); i++) {
    println "$i:${nums[i]}"
}

nums.eachWithIndex { num, index ->
    println "$index: ${num}"
}

List days = ["Sundays", "Monday", "Tuesday", "Saturday"]
List weekend = days.findAll { it.startsWith("S") }

println days
println weekend

List numTentimes = []
nums.each { num ->
    println num*10
}

nums.each { num ->
    numTentimes << num * 10
}

println numTentimes

//Efficient way to achieve numTentimes by using collection method
List numTen = nums.collect { num -> num * 10 }
println numTen

