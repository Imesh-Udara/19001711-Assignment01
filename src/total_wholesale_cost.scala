object total_wholesale_cost extends App {
  val no_of_Copies = 60
  val discount = 40.0/100.0
  val coverPrice = 24.95

  def CalculateshippingCost(no_of_book:Int):Double = {
    if (no_of_book <= 50) 3.0
    else 3.0 + (0.75 * (no_of_book-50)) ////////////////////////////////////
  }
  //////////////////////////////////////////////////////////////////////////////////////////
  def CalculateDiscount(coverPrice:Double ,no_of_Copies:Int, discount:Double): Double ={
    (coverPrice * no_of_Copies * discount)
  }
  //////////////////////////////////////////////////////////////////////////////////////////
  def CalculateWholeSaleCost(no_of_Copies:Int, discount:Double, coverPrice:Double): Double = {
    (no_of_Copies * coverPrice) - CalculateDiscount(coverPrice,no_of_Copies,discount) + CalculateshippingCost(no_of_Copies)
  }
  //////////////////////////////////////////////////////////////////////////////////////////
  val wholeSalevalue = CalculateWholeSaleCost(no_of_Copies,discount,coverPrice)
  print("The Total Wholesale Cost = ")
  println(f"$wholeSalevalue%1.3f")

}
