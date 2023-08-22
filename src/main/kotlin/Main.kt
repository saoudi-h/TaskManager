fun main(args: Array<String>) {
    val taskManager = TaskManager()

    taskManager.addTask("Faire les courses")
    taskManager.addTask("Apprendre Kotlin")

    taskManager.completeTask(1)

    taskManager.printTasks()
}