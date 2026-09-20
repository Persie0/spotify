package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes.dex */
public final class m0s implements n0s {

    /* JADX INFO: renamed from: a */
    public final PlayerState f138730a;

    public m0s(PlayerState playerState) {
        this.f138730a = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0s) && wj50.m88271j(this.f138730a, ((m0s) obj).f138730a);
    }

    public final int hashCode() {
        return this.f138730a.hashCode();
    }
}
