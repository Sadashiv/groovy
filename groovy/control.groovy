/*if ( true ){
    println "Value is true"
}
*/

if ( true )
    println "Value is true\n"
  
if ( false )
    println "Value is false"
    

if ( !false )
    println "Value is false"

String name = "Sadashiv"
if ( name )
    println "Name has value"

String last = ""
if ( last )
    println "last has value"
    
// if else
def x = 11
if ( x == 10 ) {
    println "x is value is 10"
}
else {
    println "x value is not 10"
}

//while 
def m = 1
while ( m <= 10 ) {
    println m
    m++
}

// for in list
def list = [1,2,3,4,5]
for ( num in  list ) {
    println num
}

// Closure
def list2 = [1,2,3,4,5]
list2.each { println it}

// Switch
def mynum = 10

switch ( mynum ) {
    case 1:
        println "I got number: $mynum"
    default:
        println "This is default case "
}
