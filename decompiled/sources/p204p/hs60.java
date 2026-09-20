package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes10.dex */
public final class hs60 {

    /* JADX INFO: renamed from: a */
    public final PlayerState f94617a;

    /* JADX INFO: renamed from: b */
    public final boolean f94618b;

    /* JADX INFO: renamed from: c */
    public final boolean f94619c;

    /* JADX INFO: renamed from: d */
    public final boolean f94620d;

    public hs60(PlayerState playerState, boolean z, boolean z2, boolean z3) {
        this.f94617a = playerState;
        this.f94618b = z;
        this.f94619c = z2;
        this.f94620d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs60)) {
            return false;
        }
        hs60 hs60Var = (hs60) obj;
        return wj50.m88271j(this.f94617a, hs60Var.f94617a) && this.f94618b == hs60Var.f94618b && this.f94619c == hs60Var.f94619c && this.f94620d == hs60Var.f94620d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94620d) + s571.m77245d(s571.m77245d(this.f94617a.hashCode() * 31, 31, this.f94618b), 31, this.f94619c);
    }
}
