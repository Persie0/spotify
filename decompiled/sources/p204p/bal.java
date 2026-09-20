package p204p;

import com.spotify.messages.BetamaxPlaybackSession;

/* JADX INFO: loaded from: classes5.dex */
public final class bal implements yhn0 {

    /* JADX INFO: renamed from: a */
    public final BetamaxPlaybackSession f25234a;

    /* JADX INFO: renamed from: b */
    public final int f25235b;

    public bal(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        this.f25234a = betamaxPlaybackSession;
        this.f25235b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bal)) {
            return false;
        }
        bal balVar = (bal) obj;
        return this.f25234a.equals(balVar.f25234a) && this.f25235b == balVar.f25235b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f25235b) + (this.f25234a.hashCode() * 31);
    }
}
