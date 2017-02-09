import AChainAddingFunction.ChainAdding

val c = new ChainAdding

val t = c add(1)
println(t)

val t1 = c add(1,2)
println(t1)

val addTwo = c add(2)
addTwo + 5


val addTwoTwo = (n: Int) => c add(n) + 2
addTwoTwo(3)

val addTwoThree = (n: Int) => c add(2, n)
addTwoThree(4)

val addTwoFour = (n: Int, m: Int) => c add(2, n, m)
addTwoFour(4, 5)

val addTwoFive = (n: Seq[Int]) => c add(2, n.sum)
addTwoFive(Seq(4, 4, 5, 10))