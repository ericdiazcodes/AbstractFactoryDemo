package variationkotlin

enum class Color {
    RED,
    BLUE
}

interface Cycle {
    val color: Color

    fun ride() {
        println("Riding my ${this.javaClass.name}")
    }
}

interface Bicycle : Cycle
interface Tricycle : Cycle

class BlueBicycle : Bicycle {
    override val color: Color = Color.BLUE
}

class BlueTricycle : Tricycle {
    override val color: Color = Color.BLUE
}

class RedBicycle : Bicycle {
    override val color: Color = Color.RED
}

class RedTricycle : Tricycle {
    override val color: Color = Color.RED
}

interface CycleFactory {
    fun createBicycle(): Bicycle
    fun createTricycle(): Tricycle
}

class BlueCycleFactory : CycleFactory {
    override fun createBicycle(): Bicycle = BlueBicycle()

    override fun createTricycle(): Tricycle = BlueTricycle()
}

class RedCycleFactory : CycleFactory {
    override fun createBicycle(): Bicycle = RedBicycle()

    override fun createTricycle(): Tricycle = RedTricycle()
}

fun main() {
    val redCycleFactory = RedCycleFactory()
    val blueCycleFactory = BlueCycleFactory()

    val redBicycle = redCycleFactory.createBicycle()
    val blueTricycle = blueCycleFactory.createTricycle()

    redBicycle.ride()
    blueTricycle.ride()
}
