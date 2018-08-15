
def addressToBinary = [:]

def dmxOffsets = [1, 25, 49, 73, 97, 121, 145, 169, 193, 217, 241, 265, 289, 313, 337, 361, 385, 409]

dmxOffsets.each { offset ->

  def offsetAsBinary = Integer.toBinaryString(offset)
  def paddedOffset = String.format("%9s", offsetAsBinary).replace(' ', '0')

  //println "$offset | $paddedOffset | ${paddedOffset.reverse()}"
  println "$offset | ${paddedOffset.reverse()}"
}
