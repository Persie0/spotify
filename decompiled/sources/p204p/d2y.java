package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes10.dex */
public final class d2y {

    /* JADX INFO: renamed from: a */
    public final PlayerState f44685a;

    /* JADX INFO: renamed from: b */
    public final boolean f44686b;

    /* JADX INFO: renamed from: c */
    public final boolean f44687c;

    public d2y(PlayerState playerState, boolean z, boolean z2) {
        this.f44685a = playerState;
        this.f44686b = z;
        this.f44687c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2y)) {
            return false;
        }
        d2y d2yVar = (d2y) obj;
        return wj50.m88271j(this.f44685a, d2yVar.f44685a) && this.f44686b == d2yVar.f44686b && this.f44687c == d2yVar.f44687c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44687c) + s571.m77245d(this.f44685a.hashCode() * 31, 31, this.f44686b);
    }
}
