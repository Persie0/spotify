package p204p;

import com.spotify.jam.internal.socialconnect.models.ActiveJoinRequest;
import com.spotify.jam.internal.socialconnect.models.DeviceBroadcastStatus;
import com.spotify.jam.internal.socialconnect.models.RequestQueue;
import com.spotify.jam.internal.socialconnect.models.Session;

/* JADX INFO: loaded from: classes2.dex */
public final class ya60 {

    /* JADX INFO: renamed from: a */
    public final DeviceBroadcastStatus f270815a;

    /* JADX INFO: renamed from: b */
    public final Session f270816b;

    /* JADX INFO: renamed from: c */
    public final ActiveJoinRequest f270817c;

    /* JADX INFO: renamed from: d */
    public final RequestQueue f270818d;

    public ya60(DeviceBroadcastStatus deviceBroadcastStatus, Session session, ActiveJoinRequest activeJoinRequest, RequestQueue requestQueue) {
        this.f270815a = deviceBroadcastStatus;
        this.f270816b = session;
        this.f270817c = activeJoinRequest;
        this.f270818d = requestQueue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya60)) {
            return false;
        }
        ya60 ya60Var = (ya60) obj;
        return wj50.m88271j(this.f270815a, ya60Var.f270815a) && wj50.m88271j(this.f270816b, ya60Var.f270816b) && wj50.m88271j(this.f270817c, ya60Var.f270817c) && wj50.m88271j(this.f270818d, ya60Var.f270818d);
    }

    public final int hashCode() {
        int iHashCode = this.f270815a.hashCode() * 31;
        Session session = this.f270816b;
        int iHashCode2 = (iHashCode + (session == null ? 0 : session.hashCode())) * 31;
        ActiveJoinRequest activeJoinRequest = this.f270817c;
        int iHashCode3 = (iHashCode2 + (activeJoinRequest == null ? 0 : activeJoinRequest.hashCode())) * 31;
        RequestQueue requestQueue = this.f270818d;
        return iHashCode3 + (requestQueue != null ? requestQueue.hashCode() : 0);
    }
}
