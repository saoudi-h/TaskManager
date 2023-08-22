class Task(val title: String, val id: Int, var isCompleted: Boolean = false) {
    override fun toString(): String {
        return "Task(title='$title', id=$id, isCompleted=$isCompleted)"
    }
}