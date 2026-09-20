package p204p;

import com.spotify.jam.internal.socialconnect.models.RejectJamJoinResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class j930 extends l930 {

    /* JADX INFO: renamed from: a */
    public final String f110082a;

    /* JADX INFO: renamed from: b */
    public final RejectJamJoinResponse f110083b;

    public j930(String str, RejectJamJoinResponse rejectJamJoinResponse) {
        this.f110082a = str;
        this.f110083b = rejectJamJoinResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j930)) {
            return false;
        }
        j930 j930Var = (j930) obj;
        return wj50.m88271j(this.f110082a, j930Var.f110082a) && wj50.m88271j(this.f110083b, j930Var.f110083b);
    }

    public final int hashCode() {
        int iHashCode = this.f110082a.hashCode() * 31;
        RejectJamJoinResponse rejectJamJoinResponse = this.f110083b;
        return iHashCode + (rejectJamJoinResponse == null ? 0 : rejectJamJoinResponse.hashCode());
    }
}
