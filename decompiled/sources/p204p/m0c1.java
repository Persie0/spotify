package p204p;

import com.spotify.betamax.contextplayercoordinatorimpl.model.VideoPlayerCommand;
import com.spotify.cosmos.cosmonaut.CosmosService;
import com.spotify.cosmos.cosmonaut.annotations.Body;
import com.spotify.cosmos.cosmonaut.annotations.POST;
import com.spotify.cosmos.cosmonaut.annotations.SUB;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@CosmosService
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m24212d2 = {"Lp/m0c1;", "", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/betamax/contextplayercoordinatorimpl/model/VideoPlayerCommand;", "b", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/h0c1;", "reason", "Lio/reactivex/rxjava3/core/Completable;", "d", "(Lp/h0c1;)Lio/reactivex/rxjava3/core/Completable;", "Lp/q9p0;", "playerError", "c", "(Lp/q9p0;)Lio/reactivex/rxjava3/core/Completable;", "Lp/kbp0;", "playerState", "a", "(Lp/kbp0;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_betamax_contextplayercoordinatorimpl-contextplayercoordinatorimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface m0c1 {
    @POST("sp://videoplayer/v1/state")
    /* JADX INFO: renamed from: a */
    Completable m60460a(@Body kbp0 playerState);

    @SUB("sp://videoplayer/v1/commands")
    /* JADX INFO: renamed from: b */
    Observable<VideoPlayerCommand> m60461b();

    @POST("sp://videoplayer/v1/error")
    /* JADX INFO: renamed from: c */
    Completable m60462c(@Body q9p0 playerError);

    @POST("sp://videoplayer/v1/advance")
    /* JADX INFO: renamed from: d */
    Completable m60463d(@Body h0c1 reason);
}
