package co.edu.eci.ieti.android.network.service;

import java.util.List;

import co.edu.eci.ieti.android.network.data.LoginWrapper;
import co.edu.eci.ieti.android.network.data.Task;
import co.edu.eci.ieti.android.network.data.Token;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface TaskService {

    @GET( "api/task" )
    Call<List<Task>> getTasksList();
}
