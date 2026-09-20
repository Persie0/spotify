package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Lp/jr9;", "", "", "ownUsername", "blockedUsername", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "Lp/w2a1;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_podcastinteractivity_contextmenuimpl-contextmenuimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface jr9 {
    @j3m0("socialgraph/v4/{ownUsername}/is-blocking/{blockedUsername}")
    /* JADX INFO: renamed from: a */
    Single<o2x0<w2a1>> m54179a(@ubn0("ownUsername") String ownUsername, @ubn0("blockedUsername") String blockedUsername);
}
