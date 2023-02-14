package zw.co.nm.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("note_table")
class Note {
    constructor(title: String, description: String, priority: String) {
        this.title = title
        this.description = description
        this.priority = priority
    }

    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0

    private lateinit var title: String

    private lateinit var description: String

    private lateinit var priority: String


}