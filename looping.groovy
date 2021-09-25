List nums = [1,2,3,4,5,6]
while ( nums ) {
    println nums.remove(0)
}

assert nums == []

for ( Integer num in [1,2,3,4,5,67] ) {
    println num
}

String methFoo() {
    println "Hello methFoo()"
    "food"
    //return "foo"
}
aa = methFoo()
println "methFoo() return value $aa"

Integer a = 1
while ( true ) {
    a++
    break
}

println a
assert a == 2

for ( String s in 'a'..'z' ) {
    if (  s == 'a' ) continue
    println s
    if ( s > 'b' ) break
}

