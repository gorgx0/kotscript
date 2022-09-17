import mu.KotlinLogging
import javax.script.ScriptEngineManager

class ScriptRunner {

    private val log = KotlinLogging.logger {}

    fun runScript(script: String) {
        log.debug { "running $script" }
        val scriptEngine = ScriptEngineManager().getEngineByExtension("kts")
        log.debug { "script engine: $scriptEngine" }
        scriptEngine.eval("val x = 3")
        val res = scriptEngine.eval("x + 4")
        log.debug { "result: $res" }
    }


}