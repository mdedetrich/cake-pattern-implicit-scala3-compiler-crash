trait TraitC extends Problem { self: Singleton =>
  type Value
  type Document <: Value
  type Reader[A]
}
