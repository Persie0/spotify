package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class kpt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f125124a;

    /* JADX INFO: renamed from: b */
    public final boolean f125125b;

    public kpt0(ContextTrack contextTrack, boolean z) {
        this.f125124a = contextTrack;
        this.f125125b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpt0)) {
            return false;
        }
        kpt0 kpt0Var = (kpt0) obj;
        return wj50.m88271j(this.f125124a, kpt0Var.f125124a) && this.f125125b == kpt0Var.f125125b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125125b) + (this.f125124a.hashCode() * 31);
    }
}
