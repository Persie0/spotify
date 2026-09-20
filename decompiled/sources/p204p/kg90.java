package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/kg90;", "", "", "requestBody", "Lio/reactivex/rxjava3/core/Single;", "Lp/ng90;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_audiobookpremium_listeninghoursrequest-listeninghoursrequest"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface kg90 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Single m56309a(kg90 kg90Var, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestListeningHours");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        return kg90Var.m56310b(str);
    }

    @j3m0("spotify.familygatedcontent.v1.AudiobookService/RequestListeningHours")
    @rn20({"Accept: application/json", "Content-Type: application/json"})
    /* JADX INFO: renamed from: b */
    Single<ng90> m56310b(@h4a String requestBody);
}
