package p204p;

import com.spotify.jam.internal.socialconnect.models.AskToJoinResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class x830 extends l930 {

    /* JADX INFO: renamed from: a */
    public final AskToJoinResponse f259038a;

    public x830(AskToJoinResponse askToJoinResponse) {
        this.f259038a = askToJoinResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x830) && wj50.m88271j(this.f259038a, ((x830) obj).f259038a);
    }

    public final int hashCode() {
        AskToJoinResponse askToJoinResponse = this.f259038a;
        if (askToJoinResponse == null) {
            return 0;
        }
        return askToJoinResponse.hashCode();
    }
}
