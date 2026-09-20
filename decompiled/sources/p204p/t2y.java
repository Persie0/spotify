package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes7.dex */
public final class t2y {

    /* JADX INFO: renamed from: a */
    public final PlayerState f216638a;

    public t2y(PlayerState playerState) {
        this.f216638a = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2y) && wj50.m88271j(this.f216638a, ((t2y) obj).f216638a);
    }

    public final int hashCode() {
        return this.f216638a.hashCode();
    }
}
