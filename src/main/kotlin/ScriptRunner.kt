import mu.KotlinLogging

class ScriptRunner {

    private val log = KotlinLogging.logger {}

    fun runScript(script: String) {
        log.debug { "running $script" }

    }


}