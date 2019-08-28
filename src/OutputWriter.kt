
import java.io.PrintWriter
import java.lang.StringBuilder


object OutputWriter {
    fun printOutput(file: String, days: List<Day>){

        val out = PrintWriter(file)

        days.forEach {
            val id = it.index
            val otherThing = it.mapDay

            val tasksString = StringBuilder()

            otherThing.forEach { task, workers ->
                workers.forEach {worker ->
                    tasksString.append("${task.id}:${worker.id}")
                }
            }

            val thingThatIsNotId = tasksString.toString()

            out.println("$id $thingThatIsNotId")
        }

        // Add line
        // out.println("");




    }

}