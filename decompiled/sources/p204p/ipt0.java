package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class ipt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f104555a;

    /* JADX INFO: renamed from: b */
    public final int f104556b;

    public ipt0(int i, ContextTrack contextTrack) {
        this.f104555a = contextTrack;
        this.f104556b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipt0)) {
            return false;
        }
        ipt0 ipt0Var = (ipt0) obj;
        return wj50.m88271j(this.f104555a, ipt0Var.f104555a) && this.f104556b == ipt0Var.f104556b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104556b) + (this.f104555a.hashCode() * 31);
    }
}
