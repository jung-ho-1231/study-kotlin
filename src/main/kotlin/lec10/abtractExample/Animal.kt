package lec10.abtractExample

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move();
}