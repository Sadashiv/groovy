def a = 10
def b = 200
def c = 30

if ( a == 10) {
    println "true"
}

if ( b == 20 )
    println "single line true "

if ( a > b ) {
    println "Value is a ->$a b->$b"
} else if ( b > c ) {
    println "Value  is c->$c b->$b "
} else if ( c > a )  {
    println "Value is a->$a c->$c "
} else {
    println "None matching"
}

def name = "Sada"
def isname = ( name.toLowerCase() == "SADA" ) ? "Match upper case" : "NO"
println isname

def msg = "Sada"

def output = ( msg != null ) ? msg :  "Default message"

def elvisOutput = msg ?: "Default message"

println msg
println output
println elvisOutput

num = 150.toFloat()
switch ( num ) {
    case 1 :
        println "Case 1"
        break
    case 2 :
        println "Case 2"
        break
    case 1..4 :
        println "$num in range 1..3"
        break
    case [1,10,15] :
        println "$num in [1,10,15]"
        break
    case Integer :
        println "$num is Integer"
        break
    case Float :
        println "$num is Float"
        break
    default :
        println "Default case.."
}

def somenum = 100
def range_num = 10..1000
println somenum in range_num
