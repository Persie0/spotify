package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes9.dex */
public final class q1y {

    /* JADX INFO: renamed from: a */
    public final PlayerState f184428a;

    /* JADX INFO: renamed from: b */
    public final boolean f184429b;

    public q1y(PlayerState playerState, boolean z) {
        this.f184428a = playerState;
        this.f184429b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1y)) {
            return false;
        }
        q1y q1yVar = (q1y) obj;
        return wj50.m88271j(this.f184428a, q1yVar.f184428a) && this.f184429b == q1yVar.f184429b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184429b) + (this.f184428a.hashCode() * 31);
    }
}
