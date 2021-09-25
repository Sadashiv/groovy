def c = 'c'
println(c.class)
def name = "Sadashiv"
println(name.class)
println ("Hello $name ${1+3}")
def aLargemsg = """
    Welcome to groovy multline
triple string helpful for string interpolation
${1+1}
"""
println(aLargemsg)
println('${1+1}') //String in sinle quote will not happen interpolation

def var = $/C:\Users\Sadashiv/$ //$ at start and end will no need escape backslash
println(var)
