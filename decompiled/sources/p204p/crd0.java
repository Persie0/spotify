package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes2.dex */
public final class crd0 {

    /* JADX INFO: renamed from: a */
    public final PlayerState f41268a;

    /* JADX INFO: renamed from: b */
    public final Integer f41269b;

    public crd0(PlayerState playerState, Integer num) {
        this.f41268a = playerState;
        this.f41269b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crd0)) {
            return false;
        }
        crd0 crd0Var = (crd0) obj;
        return wj50.m88271j(this.f41268a, crd0Var.f41268a) && wj50.m88271j(this.f41269b, crd0Var.f41269b);
    }

    public final int hashCode() {
        PlayerState playerState = this.f41268a;
        int iHashCode = (playerState == null ? 0 : playerState.hashCode()) * 31;
        Integer num = this.f41269b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
