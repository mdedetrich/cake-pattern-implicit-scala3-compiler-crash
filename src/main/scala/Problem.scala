trait Problem {
  self: Singleton with TraitC =>

  val IdentityReader: Reader[Document]
}
