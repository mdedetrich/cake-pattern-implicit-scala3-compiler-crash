import scala.concurrent.Future

trait TraitWithImplicit[Z <: TraitC] { self: TraitA[Z] =>
  def implicitFunc[X](a: String)(implicit test: pack.Reader[X]): Future[X] = ???
}
