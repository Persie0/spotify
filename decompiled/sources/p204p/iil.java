package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lp/iil;", "", "", "artistId", "Lio/reactivex/rxjava3/core/Single;", "Lp/hil;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "b", "src_main_java_com_spotify_artist_creatorartist-creatorartist"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface iil {
    @zk00("creatorabout/v0/artist/{artistId}/about?fields=artist,listenerCount,monthlyListenerRank,isVerified")
    /* JADX INFO: renamed from: a */
    Single<hil> m50734a(@ubn0("artistId") String artistId);

    @zk00("creatorabout/v0/artist/{artistId}/about?fields=artist,listenerCount,monthlyListenerRank,isVerified,artistFacts")
    /* JADX INFO: renamed from: b */
    Single<hil> m50735b(@ubn0("artistId") String artistId);
}
