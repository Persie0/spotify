package p204p;

import com.spotify.watchfeed.api.p182v1.WatchFeedRequest;
import com.spotify.watchfeed.api.p182v1.proto.WatchFeedResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lp/tpr;", "", "Lcom/spotify/watchfeed/api/v1/WatchFeedRequest;", "request", "Lcom/spotify/watchfeed/api/v1/proto/WatchFeedResponse;", "a", "(Lcom/spotify/watchfeed/api/v1/WatchFeedRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_accessibility_compose-compose"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface tpr {
    @j3m0("watch-feed-view/v1/feed")
    @rn20({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m81272a(@h4a WatchFeedRequest watchFeedRequest, fbk<? super WatchFeedResponse> fbkVar);
}
