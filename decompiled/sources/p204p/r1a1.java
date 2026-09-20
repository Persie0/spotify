package p204p;

import com.spotify.cosmos.cosmonaut.CosmosService;
import com.spotify.cosmos.cosmonaut.annotations.Body;
import com.spotify.cosmos.cosmonaut.annotations.GET;
import com.spotify.cosmos.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.cosmos.Response;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@CosmosService
public interface r1a1 {
    @GET("sp://core-show/unstable/unfinished/episodes")
    /* JADX INFO: renamed from: a */
    Single<Response> m74473a(@QueryMap Map<String, String> map, @Body v6q0 v6q0Var);
}
