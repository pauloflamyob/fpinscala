// 1 1 2 3 5 8 13 21 34

def solFib(n: Int): Int = {
  def doFib(n:Int, r1:Int, r2:Int): Int = {
    print(s"$n ")
    if (n==0) r1 else doFib(n-1, r2, r1+r2)
  }
  doFib(n, 0, 1)
}

solFib(0) == 0
solFib(1) == 1
solFib(2) == 1
solFib(3) == 2
solFib(4) == 3
solFib(5) == 5
solFib(6) == 8
solFib(7) == 13
solFib(8) == 21
solFib(20) == 6765

def paulFib(n: Int): Int = {
  @annotation.tailrec
  def go(currentFibNumber: Int, oldAccum: Int, newAccum: Int): Int ={
    print(s"$currentFibNumber ")
    if(currentFibNumber.equals(n)) newAccum
    else go(currentFibNumber + 1, newAccum, oldAccum + newAccum)
  }
  if (n.equals(0)) n
  else go(1, 0, 1)
}

paulFib(0) == 0
paulFib(1) == 1
paulFib(2) == 1
paulFib(3) == 2
paulFib(4) == 3
paulFib(5) == 5
paulFib(6) == 8
paulFib(7) == 13
paulFib(8) == 21
paulFib(20) == 6765

def simpleFib(n: Int): Int = {
//  print(s"$n ")
  if (n > 1) simpleFib(n - 1) + simpleFib(n - 2) else n
}

simpleFib(0) == 0
simpleFib(1) == 1
simpleFib(2) == 1
simpleFib(3) == 2
simpleFib(4) == 3
simpleFib(5) == 5
simpleFib(6) == 8
simpleFib(7) == 13
simpleFib(8) == 21
simpleFib(20) == 6765
