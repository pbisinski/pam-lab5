package pl.nazwisko.lab5_start.activities.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import pl.nazwisko.lab5_start.R;
import pl.nazwisko.lab5_start.comment.CommentAdapter;

/**
 * Aktywność wyświetlająca listę komentarzy.
 *
 * @author Michał Ciołek
 */
public class CommentsListActivity extends AppCompatActivity {

    private CommentAdapter commentsListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments_list);

        // TODO Spinner

        // znajdź RecyclerView
        RecyclerView commentListRecyclerView = findViewById(R.id.comments_list_recycler_view);

        // ustawienie sposobu rozmieszczenia elementów
        commentListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // utworzenie adaptera wraz z komentarzami odczytanymi z pliku
        commentsListAdapter = new CommentAdapter();

        // połączenie adaptera z RecyclerView
        commentListRecyclerView.setAdapter(commentsListAdapter);

        downloadComments(2);
    }

    /**
     * Pobieranie komentarzy z Rest API
     *
     * @param perPage liczba pobranych komentarzy
     */
    private void downloadComments(int perPage) {
        //1. pobranie komentarzy z serwera

        //2. przekazanie komentarzy do commentsListAdapter
    }
}
