package p204p;

import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: classes11.dex */
public final class wtx {

    /* JADX INFO: renamed from: a */
    public final Object f255028a;

    /* JADX INFO: renamed from: b */
    public final int f255029b;

    public wtx(Object obj, int i) {
        this.f255028a = obj;
        this.f255029b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wtx)) {
            return false;
        }
        wtx wtxVar = (wtx) obj;
        return this.f255028a == wtxVar.f255028a && this.f255029b == wtxVar.f255029b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f255028a) * AudioDriver.SPOTIFY_MAX_VOLUME) + this.f255029b;
    }
}
