package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class ik21 {

    /* JADX INFO: renamed from: a */
    public final PlayerState f102953a;

    /* JADX INFO: renamed from: b */
    public final am81 f102954b;

    public ik21(PlayerState playerState, am81 am81Var) {
        this.f102953a = playerState;
        this.f102954b = am81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik21)) {
            return false;
        }
        ik21 ik21Var = (ik21) obj;
        return wj50.m88271j(this.f102953a, ik21Var.f102953a) && wj50.m88271j(this.f102954b, ik21Var.f102954b);
    }

    public final int hashCode() {
        return this.f102954b.hashCode() + (this.f102953a.hashCode() * 31);
    }
}
