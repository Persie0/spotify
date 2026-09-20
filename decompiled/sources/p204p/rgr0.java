package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes2.dex */
public final class rgr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f199002a;

    /* JADX INFO: renamed from: b */
    public final by50 f199003b;

    /* JADX INFO: renamed from: c */
    public final api f199004c;

    /* JADX INFO: renamed from: d */
    public final PlayerState f199005d;

    public rgr0(boolean z, by50 by50Var, api apiVar, PlayerState playerState) {
        this.f199002a = z;
        this.f199003b = by50Var;
        this.f199004c = apiVar;
        this.f199005d = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgr0)) {
            return false;
        }
        rgr0 rgr0Var = (rgr0) obj;
        return this.f199002a == rgr0Var.f199002a && wj50.m88271j(this.f199003b, rgr0Var.f199003b) && wj50.m88271j(this.f199004c, rgr0Var.f199004c) && wj50.m88271j(this.f199005d, rgr0Var.f199005d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f199002a) * 31;
        by50 by50Var = this.f199003b;
        int iHashCode2 = (iHashCode + (by50Var == null ? 0 : by50Var.hashCode())) * 31;
        api apiVar = this.f199004c;
        return this.f199005d.hashCode() + ((iHashCode2 + (apiVar != null ? apiVar.hashCode() : 0)) * 31);
    }
}
