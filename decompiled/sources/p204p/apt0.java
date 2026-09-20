package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class apt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f18011a;

    public apt0(ContextTrack contextTrack) {
        this.f18011a = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apt0) && wj50.m88271j(this.f18011a, ((apt0) obj).f18011a);
    }

    public final int hashCode() {
        return this.f18011a.hashCode();
    }
}
