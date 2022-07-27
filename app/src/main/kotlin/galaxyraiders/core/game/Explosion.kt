package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

const val INITIAL_TICKS: Int = 3

class Explosion(
  initialPosition: Point2D,
  radius: Double
) : SpaceObject("Explosion", 'X', initialPosition, Vector2D(0.0, 0.0), radius, 0.0) {

  var ticks: Int = INITIAL_TICKS
  val isTriggered: Boolean
    get() = ticks <= 0
}
