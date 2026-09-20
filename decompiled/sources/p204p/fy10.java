package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JM\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/fy10;", "", "", "uri", "locale", "timeZone", "timeFormat", "feature", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_liveroom_commonimpl-commonimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface fy10 {
    @zk00("greenroom/v1/rooms")
    /* JADX INFO: renamed from: a */
    Single<o2x0<Object>> m43059a(@hit0("uri") String uri, @hit0("locale") String locale, @hit0("timezone") String timeZone, @hit0("timeFormat") String timeFormat, @hit0("feature") String feature);
}
