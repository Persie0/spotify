package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes10.dex */
public final class z1y {

    /* JADX INFO: renamed from: a */
    public final PlayerState f278437a;

    /* JADX INFO: renamed from: b */
    public final boolean f278438b;

    /* JADX INFO: renamed from: c */
    public final boolean f278439c;

    /* JADX INFO: renamed from: d */
    public final boolean f278440d;

    /* JADX INFO: renamed from: e */
    public final c92 f278441e;

    /* JADX INFO: renamed from: f */
    public final boolean f278442f;

    /* JADX INFO: renamed from: g */
    public final Integer f278443g;

    public z1y(PlayerState playerState, boolean z, boolean z2, boolean z3, c92 c92Var, boolean z4, Integer num) {
        this.f278437a = playerState;
        this.f278438b = z;
        this.f278439c = z2;
        this.f278440d = z3;
        this.f278441e = c92Var;
        this.f278442f = z4;
        this.f278443g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1y)) {
            return false;
        }
        z1y z1yVar = (z1y) obj;
        return wj50.m88271j(this.f278437a, z1yVar.f278437a) && this.f278438b == z1yVar.f278438b && this.f278439c == z1yVar.f278439c && this.f278440d == z1yVar.f278440d && this.f278441e.equals(z1yVar.f278441e) && this.f278442f == z1yVar.f278442f && wj50.m88271j(this.f278443g, z1yVar.f278443g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f278441e.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(this.f278437a.hashCode() * 31, 31, this.f278438b), 31, this.f278439c), 31, this.f278440d)) * 31, 31, this.f278442f);
        Integer num = this.f278443g;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
