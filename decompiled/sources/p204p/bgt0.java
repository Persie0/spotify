package p204p;

import com.spotify.notifications.models.registration.PushRegisterTokenBody;
import com.spotify.notifications.models.registration.PushUnregisterTokenBody;
import io.reactivex.rxjava3.core.Completable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/bgt0;", "", "Lcom/spotify/notifications/models/registration/PushRegisterTokenBody;", "registrationData", "Lio/reactivex/rxjava3/core/Completable;", "b", "(Lcom/spotify/notifications/models/registration/PushRegisterTokenBody;)Lio/reactivex/rxjava3/core/Completable;", "", "Lcom/spotify/notifications/models/registration/PushUnregisterTokenBody;", "unregisterData", "a", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_notifications_datasource-datasource"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface bgt0 {
    @j3m0("pushka-tokens/delete")
    /* JADX INFO: renamed from: a */
    Completable m29147a(@h4a List<PushUnregisterTokenBody> unregisterData);

    @j3m0("pushka-tokens/register/v3")
    /* JADX INFO: renamed from: b */
    Completable m29148b(@h4a PushRegisterTokenBody registrationData);
}
