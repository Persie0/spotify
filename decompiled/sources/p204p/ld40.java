package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/ld40;", "", "Lp/euw0;", "requestBody", "Lio/reactivex/rxjava3/core/Single;", "Lp/pd40;", "a", "(Lp/euw0;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_profile_editprofile-editprofile"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ld40 {
    @j3m0("/v4/user-profile")
    @rn20({"Content-Encoding: identity"})
    /* JADX INFO: renamed from: a */
    Single<pd40> m58732a(@h4a euw0 requestBody);
}
