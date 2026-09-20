package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import spotify.fandomcollectibles.protos.Sharing$ShareResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lp/gf11;", "", "", "collectibleId", "clientTimeZone", "Lio/reactivex/rxjava3/core/Single;", "Lspotify/fandomcollectibles/protos/Sharing$ShareResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_fandomcollectibles_share-share"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface gf11 {
    @zk00("https://spclient.wg.spotify.com/fandom-collectibles-sharing/share/{collectible_id}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Single<Sharing$ShareResponse> m44562a(@ubn0("collectible_id") String collectibleId, @hit0("tz") String clientTimeZone);
}
