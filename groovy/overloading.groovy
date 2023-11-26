def a = 1
def b = 2
println a + b
println a.plus(b) //Behind scene this will go

def s1 = 'Sadashiv'
def s2 = ' Badagi'

println s1 + s2
println s1.plus(s2)

class Account {

    BigDecimal balance

    Account plus(Account other) {
        new Account( balance: this.balance + other.balance )
    }
    String toString() {
        "Account Balance: $balance"
    }
}

Account savings = new Account(balance: 100.00)
Account checking = new Account(balance: 500.00)

println savings
println checking
println savings + checking
