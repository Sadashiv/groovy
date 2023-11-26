//Closure  anonymus method
def c = {}
println c.class.name
println c instanceof Closure

def saySada = { name->
    println "Hello $name"
}
saySada('Sadashiv')

List nums = [1,2,3,4,56]
nums.each({
    println it
})

nums.each({ get_num ->
    println get_num
})

//closures are objects and last param
def timesTen(num, closure) {
    closure(num * 10)
}

timesTen(10, { println it})

import java.util.Random
Random rand = new Random()
3.times {
    println rand.nextInt()
}

//Implicit parameter
def sada = {
    println it
}
sada()
sada('shiv')

def noparams = { //-> makes it passing no param
    println "no params..."
}

noparams()

def sayStr = { fname, lname ->
    println "Hello $fname, $lname"
}
sayStr("Sadashiv", "Badagi")

def closparamStr = { String fname, String lname ->
    println "Hello $fname, $lname"
}

closparamStr("Sadashiv", "Badagi")

//Default value to arguments
def greet = { String name, String greeting="Howdy" ->
    println "$greeting, $name"
}
greet("Sadashiv", "Good Night")
greet("Sadashiv")

def concat = { String... args ->
    args.join(' ')
}

println concat("Sadashiv")
println concat("Sadashiv", "Badagi", "Babalad", "586125")

def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x + y }
someMethod(someClosure)


