object volume_of_a_sphere extends App{
  val radiusofSphere = 5
  println("Calculate the volume of a sphere with radius 5\n")
  val volume = (4.0/3.0)*(math.Pi) * (math.pow(radiusofSphere,3))
  println("The volume = " + volume)
}
