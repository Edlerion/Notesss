package com.example.note.screen.main;


        import androidx.lifecycle.LiveData;
        import androidx.lifecycle.ViewModel;

        import com.example.note.App;
        import com.example.note.model.Note;

        import java.util.List;

public class MainViewModel extends ViewModel {
    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

    public LiveData<List<Note>> getNoteLiveData() {
        return noteLiveData;
    }
}
