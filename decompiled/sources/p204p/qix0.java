package p204p;

import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001Je\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJe\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m24212d2 = {"Lp/qix0;", "", "", "uuid", "messageId", "", "timestamp", "appDeviceId", "targetUri", "osName", "osVersion", "appState", "Lio/reactivex/rxjava3/core/Completable;", "a", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "Lp/idw;", "error", "c", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/idw;)Lio/reactivex/rxjava3/core/Completable;", "Lp/j721;", "body", "b", "(Lp/j721;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_notifications_notifications-notifications"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface qix0 {
    @j3m0("robin/v1/log-push-received-event")
    @rn20({"Accept: application/json", "Content-Type: application/json"})
    /* JADX INFO: renamed from: a */
    Completable m72886a(@hit0("uuid") String uuid, @hit0("message_id") String messageId, @hit0("timestamp_ms") long timestamp, @hit0("app_device_id") String appDeviceId, @hit0("target_uri") String targetUri, @hit0("os_name") String osName, @hit0("os_version") String osVersion, @hit0("app_state") String appState);

    @j3m0("robin/v1/log-silent-push-received-event")
    @rn20({"Accept: application/json", "Content-Type: application/json"})
    /* JADX INFO: renamed from: b */
    Completable m72887b(@h4a j721 body);

    @j3m0("robin/v1/log-push-display-event")
    @rn20({"Accept: application/json", "Content-Type: application/json"})
    /* JADX INFO: renamed from: c */
    Completable m72888c(@hit0("uuid") String uuid, @hit0("message_id") String messageId, @hit0("timestamp_ms") long timestamp, @hit0("app_device_id") String appDeviceId, @hit0("target_uri") String targetUri, @hit0("os_name") String osName, @hit0("os_version") String osVersion, @hit0("error") idw error);
}
