package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: renamed from: p.dd */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/dd;", "", "", "type", "Lio/reactivex/rxjava3/core/Single;", "Lp/wb30;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_aiplaylist_playlist4serviceimpl-playlist4serviceimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface InterfaceC1774dd {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Single m35688a(InterfaceC1774dd interfaceC1774dd, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveHosts");
        }
        if ((i & 1) != 0) {
            str = "spclient";
        }
        return interfaceC1774dd.m35689b(str);
    }

    @zk00("https://apresolve.spotify.com")
    /* JADX INFO: renamed from: b */
    Single<wb30> m35689b(@hit0("type") String type);
}
