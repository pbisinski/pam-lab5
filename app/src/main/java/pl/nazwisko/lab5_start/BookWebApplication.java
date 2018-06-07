package pl.nazwisko.lab5_start;

import android.app.Application;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.List;

import pl.nazwisko.lab5_start.comment.Comment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class BookWebApplication extends Application {
    private BookWebService bookWebService;

    public BookWebService getBookWebService() {
        return bookWebService;
    }

    public void onCreate(){
        super.onCreate();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://bookweb.ciolek.info/api/v1/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        bookWebService = retrofit.create(BookWebService.class);

        Call<List<Comment>> call = bookWebService.listComments(20,0);

        call.enqueue(new Callback<List<Comment>>() {
            @Override
            public void onResponse(Call<List<Comment>> call, Response<List<Comment>> response) {
                if(response.isSuccessful()){
                    List<Comment> lista = response.body();
                    for(Comment comment : lista) {
                        StringBuilder displayComment = new StringBuilder();
                        displayComment.append(comment.getId()).append(" ");
                        displayComment.append(comment.getAuthor()).append(" ");
                        displayComment.append(comment.getComment()).append(" ");
                        Log.w("BookWeb", displayComment.toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Comment>> call, Throwable t) {

            }
        });




    }
}
