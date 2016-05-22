package fableexample

import metafunctionality.ModuleInput

class FableExample extends ModuleInput {
    String word
    String answer
    static hasMany = [rhymingCandidates:String]
    List rhymingCandidates
}
