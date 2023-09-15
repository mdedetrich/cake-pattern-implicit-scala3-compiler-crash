trait TraitA[Z <: TraitC] extends TraitB[Z]
  with TraitWithImplicit[Z] { self =>
}
