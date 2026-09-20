package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes10.dex */
public final class lea0 {

    /* JADX INFO: renamed from: a */
    public final String f132497a;

    /* JADX INFO: renamed from: b */
    public final boolean f132498b;

    /* JADX INFO: renamed from: c */
    public final String f132499c;

    /* JADX INFO: renamed from: d */
    public final ContextTrack f132500d;

    public lea0(String str, boolean z, String str2, ContextTrack contextTrack) {
        this.f132497a = str;
        this.f132498b = z;
        this.f132499c = str2;
        this.f132500d = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lea0)) {
            return false;
        }
        lea0 lea0Var = (lea0) obj;
        return wj50.m88271j(this.f132497a, lea0Var.f132497a) && this.f132498b == lea0Var.f132498b && wj50.m88271j(this.f132499c, lea0Var.f132499c) && wj50.m88271j(this.f132500d, lea0Var.f132500d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(this.f132497a.hashCode() * 31, 31, this.f132498b), 31, this.f132499c);
        ContextTrack contextTrack = this.f132500d;
        return iM77243b + (contextTrack == null ? 0 : contextTrack.hashCode());
    }
}
