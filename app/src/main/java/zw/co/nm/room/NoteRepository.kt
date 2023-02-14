package zw.co.nm.room

import android.app.Application
import androidx.lifecycle.LiveData

class NoteRepository {

    private var noteDao: NoteDao
    private var allNotes: LiveData<List<Note>>

    constructor(application: Application) {
        var database = NoteDatabase.getInstance(application)
        noteDao = database.noteDao
        allNotes = noteDao.getAllNotes()
    }

    suspend fun insert(note: Note) {
        noteDao.insert(note)

    }

    fun update(note: Note) {

    }

    fun delete(note: Note) {

    }

    fun deleteAll(note: Note) {

    }

    fun getAllNotes(): LiveData<List<Note>> {
        return allNotes
    }


}