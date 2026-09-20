package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class nq01 {

    /* JADX INFO: renamed from: a */
    public final PlayerState f157098a;

    /* JADX INFO: renamed from: b */
    public final boolean f157099b;

    public nq01(PlayerState playerState, boolean z) {
        this.f157098a = playerState;
        this.f157099b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq01)) {
            return false;
        }
        nq01 nq01Var = (nq01) obj;
        return wj50.m88271j(this.f157098a, nq01Var.f157098a) && this.f157099b == nq01Var.f157099b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157099b) + (this.f157098a.hashCode() * 31);
    }
}
