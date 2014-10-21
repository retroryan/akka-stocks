package backend

import akka.actor.ActorSystem
import actors.Settings

/**
 * Main class for starting cluster nodes.
 */
object MainClusterManager extends BaseApp {

    override protected def initialize(system: ActorSystem, settings: Settings): Unit =
        ()
}