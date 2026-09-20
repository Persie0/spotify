package p204p;

import com.spotify.fandomcollectibles.protos.GetCollectibleDetailRequest;
import com.spotify.fandomcollectibles.protos.GetCollectibleDetailResponse;
import com.spotify.fandomcollectibles.protos.GetRequest;
import com.spotify.fandomcollectibles.protos.GetResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/oa51;", "", "Lcom/spotify/fandomcollectibles/protos/GetRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/fandomcollectibles/protos/GetResponse;", "b", "(Lcom/spotify/fandomcollectibles/protos/GetRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/fandomcollectibles/protos/GetCollectibleDetailRequest;", "Lcom/spotify/fandomcollectibles/protos/GetCollectibleDetailResponse;", "a", "(Lcom/spotify/fandomcollectibles/protos/GetCollectibleDetailRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_fandomcollectibles_stories-stories"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface oa51 {
    @j3m0("https://spclient.wg.spotify.com/fandom-collectibles/collectible/detail")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Single<GetCollectibleDetailResponse> m66520a(@h4a GetCollectibleDetailRequest request);

    @j3m0("https://spclient.wg.spotify.com/fandom-collectibles/collectibles")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Single<GetResponse> m66521b(@h4a GetRequest request);
}
