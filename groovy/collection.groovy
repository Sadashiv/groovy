Range r = 1..10
println r
println r.class.name
println r.from
println r.to

assert (0..10).contains(5)
assert (0..10).contains(-5) == false

assert (0..<10).contains(5)
assert (0..<10).contains(10) == false
Date today = new Date()
Date oneweekaway = today + 7
println today
println oneweekaway
Range days = today..oneweekaway
println days

Range c = 'a'..'z'
println c

List l = [1,2,3,4,5,4,3,3,6,7,8,9] // as LinkedList
println l
println l.class.name
l.push(100)
println l
l.putAt(0, 0)
println l
l[0] = 20
println l
println l + [101,102,103]
l.pop()
println l
println l[5]
for(x in l) {
    println x
}
def k = l as SortedSet //Set
println k

def map = [:]
println map.getClass().getName()
def person = [fname:'Sadashiv', lname:'Badagi', email:'sada@gmail.com']
println person
println person.fname
person.twitter = 'sadashivhb'
println person
println person.size()
println person.sort()
println person
for(entry in person){
    println entry
}
for (key in person.KeySet() ){
    println "$key:${person[key]}"
}
