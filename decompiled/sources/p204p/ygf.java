package p204p;

import com.spotify.userinteractivityservice.usercomments.p178v1.proto.GetCommentCardResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class ygf {

    /* JADX INFO: renamed from: a */
    public final Object f272572a;

    /* JADX INFO: renamed from: b */
    public final long f272573b;

    public ygf(GetCommentCardResponse getCommentCardResponse, long j) {
        this.f272572a = getCommentCardResponse;
        this.f272573b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygf)) {
            return false;
        }
        ygf ygfVar = (ygf) obj;
        return wj50.m88271j(this.f272572a, ygfVar.f272572a) && this.f272573b == ygfVar.f272573b;
    }

    public final int hashCode() {
        Object obj = this.f272572a;
        return Long.hashCode(this.f272573b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
