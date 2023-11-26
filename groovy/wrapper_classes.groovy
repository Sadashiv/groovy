byte b = 10
println(b.getClass().getName())

short s = 100
println(s.class)

println(3.class)
println(1.23.class)
println(11111111111111111111111111111111.class)

def x = 10 //It means x is not type of data type to declare
println(x.getClass().getName())

x = "Hello"
println(x.getClass().getName())

//Explicit casting
def myfloat = (float) 1.0
println(myfloat.class)

Float f = 5.0
Double d = 10.0

def resultd = d/f
def resultf = f/d
println(resultd.class)
println(resultf.class)
Float f2 = 2.0
def resultb = f/f2
println(resultb.class)

println(5.0d - 4.1d)
println(5-4.1)
println(1/2)
assert 2 == 2.5.toInteger()
20.times {
    println '_'
}

1.upto(10) { num ->
    println num
}

10.downto(1) { num ->
    println num
}

0.step(1, 0.1) { num ->
    println num
}
