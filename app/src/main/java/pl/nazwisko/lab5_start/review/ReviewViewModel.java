package pl.nazwisko.lab5_start.review;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class ReviewViewModel extends AndroidViewModel {

    private ReviewRepository mRepository;


    public ReviewViewModel(@NonNull Application application) {
        super(application);

        mRepository = new ReviewRepository(application);
    }
}
