import mu.KotlinLogging
import javax.script.ScriptEngineManager

class ScriptRunner {

    private val log = KotlinLogging.logger {}

    fun runScript(script: String) {
        log.debug { "running $script" }
        val scriptEngineManager = ScriptEngineManager().getEngineByExtension("kts")
        println(scriptEngineManager)
    }


}