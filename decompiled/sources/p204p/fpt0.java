package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class fpt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final int f71999a;

    /* JADX INFO: renamed from: b */
    public final ContextTrack f72000b;

    /* JADX INFO: renamed from: c */
    public final mtt0 f72001c;

    public fpt0(int i, ContextTrack contextTrack, mtt0 mtt0Var) {
        this.f71999a = i;
        this.f72000b = contextTrack;
        this.f72001c = mtt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpt0)) {
            return false;
        }
        fpt0 fpt0Var = (fpt0) obj;
        return this.f71999a == fpt0Var.f71999a && wj50.m88271j(this.f72000b, fpt0Var.f72000b) && wj50.m88271j(this.f72001c, fpt0Var.f72001c);
    }

    public final int hashCode() {
        return this.f72001c.hashCode() + ((this.f72000b.hashCode() + (Integer.hashCode(this.f71999a) * 31)) * 31);
    }
}
