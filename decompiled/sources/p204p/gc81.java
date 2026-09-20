package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class gc81 {

    /* JADX INFO: renamed from: a */
    public final PlayerState f78511a;

    /* JADX INFO: renamed from: b */
    public final boolean f78512b;

    /* JADX INFO: renamed from: c */
    public final boolean f78513c;

    public gc81(PlayerState playerState, boolean z, boolean z2) {
        this.f78511a = playerState;
        this.f78512b = z;
        this.f78513c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc81)) {
            return false;
        }
        gc81 gc81Var = (gc81) obj;
        return wj50.m88271j(this.f78511a, gc81Var.f78511a) && this.f78512b == gc81Var.f78512b && this.f78513c == gc81Var.f78513c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78513c) + s571.m77245d(this.f78511a.hashCode() * 31, 31, this.f78512b);
    }
}
