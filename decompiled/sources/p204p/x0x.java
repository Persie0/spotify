package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class x0x implements z0x {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f257006a;

    /* JADX INFO: renamed from: b */
    public final Throwable f257007b;

    public x0x(ContextTrack contextTrack, Throwable th) {
        this.f257006a = contextTrack;
        this.f257007b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0x)) {
            return false;
        }
        x0x x0xVar = (x0x) obj;
        return this.f257006a.equals(x0xVar.f257006a) && wj50.m88271j(this.f257007b, x0xVar.f257007b);
    }

    public final int hashCode() {
        return this.f257007b.hashCode() + (this.f257006a.hashCode() * 961);
    }
}
