package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes6.dex */
public final class nc81 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f152461a;

    /* JADX INFO: renamed from: b */
    public final boolean f152462b;

    /* JADX INFO: renamed from: c */
    public final boolean f152463c;

    public nc81(ContextTrack contextTrack, boolean z, boolean z2) {
        this.f152461a = contextTrack;
        this.f152462b = z;
        this.f152463c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc81)) {
            return false;
        }
        nc81 nc81Var = (nc81) obj;
        return wj50.m88271j(this.f152461a, nc81Var.f152461a) && this.f152462b == nc81Var.f152462b && this.f152463c == nc81Var.f152463c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152463c) + s571.m77245d(this.f152461a.hashCode() * 31, 31, this.f152462b);
    }
}
