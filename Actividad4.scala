import scala.math._
import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String])={
    var datos = leerDatos
    println("======================")
    imprimirDatos(datos)
    println("Media: "+obtenerMedia(datos))
    println("Desviacion: "+obtenerDesviacionEstandar(datos,obtenerMedia(datos)))
	}
  def leerDatos(): Array[Int] = {
  	print("Cantidad de Datos: ")
  	var cant = readInt()
  	var datos = new Array[Int](cant)
  	for(i <- 0  until cant){
  		print("Ingresa dato "+(i+1)+": ")
  		datos(i) = readInt()
  	}
  	datos
  }
  def obtenerMedia(datos:Array[Int]): Double = {
  	var suma = 0.0
  	for(i <- 0 until datos.length)
  		suma += datos(i)
  	suma = suma/datos.length
  	suma
  }
  def obtenerDesviacionEstandar(datos:Array[Int],media:Double): Double = {
  	var cuadrados = 0.0
  	for(i <- 0 until datos.length)
  		cuadrados += pow(abs(media-datos(i)),2)
  	cuadrados = cuadrados/datos.length
  	sqrt(cuadrados)
  }
  def imprimirDatos(datos:Array[Int])= {
  	for(i <- 0 until datos.length)
  		println("Dato "+(i+1)+": "+datos(i))
  }
}