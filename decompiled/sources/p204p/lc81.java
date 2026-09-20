package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class lc81 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f131873a;

    /* JADX INFO: renamed from: b */
    public final ContextTrack f131874b;

    /* JADX INFO: renamed from: c */
    public final ContextTrack f131875c;

    public lc81(ContextTrack contextTrack, ContextTrack contextTrack2, ContextTrack contextTrack3) {
        this.f131873a = contextTrack;
        this.f131874b = contextTrack2;
        this.f131875c = contextTrack3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc81)) {
            return false;
        }
        lc81 lc81Var = (lc81) obj;
        return wj50.m88271j(this.f131873a, lc81Var.f131873a) && wj50.m88271j(this.f131874b, lc81Var.f131874b) && wj50.m88271j(this.f131875c, lc81Var.f131875c);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.f131873a;
        int iHashCode = (this.f131874b.hashCode() + ((contextTrack == null ? 0 : contextTrack.hashCode()) * 31)) * 31;
        ContextTrack contextTrack2 = this.f131875c;
        return iHashCode + (contextTrack2 != null ? contextTrack2.hashCode() : 0);
    }
}
