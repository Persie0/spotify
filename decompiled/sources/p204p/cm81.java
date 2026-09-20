package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes10.dex */
public final class cm81 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f39612a;

    /* JADX INFO: renamed from: b */
    public final Integer f39613b;

    /* JADX INFO: renamed from: c */
    public final int f39614c;

    public cm81(ContextTrack contextTrack, Integer num, int i) {
        this.f39612a = contextTrack;
        this.f39613b = num;
        this.f39614c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm81)) {
            return false;
        }
        cm81 cm81Var = (cm81) obj;
        return wj50.m88271j(this.f39612a, cm81Var.f39612a) && wj50.m88271j(this.f39613b, cm81Var.f39613b) && this.f39614c == cm81Var.f39614c;
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.f39612a;
        int iHashCode = (contextTrack == null ? 0 : contextTrack.hashCode()) * 31;
        Integer num = this.f39613b;
        return Integer.hashCode(this.f39614c) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
