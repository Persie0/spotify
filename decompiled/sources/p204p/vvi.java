package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes4.dex */
public final class vvi implements ewi {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f245236a;

    public vvi(ContextTrack contextTrack) {
        this.f245236a = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvi) && wj50.m88271j(this.f245236a, ((vvi) obj).f245236a);
    }

    public final int hashCode() {
        return this.f245236a.hashCode();
    }
}
