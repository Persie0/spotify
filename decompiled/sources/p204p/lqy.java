package p204p;

import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/lqy;", "", "", "feature", "uri", "reason", "Lio/reactivex/rxjava3/core/Completable;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_home_common-common"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface lqy {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Completable m59774b(lqy lqyVar, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendDislike");
        }
        if ((i & 1) != 0) {
            str = "home-promotion";
        }
        return lqyVar.m59776a(str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Completable m59775c(lqy lqyVar, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendNeutral");
        }
        if ((i & 1) != 0) {
            str = "home-promotion";
        }
        return lqyVar.m59777d(str, str2);
    }

    @j3m0("feedback/v1/feedback/{feature}/dislike")
    /* JADX INFO: renamed from: a */
    Completable m59776a(@ubn0("feature") String feature, @hit0("uri") String uri, @hit0("reason") String reason);

    @pem("feedback/v1/feedback/{feature}")
    /* JADX INFO: renamed from: d */
    Completable m59777d(@ubn0("feature") String feature, @hit0("uri") String uri);
}
