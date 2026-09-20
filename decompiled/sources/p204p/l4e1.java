package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes2.dex */
public final class l4e1 {

    /* JADX INFO: renamed from: a */
    public final h4e1 f129666a;

    /* JADX INFO: renamed from: b */
    public final PlayerState f129667b;

    /* JADX INFO: renamed from: c */
    public final boolean f129668c;

    public l4e1(h4e1 h4e1Var, PlayerState playerState, boolean z) {
        this.f129666a = h4e1Var;
        this.f129667b = playerState;
        this.f129668c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4e1)) {
            return false;
        }
        l4e1 l4e1Var = (l4e1) obj;
        return wj50.m88271j(this.f129666a, l4e1Var.f129666a) && wj50.m88271j(this.f129667b, l4e1Var.f129667b) && this.f129668c == l4e1Var.f129668c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129668c) + ((this.f129667b.hashCode() + (this.f129666a.hashCode() * 31)) * 31);
    }
}
