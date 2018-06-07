package pl.nazwisko.lab5_start;

import java.util.List;

import pl.nazwisko.lab5_start.comment.Comment;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BookWebService {
        @GET("comments")
        Call<List<Comment>> listComments(@Query("per-page") int perpage, @Query("page") int page);
}
