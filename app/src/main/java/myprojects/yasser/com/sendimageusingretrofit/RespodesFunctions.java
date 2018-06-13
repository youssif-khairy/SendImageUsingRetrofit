package myprojects.yasser.com.sendimageusingretrofit;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by yasser ahmed on 6/11/2018.
 */

public interface RespodesFunctions {
    @Multipart
    @POST("getImage")
    Call<RespondeData>send_image(@Part MultipartBody.Part image);
}
