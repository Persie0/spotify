package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/d93;", "", "", "playlistId", "sharedEntityUri", "Lio/reactivex/rxjava3/core/Single;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_listuxplatformconsumers_algotorial_preloaders_algosharing-algosharing"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface d93 {
    @j3m0("algotorial-sharing-service/v1/shared")
    /* JADX INFO: renamed from: a */
    Single<String> m35306a(@hit0("playlistId") String playlistId, @hit0("sharedEntityUri") String sharedEntityUri);
}
