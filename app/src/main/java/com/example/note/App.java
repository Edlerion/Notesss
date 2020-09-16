package com.example.note;

        import android.app.Application;

        import androidx.room.Room;

        import com.example.note.data.AppDataBase;
        import com.example.note.data.NoteDao;

public class App extends Application {

    private AppDataBase dataBase;
    private NoteDao noteDao;

    private static App instance;

    public static App getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        dataBase = Room.databaseBuilder(getApplicationContext(),
                AppDataBase.class, "app-db-name")
                .allowMainThreadQueries()
                .build();

        noteDao = dataBase.noteDao();
    }

    public AppDataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(AppDataBase dataBase) {
        this.dataBase = dataBase;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

    public void setNoteDao(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

}
