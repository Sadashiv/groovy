def writer = {
    append "Sadashiv"
    append "Badagi"
}

def append(String s) {
    println "append() method called with $s"
}

StringBuffer sb = new StringBuffer()
writer.resolveStratgey = Closure.DELEGATE_FIRST
writer.delegate = sb
writer()
