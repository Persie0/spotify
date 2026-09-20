package p204p;

import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: classes.dex */
public final class xtx {

    /* JADX INFO: renamed from: a */
    public final Object f265952a;

    /* JADX INFO: renamed from: b */
    public final int f265953b;

    public xtx(int i, pre0 pre0Var) {
        this.f265952a = pre0Var;
        this.f265953b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xtx)) {
            return false;
        }
        xtx xtxVar = (xtx) obj;
        return this.f265952a == xtxVar.f265952a && this.f265953b == xtxVar.f265953b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f265952a) * AudioDriver.SPOTIFY_MAX_VOLUME) + this.f265953b;
    }
}
