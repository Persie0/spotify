package p204p;

import com.spotify.gander.p072v2.proto.ResetLatestCursorRequest;
import com.spotify.gander.p072v2.proto.ResetLatestCursorResponse;
import com.spotify.gander.p072v2.proto.UpdateNotificationStateRequest;
import com.spotify.gander.p072v2.proto.UpdateNotificationStateResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\b\u0001\u0010\f\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m24212d2 = {"Lp/vxe1;", "", "", "locale", "cursor", "", "limit", "Lio/reactivex/rxjava3/core/Single;", "Lp/fsy;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/gander/v2/proto/ResetLatestCursorRequest;", "request", "Lcom/spotify/gander/v2/proto/ResetLatestCursorResponse;", "b", "(Lcom/spotify/gander/v2/proto/ResetLatestCursorRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/gander/v2/proto/UpdateNotificationStateRequest;", "Lcom/spotify/gander/v2/proto/UpdateNotificationStateResponse;", "e", "(Lcom/spotify/gander/v2/proto/UpdateNotificationStateRequest;)Lio/reactivex/rxjava3/core/Single;", "Lp/ity;", "d", "()Lio/reactivex/rxjava3/core/Single;", "notificationStorageId", "Lp/bsy;", "a", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_yourupdates_data-data"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface vxe1 {
    /* JADX INFO: renamed from: c */
    static /* synthetic */ Single m86651c(vxe1 vxe1Var, String str, String str2, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchNotifications");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return vxe1Var.m86656f(str, str2, num);
    }

    @zk00("gander/v2/notification/{notification_storage_id}/actions")
    /* JADX INFO: renamed from: a */
    Object m86652a(@ubn0("notification_storage_id") String str, fbk<? super bsy> fbkVar);

    @j3m0("gander/v2/ResetLatestCursor")
    @rn20({"Accept: application/x-protobuf", obr.f163698c})
    /* JADX INFO: renamed from: b */
    Single<ResetLatestCursorResponse> m86653b(@h4a ResetLatestCursorRequest request);

    @zk00("gander/v2/GetUserHasUnreadNotification")
    /* JADX INFO: renamed from: d */
    Single<ity> m86654d();

    @j3m0("gander/v2/UpdateNotificationState")
    @rn20({"Accept: application/x-protobuf", obr.f163698c})
    /* JADX INFO: renamed from: e */
    Single<UpdateNotificationStateResponse> m86655e(@h4a UpdateNotificationStateRequest request);

    @zk00("gander/v2/GetNotifications")
    /* JADX INFO: renamed from: f */
    Single<fsy> m86656f(@hit0("locale") String locale, @hit0("cursor") String cursor, @hit0("limit") Integer limit);
}
