package p204p;

import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin$PluginCommand;
import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin$PluginInit;
import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin$PluginResponse;
import com.spotify.cosmos.cosmonaut.CosmosService;
import com.spotify.cosmos.cosmonaut.annotations.Body;
import com.spotify.cosmos.cosmonaut.annotations.POST;
import com.spotify.cosmos.cosmonaut.annotations.SUB;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@CosmosService
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/w0l0;", "", "Lcom/spotify/betamax/offlinecoordinator/proto/OfflinePlugin$PluginInit;", "init", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/betamax/offlinecoordinator/proto/OfflinePlugin$PluginCommand;", "a", "(Lcom/spotify/betamax/offlinecoordinator/proto/OfflinePlugin$PluginInit;)Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/betamax/offlinecoordinator/proto/OfflinePlugin$PluginResponse;", "response", "Lio/reactivex/rxjava3/core/Completable;", "b", "(Lcom/spotify/betamax/offlinecoordinator/proto/OfflinePlugin$PluginResponse;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_betamax_offlinecoordinator-offlinecoordinator"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface w0l0 {
    @SUB("sp://offline/v2/plugin")
    /* JADX INFO: renamed from: a */
    Observable<OfflinePlugin$PluginCommand> m86952a(@Body OfflinePlugin$PluginInit init);

    @POST("sp://offline/v2/plugin")
    /* JADX INFO: renamed from: b */
    Completable m86953b(@Body OfflinePlugin$PluginResponse response);
}
