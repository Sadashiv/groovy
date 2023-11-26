def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG",new Date(),"This is my first debug statement...")

def debugLog = log.curry("DEBUG")
debugLog(new Date(), "This is another debug statment")
debugLog(new Date(), "This is final  debug statment")

def todayDebugLog = log.curry("DEBUG", new Date())
todayDebugLog("This is today's statement")

def crazyGroovy = log.rcurry("Groovy statement for rcurry!")
crazyGroovy("ERROR", new Date())

def indexCurry = log.ncurry(1,new Date())
indexCurry("ERROR", "Index with ncurry")
