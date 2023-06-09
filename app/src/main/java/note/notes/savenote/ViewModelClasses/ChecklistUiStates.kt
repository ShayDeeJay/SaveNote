package note.notes.savenote.ViewModelClasses

import note.notes.savenote.Database.Note

data class ChecklistUiState (
    val fullChecklist: Note? = null,
    val uid: Int = 0,
    val header: String = "",
    val checklistEntryNumber: Int? = null,
    val checklistKey: Int? = null,
    val completedNotes: Boolean = false,
    val reArrange: Boolean = false,
    val showCompleted: Boolean = false,
    val isVisible: Boolean = false,
    val category: String? = null
)