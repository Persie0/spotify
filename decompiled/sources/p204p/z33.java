package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes3.dex */
public final class z33 {

    /* JADX INFO: renamed from: a */
    public final qli0 f278746a;

    /* JADX INFO: renamed from: b */
    public final PlayerState f278747b;

    /* JADX INFO: renamed from: c */
    public final boolean f278748c;

    /* JADX INFO: renamed from: d */
    public final o8l0 f278749d;

    public z33(qli0 qli0Var, PlayerState playerState, boolean z, o8l0 o8l0Var) {
        this.f278746a = qli0Var;
        this.f278747b = playerState;
        this.f278748c = z;
        this.f278749d = o8l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z33)) {
            return false;
        }
        z33 z33Var = (z33) obj;
        return this.f278746a == z33Var.f278746a && wj50.m88271j(this.f278747b, z33Var.f278747b) && this.f278748c == z33Var.f278748c && wj50.m88271j(this.f278749d, z33Var.f278749d);
    }

    public final int hashCode() {
        return this.f278749d.hashCode() + s571.m77245d((this.f278747b.hashCode() + (this.f278746a.hashCode() * 31)) * 31, 31, this.f278748c);
    }
}
