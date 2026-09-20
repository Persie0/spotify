package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class cmc {

    /* JADX INFO: renamed from: a */
    public final emc f39643a;

    /* JADX INFO: renamed from: b */
    public final ContextTrack f39644b;

    /* JADX INFO: renamed from: c */
    public final d1s f39645c;

    /* JADX INFO: renamed from: d */
    public final wb50 f39646d;

    public cmc(emc emcVar, ContextTrack contextTrack, d1s d1sVar, wb50 wb50Var) {
        this.f39643a = emcVar;
        this.f39644b = contextTrack;
        this.f39645c = d1sVar;
        this.f39646d = wb50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmc)) {
            return false;
        }
        cmc cmcVar = (cmc) obj;
        return wj50.m88271j(this.f39643a, cmcVar.f39643a) && wj50.m88271j(this.f39644b, cmcVar.f39644b) && wj50.m88271j(this.f39645c, cmcVar.f39645c) && wj50.m88271j(this.f39646d, cmcVar.f39646d);
    }

    public final int hashCode() {
        return this.f39646d.hashCode() + ((this.f39645c.hashCode() + ((this.f39644b.hashCode() + (this.f39643a.hashCode() * 31)) * 31)) * 31);
    }
}
