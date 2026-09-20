package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes2.dex */
public final class k0p0 {

    /* JADX INFO: renamed from: a */
    public final PlayerState f118132a;

    /* JADX INFO: renamed from: b */
    public final xul0 f118133b;

    /* JADX INFO: renamed from: c */
    public final xul0 f118134c;

    public k0p0(PlayerState playerState, xul0 xul0Var, xul0 xul0Var2) {
        this.f118132a = playerState;
        this.f118133b = xul0Var;
        this.f118134c = xul0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0p0)) {
            return false;
        }
        k0p0 k0p0Var = (k0p0) obj;
        return wj50.m88271j(this.f118132a, k0p0Var.f118132a) && wj50.m88271j(this.f118133b, k0p0Var.f118133b) && wj50.m88271j(this.f118134c, k0p0Var.f118134c);
    }

    public final int hashCode() {
        return this.f118134c.hashCode() + ((this.f118133b.hashCode() + (this.f118132a.hashCode() * 31)) * 31);
    }
}
