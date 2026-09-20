package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/t3v;", "", "", "stationName", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "Lp/f780;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "setTag", "Lp/r780;", "b", "src_main_java_com_spotify_endless_playerimpl-playerimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface t3v {
    @zk00("endless-api/v1/session/resolve")
    @rn20({"Content-Type: application/json", "Accept: application/json"})
    /* JADX INFO: renamed from: a */
    Single<o2x0<f780>> m80020a(@hit0("station") String stationName);

    @j3m0("lexicon-session-provider/sessions")
    @rn20({"Content-Type: application/json", "Accept: application/json"})
    /* JADX INFO: renamed from: b */
    Single<o2x0<r780>> m80021b(@hit0("setTag") String setTag);
}
