package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class x77 {

    /* JADX INFO: renamed from: a */
    public final PlayerState f258840a;

    /* JADX INFO: renamed from: b */
    public final rhj f258841b;

    /* JADX INFO: renamed from: c */
    public final b92 f258842c;

    /* JADX INFO: renamed from: d */
    public final boolean f258843d;

    public x77(PlayerState playerState, rhj rhjVar, b92 b92Var, boolean z) {
        this.f258840a = playerState;
        this.f258841b = rhjVar;
        this.f258842c = b92Var;
        this.f258843d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x77)) {
            return false;
        }
        x77 x77Var = (x77) obj;
        return wj50.m88271j(this.f258840a, x77Var.f258840a) && this.f258841b == x77Var.f258841b && wj50.m88271j(this.f258842c, x77Var.f258842c) && this.f258843d == x77Var.f258843d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258843d) + ((this.f258842c.hashCode() + ((this.f258841b.hashCode() + (this.f258840a.hashCode() * 31)) * 31)) * 31);
    }
}
