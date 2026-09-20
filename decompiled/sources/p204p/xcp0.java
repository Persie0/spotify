package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes9.dex */
public final class xcp0 {

    /* JADX INFO: renamed from: a */
    public final PlayerState f260274a;

    /* JADX INFO: renamed from: b */
    public final r431 f260275b;

    /* JADX INFO: renamed from: c */
    public final rhj f260276c;

    /* JADX INFO: renamed from: d */
    public final boolean f260277d;

    public xcp0(PlayerState playerState, r431 r431Var, rhj rhjVar, boolean z) {
        this.f260274a = playerState;
        this.f260275b = r431Var;
        this.f260276c = rhjVar;
        this.f260277d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcp0)) {
            return false;
        }
        xcp0 xcp0Var = (xcp0) obj;
        return wj50.m88271j(this.f260274a, xcp0Var.f260274a) && this.f260275b == xcp0Var.f260275b && this.f260276c == xcp0Var.f260276c && this.f260277d == xcp0Var.f260277d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260277d) + ((this.f260276c.hashCode() + ((this.f260275b.hashCode() + (this.f260274a.hashCode() * 31)) * 31)) * 31);
    }
}
