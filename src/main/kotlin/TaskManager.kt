class TaskManager {
    private var taskList:MutableList<Task> = mutableListOf()
    fun addTask(title:String){
        if(title.length>0){
            taskList.add(Task(title, taskList.count()-1))
        }
    }

    fun completeTask(id:Int){
        if(id in taskList.indices){
            taskList[id].isCompleted = true
        }
    }
    fun printTasks(){
        taskList.printTaskList()
    }
    fun MutableList<Task>.printTaskList(){
        for (task in this) {
            println(task)
        }
    }

}

