package p204p;

import com.spotify.culturalmoments.hubspage.data.HubResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/b1m;", "", "", "id", "", "isReinventFreeEnabled", "timezone", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/culturalmoments/hubspage/data/HubResponse;", "a", "(Ljava/lang/String;ZLjava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_culturalmoments_hubspage-hubspage"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface b1m {
    @zk00("cultural-moment/v1/hub")
    /* JADX INFO: renamed from: a */
    Single<HubResponse> m27914a(@hit0("id") String id, @hit0("userHasRiF") boolean isReinventFreeEnabled, @hit0("clientTimezone") String timezone);
}
