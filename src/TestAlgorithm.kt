import java.util.ArrayList

class TestAlgorithm() {
    internal var workers: ArrayList<Worker> = ArrayList()
    internal var tasks: MutableList<Task> = ArrayList()
    internal var goals: MutableList<Goal> = ArrayList()

    val orderedTasks = ArrayList<Task>()
    val dependencies = ArrayList<Task>()

    fun getPrioritizedTasks(workers: ArrayList<Worker>,
              tasks: MutableList<Task>,
              goals: MutableList<Goal>): ArrayList<Task>{
        this.workers = workers
        this.tasks = tasks
        this.goals = goals


        // get tasks
        val orderedGoals = goals.sortedWith(compareByDescending{it.deadline})

        orderedGoals.forEach {goal ->
            orderedTasks.add(tasks.first { it.id == goal.id_task })
        }


        orderedTasks.forEach {
            getDependencies(it)
        }

        dependencies.reverse()

        return dependencies
    }

    fun getDependencies(task: Task) {
        val taskDeps = ArrayList<Task>()

        task.task_dip.forEach {dep ->
            val designatedTask = tasks.first { it.id == dep }.apply {
                this.done = true
            }

            taskDeps.add(designatedTask)
        }

        dependencies.addAll(taskDeps)
        taskDeps.forEach {
            if (!it.done) {
                getDependencies(it)
            }
        }
    }
}