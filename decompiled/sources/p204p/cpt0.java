package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class cpt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final int f40642a;

    /* JADX INFO: renamed from: b */
    public final ContextTrack f40643b;

    public cpt0(int i, ContextTrack contextTrack) {
        this.f40642a = i;
        this.f40643b = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpt0)) {
            return false;
        }
        cpt0 cpt0Var = (cpt0) obj;
        return this.f40642a == cpt0Var.f40642a && wj50.m88271j(this.f40643b, cpt0Var.f40643b);
    }

    public final int hashCode() {
        return this.f40643b.hashCode() + (Integer.hashCode(this.f40642a) * 31);
    }
}
