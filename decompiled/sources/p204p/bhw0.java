package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class bhw0 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f27251a;

    /* JADX INFO: renamed from: b */
    public final Boolean f27252b;

    /* JADX INFO: renamed from: c */
    public final fb3 f27253c;

    public bhw0(ContextTrack contextTrack, Boolean bool, fb3 fb3Var) {
        this.f27251a = contextTrack;
        this.f27252b = bool;
        this.f27253c = fb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhw0)) {
            return false;
        }
        bhw0 bhw0Var = (bhw0) obj;
        return wj50.m88271j(this.f27251a, bhw0Var.f27251a) && wj50.m88271j(this.f27252b, bhw0Var.f27252b) && wj50.m88271j(this.f27253c, bhw0Var.f27253c);
    }

    public final int hashCode() {
        int iHashCode = this.f27251a.hashCode() * 31;
        Boolean bool = this.f27252b;
        return this.f27253c.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }
}
