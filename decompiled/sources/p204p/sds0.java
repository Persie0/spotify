package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class sds0 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f208079a;

    public sds0(ContextTrack contextTrack) {
        this.f208079a = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sds0) && wj50.m88271j(this.f208079a, ((sds0) obj).f208079a);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.f208079a;
        if (contextTrack == null) {
            return 0;
        }
        return contextTrack.hashCode();
    }
}
