package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class l4k {

    /* JADX INFO: renamed from: a */
    public final String f129723a;

    /* JADX INFO: renamed from: b */
    public final PlayerState f129724b;

    public l4k(PlayerState playerState, String str) {
        this.f129723a = str;
        this.f129724b = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4k)) {
            return false;
        }
        l4k l4kVar = (l4k) obj;
        return wj50.m88271j(this.f129723a, l4kVar.f129723a) && wj50.m88271j(this.f129724b, l4kVar.f129724b);
    }

    public final int hashCode() {
        return this.f129724b.hashCode() + (this.f129723a.hashCode() * 31);
    }
}
