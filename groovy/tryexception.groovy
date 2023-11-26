def tryexcept() {
    throw new Exception("Foo Exception")
}

List log = []
try {
    tryexcept()
} catch ( Exception e ) {
    log << e.message
} finally {
    log << "finally"
}
println log

//Java 7 introduced multi catch exception even groovy supports multi catch 
