package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: classes8.dex */
public final class bpo0 {

    /* JADX INFO: renamed from: a */
    public final boolean f29555a;

    /* JADX INFO: renamed from: b */
    public final ContextTrack f29556b;

    /* JADX INFO: renamed from: c */
    public final boolean f29557c;

    /* JADX INFO: renamed from: d */
    public final Restrictions f29558d;

    public bpo0(boolean z, ContextTrack contextTrack, boolean z2, Restrictions restrictions) {
        this.f29555a = z;
        this.f29556b = contextTrack;
        this.f29557c = z2;
        this.f29558d = restrictions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpo0)) {
            return false;
        }
        bpo0 bpo0Var = (bpo0) obj;
        return this.f29555a == bpo0Var.f29555a && wj50.m88271j(this.f29556b, bpo0Var.f29556b) && this.f29557c == bpo0Var.f29557c && wj50.m88271j(this.f29558d, bpo0Var.f29558d);
    }

    public final int hashCode() {
        return this.f29558d.hashCode() + s571.m77245d((this.f29556b.hashCode() + (Boolean.hashCode(this.f29555a) * 31)) * 31, 31, this.f29557c);
    }
}
