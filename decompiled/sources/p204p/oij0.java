package p204p;

import com.spotify.notifications.models.preferences.ShowOptInMetadata;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0004H'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m24212d2 = {"Lp/oij0;", "", "", "showId", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "", "d", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "", "", "Lcom/spotify/notifications/models/preferences/ShowOptInMetadata;", "a", "()Lio/reactivex/rxjava3/core/Single;", "Lio/reactivex/rxjava3/core/Completable;", "c", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "b", "src_main_java_com_spotify_notifications_datasource-datasource"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface oij0 {
    @zk00("/newepisodenotifications/v1/optin/settings")
    /* JADX INFO: renamed from: a */
    Single<Map<String, List<ShowOptInMetadata>>> m67050a();

    @pem("/newepisodenotifications/v1/optin")
    /* JADX INFO: renamed from: b */
    Completable m67051b(@hit0("s") String showId);

    @l3m0("/newepisodenotifications/v1/optin")
    /* JADX INFO: renamed from: c */
    Completable m67052c(@hit0("s") String showId);

    @zk00("/newepisodenotifications/v1/optin")
    /* JADX INFO: renamed from: d */
    Single<o2x0<Boolean>> m67053d(@hit0("s") String showId);
}
